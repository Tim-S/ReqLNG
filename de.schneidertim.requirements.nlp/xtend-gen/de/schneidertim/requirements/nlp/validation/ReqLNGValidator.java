/**
 * generated by Xtext 2.10.0
 */
package de.schneidertim.requirements.nlp.validation;

import de.schneidertim.requirements.nlp.validation.AbstractReqLNGValidator;
import de.schneidertim.requirements.nlp.validation.ContainsOneVerbValidator;
import de.schneidertim.requirements.nlp.validation.VerbIsFunctionValidator;
import org.eclipse.xtext.validation.ComposedChecks;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@ComposedChecks(validators = { ContainsOneVerbValidator.class, VerbIsFunctionValidator.class })
@SuppressWarnings("all")
public class ReqLNGValidator extends AbstractReqLNGValidator {
}
