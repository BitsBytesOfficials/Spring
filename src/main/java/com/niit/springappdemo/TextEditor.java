package com.niit.springappdemo;

public class TextEditor {
	SpellCheck spellChecker;
	String name;
	public SpellCheck getSpellChecker() {
		return spellChecker;
	}
	public void setSpellChecker(SpellCheck spellChecker) {
		this.spellChecker = spellChecker;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}
