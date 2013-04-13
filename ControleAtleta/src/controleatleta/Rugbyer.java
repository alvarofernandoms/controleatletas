package controleatleta;

import java.util.ArrayList;

public class Rugbyer extends Atleta {
	
	/**
	 * Fonte para explica��es do jogo: http://pt.wikibooks.org/wiki/Guia_do_Rugby 
	 * Explica��es resumidas.
	 */
	
	private ArrayList<Premiacao> premiacoes;	
	private int numeroCamisa; //No Rugby, as posi��es s�o definidas pelos n�meros nas camisas.
	//Posi��o: Se Pilar, Hooker, Segunda linha, Asa, Oitava, 
	//Scrum-half, Fly half, Primeiro Centro, Segundo Centro, Ponta, FullBack
	//N�meros de 1 a 15
	private char time;
	private int totalPartidas;
	private int totalVitorias;
	private int totalEmpates;
	private int totalDerrotas;
	private int totalTry; //Fixar a bola com a m�o na �rea depois da linha do in-goal.
	private int totalConvers�o; //Ap�s marcado o Try, fazer a bola passar por cima da trave e entre os postes.
	private int totalDropGoal; //fazer a bola passar por cima da trave ao longo da partida.
	private int totalPenalidades; //Faltas graves,  bola no local da infra��o e chut�-la em dire��o �s traves. 
	
	public Rugbyer(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Premiacao> getPremiacoes() {
		return premiacoes;
	}

	public void setPremiacoes(ArrayList<Premiacao> premiacoes) {
		this.premiacoes = premiacoes;
	}

	public int getNumeroCamisa() {
		return numeroCamisa;
	}

	public void setNumeroCamisa(int numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}

	public char getTime() {
		return time;
	}

	public void setTime(char time) {
		this.time = time;
	}

	public int getTotalPartidas() {
		return totalPartidas;
	}

	public void setTotalPartidas(int totalPartidas) {
		this.totalPartidas = totalPartidas;
	}

	public int getTotalVitorias() {
		return totalVitorias;
	}

	public void setTotalVitorias(int totalVitorias) {
		this.totalVitorias = totalVitorias;
	}

	public int getTotalEmpates() {
		return totalEmpates;
	}

	public void setTotalEmpates(int totalEmpates) {
		this.totalEmpates = totalEmpates;
	}

	public int getTotalDerrotas() {
		return totalDerrotas;
	}

	public void setTotalDerrotas(int totalDerrotas) {
		this.totalDerrotas = totalDerrotas;
	}

	public int getTotalTry() {
		return totalTry;
	}

	public void setTotalTry(int totalTry) {
		this.totalTry = totalTry;
	}

	public int getTotalConvers�o() {
		return totalConvers�o;
	}

	public void setTotalConvers�o(int totalConvers�o) {
		this.totalConvers�o = totalConvers�o;
	}

	public int getTotalDropGoal() {
		return totalDropGoal;
	}

	public void setTotalDropGoal(int totalDropGoal) {
		this.totalDropGoal = totalDropGoal;
	}

	public int getTotalPenalidades() {
		return totalPenalidades;
	}

	public void setTotalPenalidades(int totalPenalidades) {
		this.totalPenalidades = totalPenalidades;
	}
	
	//Posi��o: Se Pilar, Hooker, Segunda linha, Asa, Oitava, 
	//Scrum-half, Fly half, Primeiro Centro, Segundo Centro, Ponta, FullBack
	private static String obterPosicaoDadoNumeroCamisa(int numeroCamisa){
		if(numeroCamisa == 1){
			return "Pilar fechado";
		} else if (numeroCamisa == 2){
			return "Hooker";
		} else if (numeroCamisa == 3){
			return "Pilar aberto";
		} else if (numeroCamisa == 4 || numeroCamisa == 5){
			return "Segunda linha";
		} else if (numeroCamisa == 6){
			return "Asa cego";
		} else if (numeroCamisa == 7){
			return "Asa aberto";
		} else if (numeroCamisa == 8){
			return "Oitavo";
		} else if (numeroCamisa == 9){
			return "Meio scrum";
		} else if (numeroCamisa == 10){
			return "Abertura";
		} else if (numeroCamisa == 11){
			return "Ponta esquerdo";
		} else if (numeroCamisa == 12){
			return "Primeiro centro";
		} else if (numeroCamisa == 13){
			return "Segundo centro";
		} else if (numeroCamisa == 14){
			return "Ponta direito";
		} else if (numeroCamisa == 15){
			return "Zagueiro";
		}
		else {
			return "";
		}
	}
}