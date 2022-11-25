import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Delete extends Storage {

    public void delete(Scanner sc) throws IOException {
        FileReader file = new FileReader(
                "E:/Documentos/Workspace - Java/java-in-vscode/Interface Gráfica/Produtos/1.txt");
        BufferedReader buffer = new BufferedReader(file);
        // read the 1st line
        String line = buffer.readLine();
        // display the 1st line
        System.out.println(line);

        String comparar = "Produto: Estacao de Solda";
        if (comparar.equals(line)) {
            System.out.println("É igual");
        }

        buffer.close();

    }
}
