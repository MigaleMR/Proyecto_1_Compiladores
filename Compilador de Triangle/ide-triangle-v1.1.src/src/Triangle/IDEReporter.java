/*
 * @(#)IDEReporter.java                      2.1 2003/10/07
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

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * Error reporter for the Triangle IDE.
 *
 * @version		2.1 7 Oct 2003
 * @author		Deryck F. Brown
 */
public class IDEReporter extends ErrorReporter {

    private int errorLine = -1;

    public IDEReporter() {
        super();
    }

    @Override
    public void reportError(String message, String tokenName, SourcePosition pos) {
        super.reportError(message, tokenName, pos);
        if (errorLine == -1) { // Solo capturar el primer error
            errorLine = pos.start;
        }
    }

    public int getErrorPosition() {
        return errorLine;
    }
}
