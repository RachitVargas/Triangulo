package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class PutCommand extends Command{
    public Vname V;
    public Expression E1;
    public Expression E2;

    public PutCommand (Vname vAST, Expression eAST1, Expression eAST2, SourcePosition thePosition) {
        super (thePosition);
        V = vAST;
        E1 = eAST1;
        E2 = eAST2;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitPutCommand(this, o);
    }
}