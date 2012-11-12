package vn.fiosoft.ize;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;

public class MainActivity extends Activity{

    private static final int MAX_RESULT = 3;
    
    private SpeechRecognizer mSpeechRecognizer;
    private Intent mIntentSpeechReconizer;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //create SpeechRecognizer object
        mSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(this); 
        mSpeechRecognizer.setRecognitionListener(new EMPRecognitionListener());
        
        startSpeechRecognizer();
    }

    
    /**
     * start speech recognizer
     * @param maxResult
     */
    public void startSpeechRecognizer(){        
        if (mIntentSpeechReconizer == null){
            mIntentSpeechReconizer = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);        
            mIntentSpeechReconizer.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
            mIntentSpeechReconizer.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE,getClass().getPackage().getName());  
            
        }
        mIntentSpeechReconizer.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, MAX_RESULT); 
        mSpeechRecognizer.startListening(mIntentSpeechReconizer);
    }
    
    /**
     * stop speech recognizer
     */
    public void stopSpeechRecognizer(){
        mSpeechRecognizer.stopListening();
    }
    
    @Override
    protected void onDestroy()
    {
        stopSpeechRecognizer();
        if(mSpeechRecognizer != null)
            mSpeechRecognizer.cancel();
        
        super.onDestroy();
    }
    
    /**
     * This class Used for receiving notifications from the SpeechRecognizer when the recognition related events occur. 
     * All the callback are executed on the Application main thread.
     *
     */
    private class EMPRecognitionListener implements RecognitionListener{

        public void onBeginningOfSpeech() {         
            
        }

        public void onBufferReceived(byte[] buffer) {       
                        
        }

        public void onEndOfSpeech() {           
            
        }

        public void onError(int error) {            
            startSpeechRecognizer();
        }

        public void onEvent(int eventType, Bundle params) {         
            
        }

        public void onPartialResults(Bundle partialResults) {           
            
        }

        public void onReadyForSpeech(Bundle params) {
            
        }

        
        public void onResults(Bundle results) {                     
            ArrayList<String> data = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);            
            startSpeechRecognizer();
        }

        public void onRmsChanged(float rmsdB) {         
             
        }
        
    }

}


   
