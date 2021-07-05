package br.com.capgemini;

public class ProjecaoAproximada {

	private double totalClicks = 0;
	private double totalCompartilhamentos = 0;
	private double totalVisualizacoes = 0;

	public ProjecaoAproximada(double totalClicks, double totalCompartilhamentos, double totalVisualizacoes) {
		this.totalClicks = totalClicks;
		this.totalCompartilhamentos = totalCompartilhamentos;
		this.totalVisualizacoes = totalVisualizacoes;
	}

	@Override
	public String toString() {
		return "A quantidade m�xima de cliques ser�: " + Math.round(totalClicks) + "\nA quantidade m�xima de compartilhamentos ser�: " + Math.round(totalCompartilhamentos)
				+ "\nA quantidade m�xima de visualiza��es ser�: " + Math.round(totalVisualizacoes);
	}

	public void atualizarProjecao(ProjecaoAproximada projecao) {
		this.totalClicks += projecao.totalClicks;
		this.totalCompartilhamentos += projecao.totalCompartilhamentos;
		this.totalVisualizacoes += projecao.totalVisualizacoes;
	}

	public double getTotalClicks() {
		return totalClicks;
	}

	public double getTotalCompartilhamentos() {
		return totalCompartilhamentos;
	}

	public double getTotalVisualizacoes() {
		return totalVisualizacoes;
	}

	public void addTotalClicks(double totalClicks) {
		this.totalClicks += totalClicks;
	}

	public void addTotalCompartilhamentos(double totalCompartilhamentos) {
		this.totalCompartilhamentos += totalCompartilhamentos;
	}

	public void addTotalVisualizacoes(double totalVisualizacoes) {
		this.totalVisualizacoes += totalVisualizacoes;
	}

}
