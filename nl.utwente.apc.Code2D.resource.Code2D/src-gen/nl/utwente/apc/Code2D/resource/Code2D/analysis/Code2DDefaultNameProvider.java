/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package nl.utwente.apc.Code2D.resource.Code2D.analysis;

public class Code2DDefaultNameProvider implements nl.utwente.apc.Code2D.resource.Code2D.ICode2DNameProvider {
	
	public final static String NAME_FEATURE = "name";
	
	/**
	 * Returns a list of potential identifiers that may be used to reference the given
	 * element. This method can be overridden to customize the identification of
	 * elements.
	 */
	public java.util.List<String> getNames(org.eclipse.emf.ecore.EObject element) {
		java.util.List<String> names = new java.util.ArrayList<String>();
		
		// first check for attributes that have set the ID flag to true
		java.util.List<org.eclipse.emf.ecore.EAttribute> attributes = element.eClass().getEAllAttributes();
		for (org.eclipse.emf.ecore.EAttribute attribute : attributes) {
			if (attribute.isID()) {
				Object attributeValue = element.eGet(attribute);
				if (attributeValue != null) {
					names.add(attributeValue.toString());
				}
			}
		}
		
		// then check for an attribute that is called 'name'
		org.eclipse.emf.ecore.EStructuralFeature nameAttr = element.eClass().getEStructuralFeature(NAME_FEATURE);
		if (nameAttr instanceof org.eclipse.emf.ecore.EAttribute) {
			Object attributeValue = element.eGet(nameAttr);
			if (attributeValue != null) {
				names.add(attributeValue.toString());
			}
		} else {
			// try any other string attribute found
			for (org.eclipse.emf.ecore.EAttribute attribute : attributes) {
				if ("java.lang.String".equals(attribute.getEType().getInstanceClassName())) {
					Object attributeValue = element.eGet(attribute);
					if (attributeValue != null) {
						names.add(attributeValue.toString());
					}
				}
			}
			
			// try operations without arguments that return strings and which have a name that
			// ends with 'name'
			for (org.eclipse.emf.ecore.EOperation operation : element.eClass().getEAllOperations()) {
				if (operation.getName().toLowerCase().endsWith(NAME_FEATURE) && operation.getEParameters().size() == 0) {
					Object result = nl.utwente.apc.Code2D.resource.Code2D.util.Code2DEObjectUtil.invokeOperation(element, operation);
					if (result != null) {
						names.add(result.toString());
					}
				}
			}
		}
		return names;
	}
	
}