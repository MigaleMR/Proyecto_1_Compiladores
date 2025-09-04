package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

// Comando For - Representa un bucle con variable de control que itera sobre un rango de valores
// Puede ser ascendente o descendente según el parámetro 'asc'
public class ForCommand extends Command {

  // Constructor que inicializa el comando for con la variable de control, valores inicial y final,
  // comando a ejecutar y dirección de iteración
  public ForCommand (Vname vAST, Expression e1AST, Expression e2AST, Command cAST, boolean ascending, SourcePosition thePosition) {
    super (thePosition);
    V = vAST;
    E1 = e1AST;
    E2 = e2AST;
    C = cAST;
    asc = ascending;
  }

  // Método visitor para el patrón Visitor
  public Object visit(Visitor v, Object o) {
    return v.visitForCommand(this, o);
  }

  // Variable de control del bucle que toma los valores del rango
  public Vname V;
  // Expresión que define el valor inicial del rango
  public Expression E1;
  // Expresión que define el valor final del rango
  public Expression E2;
  // Comando que se ejecuta en cada iteración del bucle
  public Command C;
  // Indica si la iteración es ascendente (true) o descendente (false)
  public boolean asc;
}
