import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UpdateScreen extends App {

    String path;
    String[] linha = new String[100];
    int z = 0, i;

    @FXML
    private TextField lineNumber;

    @FXML
    private TextField modification;

    @FXML
    private Label message;

    @FXML
    private TextField produto;

    @FXML
    void search(ActionEvent event) throws IOException {

        String comparate = "Produto = " + produto.getText();

        System.out.println(comparate);

        File file1 = new File("C:/Users/Daniel/OneDrive/Documentos/POO/Produtos");
        int count = file1.listFiles().length;
        for (int i = 0; i < count; i++) {
            FileReader file = new FileReader(
                    "C:/Users/Daniel/OneDrive/Documentos/POO/Produtos/" + (i + 1) + ".txt");
            BufferedReader leitor = new BufferedReader(file);
            String line = leitor.readLine();
            if (comparate.equals(line)) {
                path = "C:/Users/Daniel/OneDrive/Documentos/POO/Produtos/" + (i + 1) + ".txt";
                leitor.close();
                file.close();
                try {
                    produto.setText("");
                    java.nio.file.Path path = Paths
                            .get("C:/Users/Daniel/OneDrive/Documentos/POO/Produtos/" + (i + 1) + ".txt");
                    List<String> lines = Files.readAllLines((java.nio.file.Path) path);
                    String listString = String.join("\n", lines);
                    System.out.println(listString);
                    produto.setText("");
                    message.setText(listString);

                    BufferedReader br = new BufferedReader(
                            new FileReader("C:/Users/Daniel/OneDrive/Documentos/POO/Produtos/" + (i + 1) + ".txt"));

                    while ((linha[z] = br.readLine()) != null) {
                        System.out.println(linha[z]);
                        z++;
                    }
                    br.close();
                    break;

                } catch (Exception erro) {

                }
                break;
            } else {
                produto.setText("");
                message.setText("Produto não encontrado, escreva novamente.");

            }
            leitor.close();
        }

    }

    @FXML
    public void confirm(ActionEvent event) throws IOException {

        int line = Integer.parseInt(lineNumber.getText());

        if (line == 1) {
            String change = "Produto = " + modification.getText();
            linha[line - 1] = change;

        }
        if (line == 2) {
            String change = "Modelo = " + modification.getText();
            linha[line - 1] = change;
        }
        if (line > 3) {
            String change = "Componente" + (line - 2) + modification.getText();
            linha[line - 1] = change;
        }

        String text = "";

        for (String message : linha) {
            if (message != null) {
                text += message + "\n";
            }

        }
        message.setText(text);

        File file = new File(path);
        file.delete();
        for (int x = 0; x < z; x++) {
            System.out.println(linha[x]);
            String way = "C:/Users/Daniel/OneDrive/Documentos/POO/Produtos/" + (i + 1) + ".txt";
            FileWriter writer = new FileWriter(way, true);
            try {
                writer.write(linha[x] + "\n");
            } catch (Exception erro) {

            }
            writer.close();
            File file2 = new File("C:/Users/Daniel/OneDrive/Documentos/POO/Produtos");
            int count = file2.listFiles().length;
            for (int y = 0; y < count; y++) {
                Path path2 = Paths.get(
                        "C:/Users/Daniel/OneDrive/Documentos/POO/Produtos/" + (y + 1) + ".txt");
                List<String> lines = Files.readAllLines((java.nio.file.Path) path2);
                String listString = String.join("", lines);
                produtos.setLocationComp(y);
                produtos.setStorage(listString);

            }

        }

    }

}
