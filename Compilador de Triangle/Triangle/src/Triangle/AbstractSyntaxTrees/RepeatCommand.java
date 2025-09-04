package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

// Comando Repeat - Representa un bucle que ejecuta un comando repetidamente
// hasta que una condición sea verdadera (se ejecuta al menos una vez)
public class RepeatCommand extends Command {

  // Constructor que inicializa el comando repeat con el comando a ejecutar y la condición de parada
  public RepeatCommand (Command cAST, Expression eAST, SourcePosition thePosition) {
    super (thePosition);
    E = eAST;
    C = cAST;
  }

  // Método visitor para el patrón Visitor
  public Object visit(Visitor v, Object o) {
    return v.visitRepeatCommand(this, o);
  }

  // Expresión booleana que determina cuándo terminar el bucle
  public Expression E;
  // Comando que se ejecuta repetidamente hasta que la expresión sea verdadera
  public Command C;
}
