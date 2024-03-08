package br.com.kanyeapi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import net.suuft.libretranslate.Language;
import net.suuft.libretranslate.Translator;

public class Main {
	public static void main(String[] args) throws Exception {	
		URL url = new URL("https://api.kanye.rest/");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		if(connection.getResponseCode() != 200) {
			throw new RuntimeException("HTTP error code : " + connection.getResponseCode());
		}
		BufferedReader resposta = new BufferedReader(new InputStreamReader((connection.getInputStream())));
		String jsonRetornado = resposta.readLine();
		JSONObject objeto = new JSONObject(jsonRetornado.toString());
		System.out.println(Translator.translate(Language.ENGLISH, Language.PORTUGUESE, objeto.getString("quote")));
	}
}
