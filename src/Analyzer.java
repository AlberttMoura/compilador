import org.antlr.v4.runtime.tree.ParseTree;

public class Analyzer {
    public String analyze(ParseTree tree) {
        String xml = "";
        if(tree.getChild(0) != null) {
            int i = 0;
            String nType = "";
            while (tree.getChild(i) != null) {
                nType = tree.getChild(i).getClass().toString();
                switch (nType) {
                    case "class PolicyGrammarParser$PolicyContext":
                        xml += "<Name>\n" + "    " +  analyze(tree.getChild(i))+ "</Name>\n";
                        break;
                    case "class PolicyGrammarParser$TargetContext":
                        xml += "<Target>\n" + "    " +  analyze(tree.getChild(i))+ "</Target>\n";
                        break;
                    case "class PolicyGrammarParser$ActionContext":
                        xml += "<Action>\n" + "    " + analyze(tree.getChild(i))+ "</Action>\n";
                        break;
                    case "class PolicyGrammarParser$PolicyRuleContext":
                        xml += "<Rule>\n" + "    " + analyze(tree.getChild(i))+ "</Rule>\n";
                        break;
                    case "class PolicyGrammarParser$ConditionContext":
                        xml += "<Condition>\n" + "    " + analyze(tree.getChild(i))+ "</Condition>\n";
                        break;
                    case "class org.antlr.v4.runtime.tree.TerminalNodeImpl":
                        if(i == 1) xml += tree.getChild(1).toString() + "\n";
                        break;
                    default:
                        break;
                }
                i++;
            }
            System.out.println(xml);
            return xml;
        }
        return "";
    }
}
