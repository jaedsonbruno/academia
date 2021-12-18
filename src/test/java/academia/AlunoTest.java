package academia;

import org.junit.jupiter.api.Test;

import academia.controler.AlunoController;
import academia.model.Aluno;

import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {
    
    // verificando se os nomes dos alunos são os mesmos
    @Test
    void testeNomeString(){
        Aluno a1 = new Aluno();
        a1.setNome("Jaedson");
        assertTrue(a1.getNome().equals("Jaedson"));
    }

    /*
    Teste para falhar, onde verifica se os nomes são diferente
    */
    @Test
    void testeVerificarNomesDiferente(){
        Aluno a1 = new Aluno();
        a1.setNome("Gabriel");
        assertFalse(a1.getNome().equals("Jaedson"));
    }

    @Test
    void testeInserirAluno(){
        Aluno a1 = new Aluno();
        AlunoController alunoController = new AlunoController();
        a1.setNome("Gabriel");
        a1.setAltura(1.69);
        a1.setIdade(30);
        a1.setLargura(0.59);

        // inserindo elemento Aluno no BD.
        alunoController.inserirAluno(a1);

        // buscando tamanho de lista de elementos no bd.
        int tamanho = alunoController.getTamanhoLista();

        // Testando se existe apenas 1 elemento registrado no BD
        assertTrue(tamanho == 1);

        // Criando variável aluno para receber resultado de consulta
        Aluno test;
        // Selecionando o primeiro elemento adicionado
        test = alunoController.getAluno(0);

        /*
        Testando se informações obtidas pelo primeiro aluno no BD
        são os mesmo que os adicionados anteriormente
        */
        assertTrue(test.getNome().equals("Gabriel"));
        assertTrue(test.getAltura() == 1.69);
        assertTrue(test.getIdade() == 30);
        assertTrue(test.getLargura() == 0.59);
    }

}
