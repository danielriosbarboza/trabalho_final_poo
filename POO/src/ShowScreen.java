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

public class ShowScreen {
    int i;

    @FXML
    private Label message;

    @FXML
    private TextField product;

    @FXML
    private Label locale;

    @FXML
    void showproduct(ActionEvent event) throws IOException {

        String vizualString = "Produto = " + product.getText();
        System.out.println(vizualString);

        File file1 = new File("C:/Users/Daniel/OneDrive/Documentos/POO/Produtos");
        int count = file1.listFiles().length;
        for (i = 0; i < count; i++) {
            FileReader file = new FileReader(
                    "C:/Users/Daniel/OneDrive/Documentos/POO/Produtos/" + (i + 1) + ".txt");
            BufferedReader leitor = new BufferedReader(file);
            String adress = "C:/Users/Daniel/OneDrive/Documentos/POO/Produtos/" + (i + 1) + ".txt";
            String line = leitor.readLine();

            if (vizualString.equals(line)) {
                leitor.close();
                file.close();
                try {
                    product.setText("");
                    java.nio.file.Path path = Paths
                            .get("C:/Users/Daniel/OneDrive/Documentos/POO/Produtos/" + (i + 1) + ".txt");
                    List<String> lines = Files.readAllLines((java.nio.file.Path) path);
                    String listString = String.join("\n", lines);
                    System.out.println(listString);
                    product.setText("");
                    message.setText(listString);
                    locale.setText(adress);
                    break;

                } catch (Exception erro) {

                }
            } else {
                product.setText("");
                message.setText("Produto não encontrado, escreva novamente.");

            }

        }
    }

    @FXML
    void loadingTxt(ActionEvent event) throws IOException {

        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        desktop.open(new File("C:/Users/Daniel/OneDrive/Documentos/POO/Produtos/" + (i + 1) + ".txt"));

    }

}
