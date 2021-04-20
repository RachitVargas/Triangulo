package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ForCommand extends Command {

    public ForCommand (Vname vAST, Expression e1AST, Expression e2AST,
                       Command cAST, SourcePosition thePosition) {
        super (thePosition);
        V = vAST;
        I = e1AST;
        I_2 = e2AST;
        C = cAST;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitForCommand(this, o);
    }

    public Vname V;
    public Expression I;
    public Expression I_2;
    public Command C;
}