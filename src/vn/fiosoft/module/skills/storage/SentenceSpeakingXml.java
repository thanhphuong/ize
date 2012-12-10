package vn.fiosoft.module.skills.storage;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import vn.fiosoft.common.Language;
import vn.fiosoft.module.skills.model.SentenceSpeaking;

public class SentenceSpeakingXml {

	public static final String SPEAKING_KILL = "speakingkill";
	public static final String NAME = "name";
	public static final String LANGUAGES = "languages";
	public static final String DETAIL = "detail";
	public static final String SENTENCE_SPEAKING = "sentencespeaking";
	public static final String ORDER = "order";
	public static final String SENTENCE = "sentence";
	public static final String LANGUAGE = "language";
	public static final String TEXT = "text";
	public static final String PHONETIC = "phonetic";
	
	private String feedPath;
	private List<SentenceSpeaking> sentences;	

	public SentenceSpeakingXml(String feedPath, String languageFrom, String languageTo) {
		this.sentences = null;	
		this.feedPath = feedPath;
	}
	

	class SpeakingHandler extends DefaultHandler {

		private SentenceSpeaking sentenceSpeaking;
		private StringBuilder builder;

		@Override
		public void characters(char[] ch, int start, int length) throws SAXException {
			super.characters(ch, start, length);
			builder.append(ch, start, length);
		}

		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
			super.startElement(uri, localName, qName, attributes);
			if (localName.equalsIgnoreCase(SENTENCE_SPEAKING)) {
				sentences = new ArrayList<SentenceSpeaking>();
			}
		}

		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
			super.endElement(uri, localName, qName);
			if (this.sentenceSpeaking != null) {
				if (localName.equalsIgnoreCase(ORDER)) {
					sentenceSpeaking.setOrder(Integer.parseInt(builder.toString()));
				}else if (localName.equalsIgnoreCase(SENTENCE_SPEAKING)) {
					sentences.add(sentenceSpeaking);
				}
				
			}

		}
	}
}
