// Generated from C:/Users/alberttmoura/Desktop/compilador/src\PolicyGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PolicyGrammarParser}.
 */
public interface PolicyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PolicyGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PolicyGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolicyGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PolicyGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolicyGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(PolicyGrammarParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolicyGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(PolicyGrammarParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolicyGrammarParser#policy_name}.
	 * @param ctx the parse tree
	 */
	void enterPolicy_name(PolicyGrammarParser.Policy_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolicyGrammarParser#policy_name}.
	 * @param ctx the parse tree
	 */
	void exitPolicy_name(PolicyGrammarParser.Policy_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolicyGrammarParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(PolicyGrammarParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolicyGrammarParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(PolicyGrammarParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolicyGrammarParser#policyRule}.
	 * @param ctx the parse tree
	 */
	void enterPolicyRule(PolicyGrammarParser.PolicyRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolicyGrammarParser#policyRule}.
	 * @param ctx the parse tree
	 */
	void exitPolicyRule(PolicyGrammarParser.PolicyRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolicyGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PolicyGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolicyGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PolicyGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolicyGrammarParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(PolicyGrammarParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolicyGrammarParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(PolicyGrammarParser.ActionContext ctx);
}