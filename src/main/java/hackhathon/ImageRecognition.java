package hackhathon;

import java.io.File;
import java.util.List;

import com.clarifai.api.ClarifaiClient;
import com.clarifai.api.RecognitionRequest;
import com.clarifai.api.RecognitionResult;
import com.clarifai.api.Tag;

public class ImageRecognition {

// client-id : w_4pSiZm3IScn1IV_55lspiqNXZgLNHbLAkpAPDb
//client secret : j4Q-R4k-F149yWPFNFuWs8T4IggzFER-8dRD8Q3m
	
public static void main(String[] args) {
	
	final String APP_ID = "w_4pSiZm3IScn1IV_55lspiqNXZgLNHbLAkpAPDb";
	final String APP_SECRET = "j4Q-R4k-F149yWPFNFuWs8T4IggzFER-8dRD8Q3m";
	
	
	ClarifaiClient clarifai = new ClarifaiClient(APP_ID,APP_SECRET);
	
	List<RecognitionResult> results = clarifai.recognize(new RecognitionRequest(new File("cat.jpg")));
	
	for (Tag tag : results.get(0).getTags()) {
		  System.out.println(tag.getName() + ": " + tag.getProbability());
		}
}	
	
}
