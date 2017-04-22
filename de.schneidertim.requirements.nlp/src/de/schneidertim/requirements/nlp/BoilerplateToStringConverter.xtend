package de.schneidertim.requirements.nlp

import de.schneidertim.requirements.nlp.reqLNG.TextWithReferences
import de.schneidertim.requirements.nlp.reqLNG.Requirement
import de.schneidertim.requirements.nlp.reqLNG.UnconditionalRequirement
import de.schneidertim.requirements.nlp.reqLNG.ConditionalRequirement
import de.schneidertim.requirements.nlp.reqLNG.RequirementEnd
import de.schneidertim.requirements.nlp.reqLNG.ActorInteraction
import de.schneidertim.requirements.nlp.reqLNG.TextWithConceptsOrSynonyms

class BoilerplateToStringConverter {
	def toString(TextWithReferences text) {
		if (!text.onlyRefs.empty) {
			return text.onlyRefs.map[name].join(" ").trim
		}
		val elements = newLinkedList
		elements.addAll(text.refBefore.map[name])
		elements.addAll(text.text)
		text.after.forEach [ comb |
			elements.addAll(comb.refs.map[name])
			elements.addAll(comb.text)
		]
		elements.addAll(text.finalRef.map[name])
		elements.join(" ").trim
	}
	def toString(Requirement req) {
		if(req instanceof UnconditionalRequirement) 
			toString(req)
		else if (req instanceof ConditionalRequirement) 
			toString(req)
	}
	def toString(UnconditionalRequirement req) {
		val elements = newLinkedList
		elements.add(req.the)
		elements.add(req.system.name)
		elements.add(req.liability.toString())
		elements.add(toString(req.end))
		elements.join(" ").trim
	}
	
	def toString(RequirementEnd reqEnd) {
		val elements = newLinkedList
		elements.add(toString(reqEnd.ai))
		elements.add(toString(reqEnd.objectWithDetails))
		elements.add(".")
		elements.join(" ").trim
	}
	def toString(TextWithConceptsOrSynonyms text){
		if (!text.onlyRefs.empty) {
			return text.onlyRefs.map[name].join(" ").trim
		}
		val elements = newLinkedList
		elements.addAll(text.refBefore.map[name])
		elements.addAll(text.text)
		text.after.forEach [ comb |
			elements.addAll(comb.concepts.map[name])
			elements.addAll(comb.text)
		]
		elements.addAll(text.finalRef.map[name])
		elements.join(" ").trim
	}
	
	def toString(ActorInteraction ai){
		val elements = newLinkedList
		elements.add(ai.provide)
		elements.add(ai.the1)
		elements.add(ai.actor.name)
		elements.add(ai.with)
		elements.add(ai.the2)
		elements.add(ai.ability)
		elements.add(ai.to)
		elements.join(" ").trim
	}
	
	def toString(ConditionalRequirement req) {
		"" //TODO
	}
}
