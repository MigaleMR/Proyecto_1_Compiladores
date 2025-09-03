/*
 * @(#)IDECompiler.java                      2.1 2003/10/07
 *
 * Copyright (C) 1999, 2003 D.A. Watt and D.F. Brown
 * Dept. of Computing Science, University of Glasgow, Glasgow G12 8QQ Scotland
 * and School of Computer and Math Sciences, The Robert Gordon University,
 * St. Andrew Street, Aberdeen AB25 1HG, Scotland.
 * All rights reserved.
 *
 * This software is provided free for educational use only. It may
 * not be used for commercial purposes without the prior written permission
 * of the authors.
 *
 * Version para curso Compiladores 2025 - IDE version
 *
 */

package Triangle;

import Triangle.AbstractSyntaxTrees.Program;
import Triangle.CodeGenerator.Encoder;
import Triangle.ContextualAnalyzer.Checker;
import Triangle.SyntacticAnalyzer.Parser;
import Triangle.SyntacticAnalyzer.Scanner;
import Triangle.SyntacticAnalyzer.SourceFile;
import Triangle.TreeDrawer.Drawer;

/**
 * The compiler driver class for the Triangle IDE.
 *
 * @version		2.1 7 Oct 2003
 * @author		Deryck F. Brown
 */
public class IDECompiler {

    private Scanner scanner;
    private Parser parser;
    private Checker checker;
    private Encoder encoder;
    private IDEReporter reporter;
    private Drawer drawer;

    /** The AST representing the source program. */
    private Program theAST;

    public IDECompiler() {
        // Constructor for IDE use
    }

    /**
     * Compile the source program to TAM machine code for IDE (simplified version).
     *
     * @param	sourceName	the name of the file containing the source program.
     * @return	true iff the source program is free of compile-time errors.
     */
    public boolean compileProgram(String sourceName) {
        String objectName = sourceName.replace(".tri", ".tam");
        return compileProgram(sourceName, objectName, false, false);
    }

    /**
     * Compile the source program to TAM machine code for IDE.
     *
     * @param	sourceName	the name of the file containing the
     *				source program.
     * @param	objectName	the name of the file containing the
     *				object program.
     * @param	showingAST	true iff the AST is to be displayed after
     *				contextual analysis.
     * @param	showingTable	true iff the object description details are to
     *				be displayed during code generation.
     * @return	true iff the source program is free of compile-time errors,
     *          otherwise false.
     */
    public boolean compileProgram(String sourceName, String objectName,
                                  boolean showingAST, boolean showingTable) {

        System.out.println("********** " +
                           "Triangle Compiler (Java Version 2.1)" +
                           " **********");

        System.out.println("Syntactic Analysis ...");
        SourceFile source = new SourceFile(sourceName);

        if (source == null) {
            System.out.println("Can't access source file " + sourceName);
            return false;
        }

        scanner  = new Scanner(source);
        reporter = new IDEReporter();
        parser   = new Parser(scanner, reporter);
        checker  = new Checker(reporter);
        encoder  = new Encoder(reporter);
        drawer   = new Drawer();

        // scanner.enableDebugging();
        theAST = parser.parseProgram();				// 1st pass
        if (reporter.numErrors == 0) {
            System.out.println ("Contextual Analysis ...");
            checker.check(theAST);				// 2nd pass
            if (showingAST) {
                drawer.draw(theAST);
            }
            if (reporter.numErrors == 0) {
                System.out.println("Code Generation ...");
                encoder.encodeRun(theAST, showingTable);	// 3rd pass
            }
        }

        boolean successful = (reporter.numErrors == 0);
        if (successful) {
            encoder.saveObjectProgram(objectName);
            System.out.println("Compilation was successful.");
        } else {
            System.out.println("Compilation was unsuccessful.");
        }
        return successful;
    }

    /**
     * Get the syntax tree for the IDE.
     * @return the AST or null if compilation failed
     */
    public Program getAST() {
        return theAST;
    }

    /**
     * Get the error reporter for the IDE.
     * @return the error reporter
     */
    public IDEReporter getErrorReporter() {
        return reporter;
    }

    /**
     * Get the position of the first error.
     * @return the line number of the first error, or -1 if no errors
     */
    public int getErrorPosition() {
        return reporter != null ? reporter.getErrorPosition() : -1;
    }
}
