package academia.model;

import java.util.*;

public class Treino{

    private List<Exercicio> exercicios;


    public Treino(){
        exercicios = new ArrayList<Exercicio>();
    }

    public Object getExercicios() {
        return this.exercicios;
    }

    public void setExercicios(Exercicio exercicios) {
        this.exercicios.add(exercicios);
    }


}