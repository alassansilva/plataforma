package pessoa;

public class Pessoa {
	private String nome;
	private String sobrenome;
	public int idade;
	public boolean situacao = true;
	public String cpf;
	
		
	
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	

}
