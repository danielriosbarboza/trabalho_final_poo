import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Localizar {
    public void locale(Scanner sc) throws IOException {
        File file1 = new File("E:/Documentos/Workspace - Java/java-in-vscode/Trabalho Final POO/Produtos");
        int count = file1.listFiles().length;
        System.out.print("Digite o nome do produto que desejas localizar: ");
        sc.nextLine();
        String comparar = "Produto: " + sc.nextLine();
        String adress;

        for (int i = 0; i < count; i++) {
            FileReader file = new FileReader(
                    "E:/Documentos/Workspace - Java/java-in-vscode/Trabalho Final POO/Produtos/" + (i + 1) + ".txt");
            BufferedReader leitor = new BufferedReader(file);
            String line = leitor.readLine();
            adress = "E:/Documentos/Workspace - Java/java-in-vscode/Trabalho Final POO/Produtos/" + (i + 1) + ".txt";

            if (comparar.equals(line)) {
                leitor.close();
                System.out.println("O produto está localizado em: " + adress);
                file.close();
                break;
            }
            file.close();

            leitor.close();

        }

    }

}
