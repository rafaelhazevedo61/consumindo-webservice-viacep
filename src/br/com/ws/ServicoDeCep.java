package br.com.ws;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

import br.com.modelo.Endereco;
import br.com.util.JSON;

public class ServicoDeCep {

	static String webService = "http://viacep.com.br/ws/";
	static int codicoSucesso = 200;

	public static Endereco buscarEnderecoPeloCEP(String cep) {

		String urlParaChamada = webService + cep + "/json";

		try {

			URL url = new URL(urlParaChamada);
			HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

			if (conexao.getResponseCode() != codicoSucesso) {
				throw new RuntimeException("HTTP error code: " + conexao.getResponseCode());
			}

			BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
			String jsonEmString = JSON.converterJSONemString(resposta);

			Gson gson = new Gson();
			Endereco endereco = gson.fromJson(jsonEmString, Endereco.class);

			return endereco;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

}
