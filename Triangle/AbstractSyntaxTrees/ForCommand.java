package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ForCommand extends Command{

    public Vname V;
    public IntegerLiteral I;
    public IntegerLiteral I_2;
    public Command C;

    public ForCommand(Vname vAST, IntegerLiteral ilAST, IntegerLiteral ilAST_2, Command cAST, SourcePosition sourcePosition) {
    super(sourcePosition);

    V = vAST;
    I = ilAST;
    I_2 = ilAST_2;
    C = cAST;

    }

    public Object visit(Visitor v, Object o) {
        return v.visitForCommand(this,o);
    }
}
