package academia;

import java.io.IOException;
import academia.modelo.*;

/**
 * Hello world!
 */
public final class App {

    public static void limparTela() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Jaedson", 10, 1.67, 0.57);
        a1.getDados();

    }
}
