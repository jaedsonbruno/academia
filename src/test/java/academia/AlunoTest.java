package academia;

import org.junit.jupiter.api.Test;

import academia.modelo.Aluno;

import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {
    
    @Test
    void testeNome(){
        Aluno a1 = new Aluno();
        a1.setNome("Jaedson");
        assertTrue(a1.getNome().equals("Jaedson"));
    }
}
