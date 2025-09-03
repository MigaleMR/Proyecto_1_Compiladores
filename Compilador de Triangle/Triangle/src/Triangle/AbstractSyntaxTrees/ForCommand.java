/*
 * @(#)ForCommand.java                        2.1 2003/10/07
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

/*
 * Esta clase representa un comando FOR en el árbol de sintaxis abstracta (AST).
 * Contiene los elementos necesarios para un bucle for: variable de control (V),
 * expresión inicial (E1), expresión final (E2), dirección del bucle (isDowntoLoop)
 * y el comando a ejecutar en cada iteración (C).
 */

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ForCommand extends Command {

  public ForCommand (Vname vAST, Expression e1AST, Expression e2AST, 
                    boolean isDownto, Command cAST, SourcePosition thePosition) {
    super (thePosition);
    V = vAST;        
    E1 = e1AST;      
    E2 = e2AST;      
    isDowntoLoop = isDownto;  
    C = cAST;        
  }

  public Object visit(Visitor v, Object o) {
    return v.visitForCommand(this, o);
  }

  public Vname V;       
  public Expression E1;      
  public Expression E2;      
  public boolean isDowntoLoop; 
  public Command C;          
}