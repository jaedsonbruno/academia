package academia;

import org.junit.jupiter.api.Test;

import academia.modelo.Aluno;

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
}
