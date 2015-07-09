package webpagehighlighter;

import java.net.*;
import java.util.ArrayList;
import java.io.*;

public class HTMLParser {

	public ArrayList<String> parser(String address) throws Exception {

		ArrayList<String> websiteText = new ArrayList<String>();

		URL oracle = new URL(address);
		BufferedReader in = new BufferedReader(new InputStreamReader(
				oracle.openStream()));

		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			for (String word : inputLine.split(" ")) {
				websiteText.add(word);
			}

		}
		in.close();

		return websiteText;
	}

}
