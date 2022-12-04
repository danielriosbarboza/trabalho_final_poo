import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DeleteScreen extends App {

    @FXML
    private Label message;

    @FXML
    private TextField product_delete;

    @FXML
    void delete(ActionEvent event) throws IOException {

        String deleteString = "Produto = " + product_delete.getText();
        File file1 = new File("C:/Users/Daniel/OneDrive/Documentos/POO/Produtos");
        int count = file1.listFiles().length;
        for (int i = 0; i < count; i++) {
            FileReader file = new FileReader(
                    "C:/Users/Daniel/OneDrive/Documentos/POO/Produtos/" + (i + 1) + ".txt");
            BufferedReader leitor = new BufferedReader(file);
            String line = leitor.readLine();

            if (deleteString.equals(line)) {
                leitor.close();
                file.close();
                try {
                    File deleter = new File(
                            "C:/Users/Daniel/OneDrive/Documentos/POO/Produtos/" + (i + 1)
                                    + ".txt");
                    deleter.delete();
                    message.setText("Deletado com sucesso");
                    product_delete.setText("");

                } catch (Exception erro) {

                }
                File file2 = new File("C:/Users/Daniel/OneDrive/Documentos/POO/Produtos");
                count = file2.listFiles().length;
                for (int y = 0; y < count; y++) {
                    java.nio.file.Path path = Paths
                            .get("C:/Users/Daniel/OneDrive/Documentos/POO/Produtos/" + (y + 1) + ".txt");
                    List<String> lines = Files.readAllLines((java.nio.file.Path) path);
                    String listString = String.join("", lines);
                    produtos.setLocationComp(y);
                    produtos.setStorage(listString);
                }
            } else {
                message.setText("Item não econtrado, digite novamente.");
                product_delete.setText("");

            }
            file.close();

            leitor.close();

        }

    }

}
