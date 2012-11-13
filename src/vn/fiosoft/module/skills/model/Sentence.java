package vn.fiosoft.module.skills.model;

import vn.fiosoft.common.Language;

public class Sentence {

	private int id;
	private String content;
	private Language language;
	private int group;

	public Sentence() {
		this.id = 0;
		this.content = "";
		this.language = null;
		this.group = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

}
