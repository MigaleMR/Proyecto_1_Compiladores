package Core.Visitors;

import Triangle.AbstractSyntaxTrees.ForCommand;
import Triangle.AbstractSyntaxTrees.Visitor;

public class SimpleTreeVisitor implements Visitor {
    
    public Object visitForCommand(ForCommand ast, Object o) {
        return null;
    }
    
    // Todos los otros métodos implementados como stubs
    public Object visitAssignCommand(Triangle.AbstractSyntaxTrees.AssignCommand ast, Object o) { return null; }
    public Object visitCallCommand(Triangle.AbstractSyntaxTrees.CallCommand ast, Object o) { return null; }
    public Object visitEmptyCommand(Triangle.AbstractSyntaxTrees.EmptyCommand ast, Object o) { return null; }
    public Object visitIfCommand(Triangle.AbstractSyntaxTrees.IfCommand ast, Object o) { return null; }
    public Object visitLetCommand(Triangle.AbstractSyntaxTrees.LetCommand ast, Object o) { return null; }
    public Object visitSequentialCommand(Triangle.AbstractSyntaxTrees.SequentialCommand ast, Object o) { return null; }
    public Object visitWhileCommand(Triangle.AbstractSyntaxTrees.WhileCommand ast, Object o) { return null; }
    public Object visitArrayExpression(Triangle.AbstractSyntaxTrees.ArrayExpression ast, Object o) { return null; }
    public Object visitBinaryExpression(Triangle.AbstractSyntaxTrees.BinaryExpression ast, Object o) { return null; }
    public Object visitCallExpression(Triangle.AbstractSyntaxTrees.CallExpression ast, Object o) { return null; }
    public Object visitCharacterExpression(Triangle.AbstractSyntaxTrees.CharacterExpression ast, Object o) { return null; }
    public Object visitEmptyExpression(Triangle.AbstractSyntaxTrees.EmptyExpression ast, Object o) { return null; }
    public Object visitIfExpression(Triangle.AbstractSyntaxTrees.IfExpression ast, Object o) { return null; }
    public Object visitIntegerExpression(Triangle.AbstractSyntaxTrees.IntegerExpression ast, Object o) { return null; }
    public Object visitLetExpression(Triangle.AbstractSyntaxTrees.LetExpression ast, Object o) { return null; }
    public Object visitRecordExpression(Triangle.AbstractSyntaxTrees.RecordExpression ast, Object o) { return null; }
    public Object visitUnaryExpression(Triangle.AbstractSyntaxTrees.UnaryExpression ast, Object o) { return null; }
    public Object visitVnameExpression(Triangle.AbstractSyntaxTrees.VnameExpression ast, Object o) { return null; }
    public Object visitBinaryOperatorDeclaration(Triangle.AbstractSyntaxTrees.BinaryOperatorDeclaration ast, Object o) { return null; }
    public Object visitConstDeclaration(Triangle.AbstractSyntaxTrees.ConstDeclaration ast, Object o) { return null; }
    public Object visitFuncDeclaration(Triangle.AbstractSyntaxTrees.FuncDeclaration ast, Object o) { return null; }
    public Object visitProcDeclaration(Triangle.AbstractSyntaxTrees.ProcDeclaration ast, Object o) { return null; }
    public Object visitSequentialDeclaration(Triangle.AbstractSyntaxTrees.SequentialDeclaration ast, Object o) { return null; }
    public Object visitTypeDeclaration(Triangle.AbstractSyntaxTrees.TypeDeclaration ast, Object o) { return null; }
    public Object visitUnaryOperatorDeclaration(Triangle.AbstractSyntaxTrees.UnaryOperatorDeclaration ast, Object o) { return null; }
    public Object visitVarDeclaration(Triangle.AbstractSyntaxTrees.VarDeclaration ast, Object o) { return null; }
    public Object visitMultipleArrayAggregate(Triangle.AbstractSyntaxTrees.MultipleArrayAggregate ast, Object o) { return null; }
    public Object visitSingleArrayAggregate(Triangle.AbstractSyntaxTrees.SingleArrayAggregate ast, Object o) { return null; }
    public Object visitMultipleRecordAggregate(Triangle.AbstractSyntaxTrees.MultipleRecordAggregate ast, Object o) { return null; }
    public Object visitSingleRecordAggregate(Triangle.AbstractSyntaxTrees.SingleRecordAggregate ast, Object o) { return null; }
    public Object visitConstFormalParameter(Triangle.AbstractSyntaxTrees.ConstFormalParameter ast, Object o) { return null; }
    public Object visitFuncFormalParameter(Triangle.AbstractSyntaxTrees.FuncFormalParameter ast, Object o) { return null; }
    public Object visitProcFormalParameter(Triangle.AbstractSyntaxTrees.ProcFormalParameter ast, Object o) { return null; }
    public Object visitVarFormalParameter(Triangle.AbstractSyntaxTrees.VarFormalParameter ast, Object o) { return null; }
    public Object visitEmptyFormalParameterSequence(Triangle.AbstractSyntaxTrees.EmptyFormalParameterSequence ast, Object o) { return null; }
    public Object visitMultipleFormalParameterSequence(Triangle.AbstractSyntaxTrees.MultipleFormalParameterSequence ast, Object o) { return null; }
    public Object visitSingleFormalParameterSequence(Triangle.AbstractSyntaxTrees.SingleFormalParameterSequence ast, Object o) { return null; }
    public Object visitConstActualParameter(Triangle.AbstractSyntaxTrees.ConstActualParameter ast, Object o) { return null; }
    public Object visitFuncActualParameter(Triangle.AbstractSyntaxTrees.FuncActualParameter ast, Object o) { return null; }
    public Object visitProcActualParameter(Triangle.AbstractSyntaxTrees.ProcActualParameter ast, Object o) { return null; }
    public Object visitVarActualParameter(Triangle.AbstractSyntaxTrees.VarActualParameter ast, Object o) { return null; }
    public Object visitEmptyActualParameterSequence(Triangle.AbstractSyntaxTrees.EmptyActualParameterSequence ast, Object o) { return null; }
    public Object visitMultipleActualParameterSequence(Triangle.AbstractSyntaxTrees.MultipleActualParameterSequence ast, Object o) { return null; }
    public Object visitSingleActualParameterSequence(Triangle.AbstractSyntaxTrees.SingleActualParameterSequence ast, Object o) { return null; }
    public Object visitAnyTypeDenoter(Triangle.AbstractSyntaxTrees.AnyTypeDenoter ast, Object o) { return null; }
    public Object visitArrayTypeDenoter(Triangle.AbstractSyntaxTrees.ArrayTypeDenoter ast, Object o) { return null; }
    public Object visitBoolTypeDenoter(Triangle.AbstractSyntaxTrees.BoolTypeDenoter ast, Object o) { return null; }
    public Object visitCharTypeDenoter(Triangle.AbstractSyntaxTrees.CharTypeDenoter ast, Object o) { return null; }
    public Object visitErrorTypeDenoter(Triangle.AbstractSyntaxTrees.ErrorTypeDenoter ast, Object o) { return null; }
    public Object visitSimpleTypeDenoter(Triangle.AbstractSyntaxTrees.SimpleTypeDenoter ast, Object o) { return null; }
    public Object visitIntTypeDenoter(Triangle.AbstractSyntaxTrees.IntTypeDenoter ast, Object o) { return null; }
    public Object visitRecordTypeDenoter(Triangle.AbstractSyntaxTrees.RecordTypeDenoter ast, Object o) { return null; }
    public Object visitMultipleFieldTypeDenoter(Triangle.AbstractSyntaxTrees.MultipleFieldTypeDenoter ast, Object o) { return null; }
    public Object visitSingleFieldTypeDenoter(Triangle.AbstractSyntaxTrees.SingleFieldTypeDenoter ast, Object o) { return null; }
    public Object visitCharacterLiteral(Triangle.AbstractSyntaxTrees.CharacterLiteral ast, Object o) { return null; }
    public Object visitIdentifier(Triangle.AbstractSyntaxTrees.Identifier ast, Object o) { return null; }
    public Object visitIntegerLiteral(Triangle.AbstractSyntaxTrees.IntegerLiteral ast, Object o) { return null; }
    public Object visitOperator(Triangle.AbstractSyntaxTrees.Operator ast, Object o) { return null; }
    public Object visitDotVname(Triangle.AbstractSyntaxTrees.DotVname ast, Object o) { return null; }
    public Object visitSimpleVname(Triangle.AbstractSyntaxTrees.SimpleVname ast, Object o) { return null; }
    public Object visitSubscriptVname(Triangle.AbstractSyntaxTrees.SubscriptVname ast, Object o) { return null; }
    public Object visitProgram(Triangle.AbstractSyntaxTrees.Program ast, Object o) { return null; }
}
