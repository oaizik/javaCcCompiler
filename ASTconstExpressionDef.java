/* Generated By:JJTree: Do not edit this line. ASTconstExpressionDef.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTconstExpressionDef extends SimpleNode {
  public ASTconstExpressionDef(int id) {
    super(id);
  }

  public ASTconstExpressionDef(CLang p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CLangVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=6b79c8692b54270f312cb022a6bab009 (do not edit this line) */
