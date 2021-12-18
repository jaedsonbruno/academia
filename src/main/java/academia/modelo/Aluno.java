package academia.modelo;


public class Aluno{
    String nome;
    int idade;
    double altura;
    double largura;
    
    public Aluno(){

    }
    
    public Aluno(String nome, int idade, double altura, double largura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.largura = largura;
    }

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return this.largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public void getDados(){
		System.out.printf("O nome do Aluno é %s, ele tem %d anos e com %f cm de altura e %f cm de largura", this.nome, this.idade, this.altura, this.largura);
	}

}