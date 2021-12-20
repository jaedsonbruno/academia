package academia.model;

public class RoscaDireta implements Exercicio{
   
    String nomeExercicio;
    int reperticoes;

    public RoscaDireta(String nomeExercicio, int reperticoes){
        this.nomeExercicio = nomeExercicio;
        this.reperticoes = reperticoes;
    }

    public RoscaDireta(){}

    @Override
    public String getNomeExercicio() {
        return nomeExercicio;        
    }
    
    @Override
    public int getReperticoes() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public void setNomeExercicio(String nome) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void setReperticoes(int reperticoes) {
        // TODO Auto-generated method stub
        
    }
}