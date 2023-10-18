package model;

public class Pessoa {
    private String nome;
    private String endereco;
    private int anoNascimento;
    private boolean fezAniversario;

    public Pessoa(String nome, String endereco, int anoNascimento, boolean fezAniversario) {
        this.nome = nome;
        this.endereco = endereco;
        this.anoNascimento = anoNascimento;
        this.fezAniversario = fezAniversario;
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

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public boolean isFezAniversario() {
		return fezAniversario;
	}

	public void setFezAniversario(boolean fezAniversario) {
		this.fezAniversario = fezAniversario;
	}

    
}