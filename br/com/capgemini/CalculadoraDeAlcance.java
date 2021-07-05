package br.com.capgemini;

import java.math.BigDecimal;

public class CalculadoraDeAlcance {
	
	private static final int MAX_COMPARTILHAMENTOS = 4;
	
	public ProjecaoAproximada calculaAlcance(BigDecimal valorInvestido) {
		double visualizacoesIniciais = valorInvestido.multiply(BigDecimal.valueOf(30L)).doubleValue();
		ProjecaoAproximada projecaoAproximadaAnuncio = calculoBase(visualizacoesIniciais);
		projecaoAproximadaAnuncio.addTotalVisualizacoes(visualizacoesIniciais);
		double compartilhamentosAtuais = projecaoAproximadaAnuncio.getTotalCompartilhamentos();

		for (int i = 0; i < MAX_COMPARTILHAMENTOS; i++) {
			ProjecaoAproximada projecaoAtual = calculoCompartilhamentos(compartilhamentosAtuais);
			projecaoAproximadaAnuncio.atualizarProjecao(projecaoAtual);
			compartilhamentosAtuais = projecaoAtual.getTotalCompartilhamentos();
		}
		return projecaoAproximadaAnuncio;
	}

	private ProjecaoAproximada calculoBase(double visualizacoesIniciais) {
		double click = (visualizacoesIniciais / 100) * 12;
		double compartilhamentos = (click / 20) * 3;
		double visualizacoes = compartilhamentos * 40;
		return new ProjecaoAproximada(click, compartilhamentos, visualizacoes);
	}

	private ProjecaoAproximada calculoCompartilhamentos(double compartilhamentos) {
		double novasVisualizacoes = compartilhamentos * 40;
		double novosClicks = (novasVisualizacoes / 100) * 12;
		double novosCompartilhamentos = (novosClicks / 20) * 3;
		return new ProjecaoAproximada(novosClicks, novosCompartilhamentos, novasVisualizacoes);

	}

}
