package br.com.teste;

import java.util.Scanner;

import br.com.modelo.Endereco;
import br.com.ws.ServicoDeCep;

public class MainView {

	public static void main(String[] args) {

		System.out.println("Informe seu CEP: ");
		String cep = new Scanner(System.in).nextLine();
		Endereco endereco = ServicoDeCep.buscarEnderecoPeloCEP(cep);

		System.out.println("-----------------------------------------");
		System.out.println("CEP: " + endereco.getCep());
		System.out.println("Logradouro: " + endereco.getLogradouro());
		System.out.println("Complemento: " + endereco.getComplemento());
		System.out.println("Bairro: " + endereco.getBairro());
		System.out.println("Localidade: " + endereco.getLocalidade());
		System.out.println("UF: " + endereco.getUf());
		System.out.println("DDD: " + endereco.getDdd());
		System.out.println("-----------------------------------------");

	}

}
