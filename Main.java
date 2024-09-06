import java.io.*;

public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Anna","123", "456", "Rua Clarimundo de Melo");
        try {
            FileOutputStream arqSer = new FileOutputStream("c:/arquillian/.anna.ser");
            ObjectOutputStream oSer = new ObjectOutputStream(arqSer);
            oSer.writeObject(a1);
            oSer.close();
            arqSer.close();

            a1.setEndereco("Estrada do Monteiro");

            System.out.println(a1);
            System.out.println("---------------------------------------");

            FileInputStream arqDes = new FileInputStream("c:/arquillian/.anna.ser");
            ObjectInputStream oDes = new ObjectInputStream(arqDes);
            a1 = (Aluno) oDes.readObject();
            oDes.close();
            arqDes.close();

            System.out.println("---------------------------------------");

            System.out.println(a1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
