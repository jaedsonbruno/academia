package academia;

import org.junit.jupiter.api.Test;

import academia.controler.AlunoController;
import academia.model.Aluno;

import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {
    
    @Test
    void testeNomeString(){
        Aluno a1 = new Aluno();
        a1.setNome("Jaedson");
        assertTrue(a1.getNome().equals("Jaedson"));
    }

    @Test
    void testNomeDiferente(){
        Aluno a1 = new Aluno();
        a1.setNome("Gabriel");
        assertFalse(a1.getNome().equals("Jaedson"));
    }

    @Test
    void testInserirAluno(){
        Aluno a1 = new Aluno();
        AlunoController alunoController = new AlunoController();
        a1.setNome("Gabriel");
        a1.setAltura(1.69);
        a1.setIdade(30);
        a1.setLargura(0.59);

        alunoController.inserirAluno(a1);

        int tamanho = alunoController.getTamanhoLista();

        assertTrue(tamanho == 1);

        Aluno test;
        test = alunoController.getAluno(0);

        assertTrue(test.getNome().equals("Gabriel"));
        assertTrue(test.getAltura() == 1.69);
        assertTrue(test.getIdade() == 30);
        assertTrue(test.getLargura() == 0.59);
    }
}
