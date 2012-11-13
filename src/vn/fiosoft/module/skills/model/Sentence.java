package vn.fiosoft.module.skills.model;

public class Sentence {

	private int id;
	private String content;
	private String language;
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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

}
