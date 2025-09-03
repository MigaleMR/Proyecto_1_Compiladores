import Triangle.AbstractSyntaxTrees.*;

public class TestVisitor implements Visitor {
    
    public Object visitForCommand(ForCommand ast, Object obj) {
        return null;
    }
    
    // Método de prueba mínimo
    public Object visitAssignCommand(AssignCommand ast, Object o) { return null; }
    public Object visitCallCommand(CallCommand ast, Object o) { return null; }
    public Object visitEmptyCommand(EmptyCommand ast, Object o) { return null; }
    public Object visitIfCommand(IfCommand ast, Object o) { return null; }
    public Object visitLetCommand(LetCommand ast, Object o) { return null; }
    public Object visitSequentialCommand(SequentialCommand ast, Object o) { return null; }
    public Object visitWhileCommand(WhileCommand ast, Object o) { return null; }
    public Object visitArrayExpression(ArrayExpression ast, Object o) { return null; }
    public Object visitBinaryExpression(BinaryExpression ast, Object o) { return null; }
    public Object visitCallExpression(CallExpression ast, Object o) { return null; }
    public Object visitCharacterExpression(CharacterExpression ast, Object o) { return null; }
    public Object visitEmptyExpression(EmptyExpression ast, Object o) { return null; }
    public Object visitIfExpression(IfExpression ast, Object o) { return null; }
    public Object visitIntegerExpression(IntegerExpression ast, Object o) { return null; }
    public Object visitLetExpression(LetExpression ast, Object o) { return null; }
    public Object visitRecordExpression(RecordExpression ast, Object o) { return null; }
    public Object visitUnaryExpression(UnaryExpression ast, Object o) { return null; }
    public Object visitVnameExpression(VnameExpression ast, Object o) { return null; }
    public Object visitBinaryOperatorDeclaration(BinaryOperatorDeclaration ast, Object o) { return null; }
    public Object visitConstDeclaration(ConstDeclaration ast, Object o) { return null; }
    public Object visitFuncDeclaration(FuncDeclaration ast, Object o) { return null; }
    public Object visitProcDeclaration(ProcDeclaration ast, Object o) { return null; }
    public Object visitSequentialDeclaration(SequentialDeclaration ast, Object o) { return null; }
    public Object visitTypeDeclaration(TypeDeclaration ast, Object o) { return null; }
    public Object visitUnaryOperatorDeclaration(UnaryOperatorDeclaration ast, Object o) { return null; }
    public Object visitVarDeclaration(VarDeclaration ast, Object o) { return null; }
    public Object visitMultipleArrayAggregate(MultipleArrayAggregate ast, Object o) { return null; }
    public Object visitSingleArrayAggregate(SingleArrayAggregate ast, Object o) { return null; }
    public Object visitMultipleRecordAggregate(MultipleRecordAggregate ast, Object o) { return null; }
    public Object visitSingleRecordAggregate(SingleRecordAggregate ast, Object o) { return null; }
    public Object visitConstFormalParameter(ConstFormalParameter ast, Object o) { return null; }
    public Object visitFuncFormalParameter(FuncFormalParameter ast, Object o) { return null; }
    public Object visitProcFormalParameter(ProcFormalParameter ast, Object o) { return null; }
    public Object visitVarFormalParameter(VarFormalParameter ast, Object o) { return null; }
    public Object visitEmptyFormalParameterSequence(EmptyFormalParameterSequence ast, Object o) { return null; }
    public Object visitMultipleFormalParameterSequence(MultipleFormalParameterSequence ast, Object o) { return null; }
    public Object visitSingleFormalParameterSequence(SingleFormalParameterSequence ast, Object o) { return null; }
    public Object visitConstActualParameter(ConstActualParameter ast, Object o) { return null; }
    public Object visitFuncActualParameter(FuncActualParameter ast, Object o) { return null; }
    public Object visitProcActualParameter(ProcActualParameter ast, Object o) { return null; }
    public Object visitVarActualParameter(VarActualParameter ast, Object o) { return null; }
    public Object visitEmptyActualParameterSequence(EmptyActualParameterSequence ast, Object o) { return null; }
    public Object visitMultipleActualParameterSequence(MultipleActualParameterSequence ast, Object o) { return null; }
    public Object visitSingleActualParameterSequence(SingleActualParameterSequence ast, Object o) { return null; }
    public Object visitAnyTypeDenoter(AnyTypeDenoter ast, Object o) { return null; }
    public Object visitArrayTypeDenoter(ArrayTypeDenoter ast, Object o) { return null; }
    public Object visitBoolTypeDenoter(BoolTypeDenoter ast, Object o) { return null; }
    public Object visitCharTypeDenoter(CharTypeDenoter ast, Object o) { return null; }
    public Object visitErrorTypeDenoter(ErrorTypeDenoter ast, Object o) { return null; }
    public Object visitSimpleTypeDenoter(SimpleTypeDenoter ast, Object o) { return null; }
    public Object visitIntTypeDenoter(IntTypeDenoter ast, Object o) { return null; }
    public Object visitRecordTypeDenoter(RecordTypeDenoter ast, Object o) { return null; }
    public Object visitMultipleFieldTypeDenoter(MultipleFieldTypeDenoter ast, Object o) { return null; }
    public Object visitSingleFieldTypeDenoter(SingleFieldTypeDenoter ast, Object o) { return null; }
    public Object visitCharacterLiteral(CharacterLiteral ast, Object o) { return null; }
    public Object visitIdentifier(Identifier ast, Object o) { return null; }
    public Object visitIntegerLiteral(IntegerLiteral ast, Object o) { return null; }
    public Object visitOperator(Operator ast, Object o) { return null; }
    public Object visitDotVname(DotVname ast, Object o) { return null; }
    public Object visitSimpleVname(SimpleVname ast, Object o) { return null; }
    public Object visitSubscriptVname(SubscriptVname ast, Object o) { return null; }
    public Object visitProgram(Program ast, Object o) { return null; }
}
