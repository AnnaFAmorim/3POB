import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class FileAppService {
    public void Processamento() {
        String nomeArq = "arquivoTeste.txt";
        CreateFile createFile = new CreateFile();
        if (!createFile.CriarArquivoNovo(nomeArq)) {
            System.out.println("PROBLEMA DE CRIAÇÃO DE ARQUIVO!");
        } else {
            try {
                FileWriter arquivo = new FileWriter(nomeArq);
                Random random = new Random();
                for (int i = 0; i < 4; i++) {
                    Frete frete = new Frete(
                            i + 1,
                            34567890 + i,
                            12345678 + i,
                            45.67 + i
                    );
                    arquivo.write(frete.toString() + "\n");
                }
                arquivo.write("Arquivo novo criado em Java.");
                arquivo.close();
            } catch (IOException e) {
                System.out.println("Erro na escrita do arquivo: " + e.getMessage());
                e.printStackTrace();
            }
        }
        try {
            LeituraArquivo(nomeArq);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void LeituraArquivo(String nomeArquivo) throws FileNotFoundException {
        try {
            File arq = new File(nomeArquivo);
            Scanner leitor = new Scanner(arq);
            System.out.println("Vou Ler o Arquivo: " + nomeArquivo);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println("Linha do Arquivo: " + linha);
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro na leitura do arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
