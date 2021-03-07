package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class IdentifierCommand extends Command{

    public Vname V;
    public Vname V_2;
    public Vname V_3;

    public IdentifierCommand(Vname vAST, Vname vAST_2, Vname vAST_3, SourcePosition sourcePosition) {
        super(sourcePosition);

        V = vAST;
        V_2 = vAST_2;
        V_3 = vAST_3;
    }



    public Object visit(Visitor v, Object o) {
        return v.visitIdentifierCommand(this,o);
    }
}
