package vn.fiosoft.ize;

import java.util.ArrayList;
import java.util.List;

import vn.fiosoft.common.Language;
import vn.fiosoft.module.skills.model.Sentence;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity1 extends Activity {

//	private static final int MAX_RESULT = 3;
//
//	private SpeechRecognizer mSpeechRecognizer;
//	private Intent mIntentSpeechReconizer;
//
//	private TextView tvSentence;
//	private TextView tvResult;
//
//	private SentenceStorage mSentenceStorage;
//	private List<Sentence> mSentences;
//	private Sentence mSentence;
//	private int mCurrentGroup;
//
//	@Override
//	public void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
//
//		tvSentence = (TextView) findViewById(R.id.sentence);
//		tvResult = (TextView) findViewById(R.id.result);
//
//		loadSentence();
//
//		if (tvSentence.getText().toString().equals("")) {
//			return;
//		}
//
//		// create SpeechRecognizer object
//		mSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(this);
//		mSpeechRecognizer.setRecognitionListener(new EMPRecognitionListener());
//
//		startSpeechRecognizer();
//	}
//
//	private void loadSentence() {
//		mSentenceStorage = new SentenceStorage();
//
//		mSentences = mSentenceStorage.getSentenceGroup(mCurrentGroup);
//		if (mSentences.size() > 0) {
//			for (Sentence sentence : mSentences) {
//				if (sentence.getLanguage().equals(Language.ENGLISH)) {
//					mSentence = sentence;
//					tvSentence.setText(sentence.getText().trim());					
//					break;
//				}
//			}
//		} else {
//			Toast.makeText(getBaseContext(), "Load sentence error !!!", Toast.LENGTH_LONG).show();
//			return;
//		}
//	}
//
//	/**
//	 * start speech recognizer
//	 * 
//	 * @param maxResult
//	 */
//	public void startSpeechRecognizer() {
//		if (mIntentSpeechReconizer == null) {
//			mIntentSpeechReconizer = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
//			mIntentSpeechReconizer.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
//			mIntentSpeechReconizer.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, getClass().getPackage().getName());
//
//		}
//		mIntentSpeechReconizer.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, MAX_RESULT);
//		mSpeechRecognizer.startListening(mIntentSpeechReconizer);
//	}
//
//	/**
//	 * stop speech recognizer
//	 */
//	public void stopSpeechRecognizer() {
//		mSpeechRecognizer.stopListening();
//	}
//
//	@Override
//	protected void onDestroy() {
//		stopSpeechRecognizer();
//		if (mSpeechRecognizer != null)
//			mSpeechRecognizer.cancel();
//
//		super.onDestroy();
//	}
//
//	/**
//	 * This class Used for receiving notifications from the SpeechRecognizer
//	 * when the recognition related events occur. All the callback are executed
//	 * on the Application main thread.
//	 * 
//	 */
//	private class EMPRecognitionListener implements RecognitionListener {
//
//		public void onBeginningOfSpeech() {
//
//		}
//
//		public void onBufferReceived(byte[] buffer) {
//
//		}
//
//		public void onEndOfSpeech() {
//
//		}
//
//		public void onError(int error) {
//			startSpeechRecognizer();
//		}
//
//		public void onEvent(int eventType, Bundle params) {
//
//		}
//
//		public void onPartialResults(Bundle partialResults) {
//
//		}
//
//		public void onReadyForSpeech(Bundle params) {
//
//		}
//
//		public void onResults(Bundle results) {
//			ArrayList<String> data = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
//			String sentence = tvSentence.getText().toString();
//			String result = "";
//			for (String s : data) {
//				if (sentence.equalsIgnoreCase(s.trim())) {
//					mCurrentGroup += 1;
//					loadSentence();
//					Toast.makeText(getApplicationContext(), "Next Sentence", Toast.LENGTH_LONG).show();
//				} else {
//					if (result.equals(""))
//						result = s;
//					else
//						result += "\n" + s;
//					tvResult.setText(result);
//				}
//				if (s.equalsIgnoreCase("exit"))
//					finish();
//			}
//
//			startSpeechRecognizer();
//		}
//
//		public void onRmsChanged(float rmsdB) {
//
//		}
//
//	}

}
