package controleatleta;

import java.util.ArrayList;
import java.util.Date;

public class Atleta {

	ArrayList<String> telefones;
	private String nome;
	private Date dataNascimento;
	private Endereco endereco;
	private Double altura;
	private Double peso;
	private String nomePai;
	private String nomeMae;
	private char sexo;
	private String rg;
	private String cpf;

	public Atleta(String nome) {
		this.nome = nome;
		this.endereco = new Endereco();
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public ArrayList<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(ArrayList<String> telefones) {
		this.telefones = telefones;
	}

}