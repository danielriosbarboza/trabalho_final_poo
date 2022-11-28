import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Delete extends Loading {

    public void delete(Scanner sc) throws IOException {
        Loading loading = new Loading();
        File file1 = new File("E:/Documentos/Workspace - Java/java-in-vscode/Trabalho Final POO/Produtos");
        int count = file1.listFiles().length;
        System.out.print("Digite o nome do produto que desejas apagar: ");
        sc.nextLine();
        String comparar = "Produto: " + sc.nextLine();

        for (int i = 0; i < count; i++) {
            FileReader file = new FileReader(
                    "E:/Documentos/Workspace - Java/java-in-vscode/Trabalho Final POO/Produtos/" + (i + 1) + ".txt");
            BufferedReader leitor = new BufferedReader(file);
            String line = leitor.readLine();

            if (comparar.equals(line)) {
                leitor.close();
                file.close();
                try {
                    File deleter = new File(
                            "E:/Documentos/Workspace - Java/java-in-vscode/Trabalho Final POO/Produtos/" + (i + 1)
                                    + ".txt");
                    deleter.delete();
                    System.out.println("Deletado com sucesso");
                } catch (Exception erro) {

                }
                loading.LoadingObjects(sc);
                break;
            }
            file.close();

            leitor.close();

        }

    }

}
