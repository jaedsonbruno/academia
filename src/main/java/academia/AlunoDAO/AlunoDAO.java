package academia.AlunoDAO;
import academia.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    
    private List<Aluno> alunos;

    public AlunoDAO() {    
        alunos = new ArrayList<Aluno>();   
    }

    public AlunoDAO(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void inserirAluno(Aluno aluno) {
        try{
            this.alunos.add(aluno);
        }catch(Exception e){
            e.printStackTrace();
        }        
    }

    public int getTamanhoList(){
        return alunos.size();
    }

    public Aluno getAluno(int id) {
        return alunos.get(id);
    } 

}
