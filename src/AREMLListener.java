// Generated from AREML.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AREMLParser}.
 */
public interface AREMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AREMLParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(AREMLParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(AREMLParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLParser#connectionType}.
	 * @param ctx the parse tree
	 */
	void enterConnectionType(AREMLParser.ConnectionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLParser#connectionType}.
	 * @param ctx the parse tree
	 */
	void exitConnectionType(AREMLParser.ConnectionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLParser#person}.
	 * @param ctx the parse tree
	 */
	void enterPerson(AREMLParser.PersonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLParser#person}.
	 * @param ctx the parse tree
	 */
	void exitPerson(AREMLParser.PersonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(AREMLParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(AREMLParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(AREMLParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(AREMLParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AREMLParser#lastLocation}.
	 * @param ctx the parse tree
	 */
	void enterLastLocation(AREMLParser.LastLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AREMLParser#lastLocation}.
	 * @param ctx the parse tree
	 */
	void exitLastLocation(AREMLParser.LastLocationContext ctx);
}