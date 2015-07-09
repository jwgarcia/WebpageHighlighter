package webpagehighlighter;
import java.net.*;
import java.io.*;

public class WebpageHighlighter {

	public static void main(String[] args)throws Exception {
		URL oracle = new URL("http://www.cnn.com/2015/07/08/us/alaska-fires-hot-summer/index.html");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
		
		
	}

}
