package vn.fiosoft.module.skills.storage;

import java.util.ArrayList;
import java.util.List;

import vn.fiosoft.common.Language;
import vn.fiosoft.module.skills.model.Sentence;

public class SentenceStorage {

    public SentenceStorage() {

    }
    
    public List<Sentence> getSentenceGroup(int group) {
	List<Sentence> list = new ArrayList<Sentence>();
	if (group == 1) {
	    Sentence sentence = new Sentence();
	    sentence.setId(1);
	    sentence.setContent("I'm in a good mood");
	    sentence.setLanguage(Language.ENGLISH);
	    sentence.setGroup(1);
	    list.add(sentence);
	    Sentence sentence1 = new Sentence();
	    sentence1.setId(2);
	    sentence1.setContent("Mình đang rất vui");
	    sentence1.setLanguage(Language.VIETNAM);
	    sentence1.setGroup(1);
	    list.add(sentence1);
	} else {
	    Sentence sentence3 = new Sentence();
	    sentence3.setId(3);
	    sentence3.setContent("I'm in a bad mood");
	    sentence3.setLanguage(Language.ENGLISH);
	    sentence3.setGroup(2);
	    list.add(sentence3);
	    Sentence sentence4 = new Sentence();
	    sentence4.setId(4);
	    sentence4.setContent("Tâm trạng mình không được tốt");
	    sentence4.setLanguage(Language.VIETNAM);
	    sentence4.setGroup(2);
	    list.add(sentence4);
	}
	return list;
    }
}
