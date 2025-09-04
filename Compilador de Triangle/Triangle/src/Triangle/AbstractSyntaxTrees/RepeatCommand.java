package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

// Clase AST que representa un comando REPEAT en Triangle
// Estructura: repeat C until E
public class RepeatCommand extends Command {

  // Constructor que inicializa un comando REPEAT con el comando a repetir y la condición de parada
  public RepeatCommand (Command cAST, Expression eAST, SourcePosition thePosition) {
    super (thePosition);
    E = eAST;
    C = cAST;
  }

  // Método visitor para permitir el recorrido del árbol sintáctico
  public Object visit(Visitor v, Object o) {
    return v.visitRepeatCommand(this, o);
  }

  public Expression E;
  public Command C;
}
