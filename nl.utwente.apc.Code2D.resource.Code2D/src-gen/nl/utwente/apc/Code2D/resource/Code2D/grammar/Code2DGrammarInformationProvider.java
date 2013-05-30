/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package nl.utwente.apc.Code2D.resource.Code2D.grammar;

public class Code2DGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static Code2DGrammarInformationProvider INSTANCE = new Code2DGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DKeyword CODE2D_0_0_0_0 = new nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DKeyword("Game", nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DCardinality.ONE);
	public final static nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DPlaceholder CODE2D_0_0_0_1_0_0_0 = new nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DPlaceholder(nl.utwente.apc.Code2D.Code2DPackage.eINSTANCE.getGame().getEStructuralFeature(nl.utwente.apc.Code2D.Code2DPackage.GAME__NAME), "QUOTED_34_34", nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DCardinality.ONE, 0);
	public final static nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DSequence CODE2D_0_0_0_1_0_0 = new nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DSequence(nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DCardinality.ONE, CODE2D_0_0_0_1_0_0_0);
	public final static nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DChoice CODE2D_0_0_0_1_0 = new nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DChoice(nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DCardinality.ONE, CODE2D_0_0_0_1_0_0);
	public final static nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DCompound CODE2D_0_0_0_1 = new nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DCompound(CODE2D_0_0_0_1_0, nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DCardinality.STAR);
	public final static nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DKeyword CODE2D_0_0_0_2 = new nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DKeyword(";", nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DCardinality.ONE);
	public final static nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DSequence CODE2D_0_0_0 = new nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DSequence(nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DCardinality.ONE, CODE2D_0_0_0_0, CODE2D_0_0_0_1, CODE2D_0_0_0_2);
	public final static nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DChoice CODE2D_0_0 = new nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DChoice(nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DCardinality.ONE, CODE2D_0_0_0);
	public final static nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DRule CODE2D_0 = new nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DRule(nl.utwente.apc.Code2D.Code2DPackage.eINSTANCE.getGame(), CODE2D_0_0, nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DCardinality.ONE);
	
	public static String getSyntaxElementID(nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (java.lang.reflect.Field field : nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DGrammarInformationProvider.class.getFields()) {
			Object fieldValue;
			try {
				fieldValue = field.get(null);
				if (fieldValue == syntaxElement) {
					String id = field.getName();
					return id;
				}
			} catch (Exception e) { }
		}
		return null;
	}
	
	public static nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DSyntaxElement) nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DRule[] RULES = new nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DRule[] {
		CODE2D_0,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DKeyword) {
			keywords.add(((nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DKeyword) element).getValue());
		} else if (element instanceof nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DBooleanTerminal) {
			keywords.add(((nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DBooleanTerminal) element).getTrueLiteral());
			keywords.add(((nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DEnumerationTerminal) {
			nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DEnumerationTerminal terminal = (nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (nl.utwente.apc.Code2D.resource.Code2D.grammar.Code2DSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}