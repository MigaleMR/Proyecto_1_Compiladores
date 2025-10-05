/*
 * FunTypeDenoter.java
 * Represents a function type denoter: fun (Formal-Parameter-Sequence) : Type-denoter
 */

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class LambdaTypeDenoter extends TypeDenoter {

  public LambdaTypeDenoter (FormalParameterSequence fpsAST, TypeDenoter tAST, SourcePosition thePosition) {
    super(thePosition);
    FPS = fpsAST;
    T = tAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitLambdaTypeDenoter(this, o);
  }

  public boolean equals(Object obj) {
    if (obj != null && obj instanceof ErrorTypeDenoter) return true;
    if (obj != null && obj instanceof LambdaTypeDenoter) {
      LambdaTypeDenoter f = (LambdaTypeDenoter) obj;
      return this.FPS.equals(f.FPS) && this.T.equals(f.T);
    }
    return false;
  }

  public FormalParameterSequence FPS;
  public TypeDenoter T;
}
