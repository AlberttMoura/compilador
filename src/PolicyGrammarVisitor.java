// Generated from C:/Users/alberttmoura/Desktop/compilador/src\PolicyGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PolicyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PolicyGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PolicyGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PolicyGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PolicyGrammarParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(PolicyGrammarParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PolicyGrammarParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(PolicyGrammarParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PolicyGrammarParser#policyRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicyRule(PolicyGrammarParser.PolicyRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PolicyGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PolicyGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PolicyGrammarParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(PolicyGrammarParser.ActionContext ctx);
}