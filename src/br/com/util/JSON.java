package br.com.util;

import java.io.BufferedReader;
import java.io.IOException;

public class JSON {

	public static String converterJSONemString(BufferedReader bufferedReader) throws IOException {

		String resposta, JsonEmString = "";

		while ((resposta = bufferedReader.readLine()) != null) {
			JsonEmString += resposta;
		}
		
		return JsonEmString;

	}

}
