package com.message.decoder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Decoder {
	public static void main(String[] args) throws Exception {
		String decoderFile = "C:\\test\\coding_qual_input.txt";
		String encodedMessagePath = "C:\\test\\decoded.txt";
		Map<String, String> decoderKeyMap = readDecoderList(decoderFile);
		List<String> encodedMessage = readMessage(encodedMessagePath);
		StringBuilder message = new StringBuilder();
		for (String messageCode : encodedMessage) {
			String messageWord = decoderKeyMap.get(messageCode);
			message.append(messageWord);
			message.append(" ");
		}
		System.out.println("Decoded Message : "+message.toString().trim());
	}
	
	

		public static Map readDecoderList(String path) throws Exception
		{
			File file = new File(path);
			BufferedReader br = new BufferedReader(new FileReader(file));
			String st;
			Map<String, String> decoderMap = new LinkedHashMap<>();
			while ((st = br.readLine()) != null) {
				String[] line = st.split(" ");
				decoderMap.put(line[0].trim(), line[1].trim()); 
			 }
			return decoderMap;
		}
	
		public static List readMessage(String path) throws Exception
		{
			File file = new File(path);
			BufferedReader br = new BufferedReader(new FileReader(file));
			String st;
			List<String> message = new ArrayList<>();
			while ((st = br.readLine()) != null) {
				int lastSpaceIndex = st.lastIndexOf(" ");
				message.add(st.substring(lastSpaceIndex).trim());
			}
			return message;
		}

}
