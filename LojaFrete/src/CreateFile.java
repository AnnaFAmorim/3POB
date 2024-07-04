import java.io.File;
import java.io.IOException;

public class CreateFile {
    public boolean CriarArquivoNovo(String filename) {
        try {
            File myObj = new File(filename);
            if (myObj.createNewFile()) {
                System.out.println("Arquivo criado: " + myObj.getName());
            } else {
                System.out.println("Arquivo existe.");
            }
            return true;
        } catch (IOException e) {
            System.out.println("Erro.");
            e.printStackTrace();
            return false;
        }
    }
}
