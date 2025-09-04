/*
 * @(#)IDECompiler.java                2.1 2003/10/07
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
 */

package Triangle;

import Triangle.AbstractSyntaxTrees.Program;

/**
 * The Triangle IDE compiler.
 *
 * @version 2.1 7 Oct 2003
 * @author Deryck F. Brown
 */
public class IDECompiler {

  // <editor-fold defaultstate="collapsed" desc=" Constructors ">
  /**
   * Creates a new Triangle Compiler object.
   */
  public IDECompiler() {
  }
  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc=" Compilation ">
  /**
   * Compiles the Triangle program in the file named fileName.
   * 
   * @param fileName the name of the Triangle source file
   * @return true iff the source program is free of compile-time errors, 
   *         otherwise false
   */
  public boolean compileProgram(String fileName) {
    try {
      String objectName = fileName.replace(".tri", ".tam");
      return Compiler.compileProgram(fileName, objectName, false, false);
    } catch (Exception e) {
      return false;
    }
  }

  /**
   * Returns the Abstract Syntax Tree representing the Triangle program.
   * 
   * @return the AST
   */
  public Program getAST() {
    return Compiler.theAST;
  }

  /**
   * Returns the error position if compilation failed.
   * 
   * @return the error position
   */
  public int getErrorPosition() {
    return (Compiler.reporter != null && Compiler.reporter.numErrors > 0) ? 0 : -1;
  }
}
