package webpagehighlighter;
import java.net.*;
import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WebpageHighlighter {

	static Document doc; 
	
	public static void main(String[] args)throws Exception {
		URL oracle = new URL("http://www.cnn.com/2015/07/08/us/alaska-fires-hot-summer/index.html");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

// Mar check in
        String inputLine;
        while ((inputLine = in.readLine()) != null)
        	{//System.out.println(inputLine);
        	 doc = Jsoup.parse(inputLine); 
        	String text = doc.body().text(); 
        	System.out.println(text);
        	//in.close();}
        	}
        
        	
        	String text = doc.body().text(); 
        	System.out.println(text);
       // String html = "http://www.cnn.com/2014/09/26/living/weight-struggles-first-person/index.html";
		//Document doc = Jsoup.parse(html);
		//String text = doc.body().text(); // "An example link"
		//System.out.println(text);
		
		
	}

}
