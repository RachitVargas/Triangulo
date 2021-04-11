package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ChooseCommand extends Command{
    public Vname V;
    public Expression E1;
    public Expression E2;

    public ChooseCommand (Vname vAST, Expression eAST1, Expression eAST2, SourcePosition thePosition) {
        super (thePosition);
        V = vAST;
        E1 = eAST1;
        E2 = eAST2;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitChooseCommand(this, o);
    }
}