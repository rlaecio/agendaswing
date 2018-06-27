package br.com.prowene.agenda;

public class AgendaBeans {
	private int registro;
	private String nome;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String telefone;
	private String telefone2;
	private String telefone3;
	
	
	public AgendaBeans(int registro, String nome, String endereco,
			String bairro, String cidade, String estado, String cep,
			String telefone, String telefone2, String telefone3) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.telefone = telefone;
		this.telefone2 = telefone2;
		this.telefone3 = telefone3;
	}

	public AgendaBeans() {	
	}


	public int getRegistro() {
		return registro;
	}


	public void setRegistro(int registro) {
		this.registro = registro;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getTelefone2() {
		return telefone2;
	}


	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}


	public String getTelefone3() {
		return telefone3;
	}


	public void setTelefone3(String telefone3) {
		this.telefone3 = telefone3;
	}
}
