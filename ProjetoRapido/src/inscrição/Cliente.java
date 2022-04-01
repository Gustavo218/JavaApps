package inscrição;

public class Cliente {
	public  String nome;
	private  String cpf;
	private  int idade;
	private  float mensalidade;
	private  char sexo;
	private  String modalidade;
	private  String plano;
	private  String unidade;
	
	public Cliente(String nome, String cpf, int idade, String modalidade, String plano, String unidade, float mensalidade){
		this.nome=nome;
		this.setCpf(cpf);
		this.idade=idade;
		extracted(sexo);
		this.setPlano(plano);
		this.setUnidade(unidade);
		this.setModalidade(modalidade);
		this.setMensalidade(mensalidade);
		
	}


	public int getidade() {
		return idade;
	}

	public void setcpf(int idade) {
		this.idade = idade;
	}
	
	private char extracted(char sexo) {
		return this.sexo=sexo;
	}


	public float getMensalidade() {
		return mensalidade;
	}


	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getModalidade() {
		return modalidade;
	}


	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}


	public String getUnidade() {
		return unidade;
	}


	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}


	public String getPlano() {
		return plano;
	}


	public void setPlano(String plano) {
		this.plano = plano;
	}



	
}
