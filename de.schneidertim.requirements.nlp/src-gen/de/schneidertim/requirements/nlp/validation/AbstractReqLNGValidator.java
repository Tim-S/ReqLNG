/*
 * generated by Xtext 2.10.0
 */
package de.schneidertim.requirements.nlp.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractReqLNGValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(de.schneidertim.requirements.nlp.reqLNG.ReqLNGPackage.eINSTANCE);
		return result;
	}
	
}
