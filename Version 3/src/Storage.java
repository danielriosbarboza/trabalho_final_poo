import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Storage {

    Lab s = new Lab();

    public void Objects(Scanner sc) throws IOException {
        File file = new File("E:/Documentos/Workspace - Java/java-in-vscode/Trabalho Final POO/Produtos");
        int count = file.listFiles().length;
        for (int i = 0; i < count; i++) {
            Path path = Paths.get(
                    "E:/Documentos/Workspace - Java/java-in-vscode/Trabalho Final POO/Produtos/" + (i + 1)
                            + ".txt");
            List<String> lines = Files.readAllLines(path);
            String listString = String.join("", lines);
            s.setLocationComp(i);
            s.setStorage(listString);
            System.out.println("Numero" + (i + 1) + ": " + s.getStorage() + "\n\n");
        }
    }
}