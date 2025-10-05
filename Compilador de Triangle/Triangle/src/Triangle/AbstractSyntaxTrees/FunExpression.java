/*
 * FunExpression.java
 * Anonymous function (lambda) expression AST node
 */

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class FunExpression extends Expression {

  public FunExpression (FormalParameterSequence fpsAST, TypeDenoter tAST, Expression eAST, SourcePosition thePosition) {
    super(thePosition);
    FPS = fpsAST;
    T = tAST;
    E = eAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitFunExpression(this, o);
  }

  public FormalParameterSequence FPS;
  public TypeDenoter T; // return type
  public Expression E; // body
}
