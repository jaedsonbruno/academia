package academia.controler;
import academia.AlunoDAO.AlunoDAO;
import academia.model.*;

public class AlunoController {
    
    private AlunoDAO bd;

    public AlunoController(){
        bd = new AlunoDAO();
    }

    public void inserirAluno(Aluno aluno){
        bd.inserirAluno(aluno);
    }

    public Aluno getAluno(int id) {
        return bd.getAluno(id);
    }

    public int getTamanhoLista() {
        return bd.getTamanhoList();
    }
}
