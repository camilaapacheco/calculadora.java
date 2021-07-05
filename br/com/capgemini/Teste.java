package br.com.capgemini;
import java.math.BigDecimal;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculadoraDeAlcance teste = new CalculadoraDeAlcance();

		ProjecaoAproximada x = teste.calculaAlcance(BigDecimal.valueOf(100.0));
		System.out.println(x.toString());

	}

}
