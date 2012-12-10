package vn.fiosoft.module.skills.model;

import java.util.List;

public class SentenceSpeaking {
	private int order;
	public List<Sentence> sentences;

	public SentenceSpeaking() {
		super();
		order = 0;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
}
