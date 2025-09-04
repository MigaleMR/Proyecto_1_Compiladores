package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

// Clase AST que representa un comando FOR en Triangle
// Estructura: for V := E1 to/downto E2 do C
public class ForCommand extends Command {

  // Constructor que inicializa un comando FOR con variable, expresiones inicial y final, comando y dirección
  public ForCommand (Vname vAST, Expression e1AST, Expression e2AST, Command cAST, boolean ascending, SourcePosition thePosition) {
    super (thePosition);
    V = vAST;
    E1 = e1AST;
    E2 = e2AST;
    C = cAST;
    asc = ascending;
  }

  // Método visitor para permitir el recorrido del árbol sintáctico
  public Object visit(Visitor v, Object o) {
    return v.visitForCommand(this, o);
  }

  public Vname V;
  public Expression E1;
  public Expression E2;
  public Command C;
  public boolean asc;
}
