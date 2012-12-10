package vn.fiosoft.module.skills.model;

import java.util.List;

public class Sentence {

	private int id;
	public List<String> texts;
	private String phonetic;
	private String language;
	
	public Sentence() {
		this.id = 0;
		this.texts = null;
		this.phonetic = "";
		this.language = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhonetic() {
		return phonetic;
	}

	public void setPhonetic(String phonetic) {
		this.phonetic = phonetic;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
