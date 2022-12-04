import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddScreen {
    Storage product = new Storage();
    String componentes, produto, modelo;
    int quantidade, p = 0;

    @FXML
    private TextField lblComponentes;

    @FXML
    private TextField lblModelo;

    @FXML
    private TextField lblProduto;

    @FXML
    private TextField lblQuantidades;

    @FXML
    void FinishC(ActionEvent event) throws IOException {

        produto = lblProduto.getText();
        product.setProduto(produto);
        modelo = lblModelo.getText();
        product.setModelo(modelo);
        quantidade = Integer.parseInt(lblQuantidades.getText());
        System.out.println(product);
        p = 1;
        String location = String.valueOf(p);
        lblProduto.setText("");
        lblModelo.setText("");
        lblQuantidades.setText("");
        Path path = Path.of("C:/Users/Daniel/OneDrive/Documentos/POO/Produtos/"
                + location + ".txt");
        String way = "C:/Users/Daniel/OneDrive/Documentos/POO/Produtos/" + location
                + ".txt";
        for (int c = 0; c < 100; c++) {
            if (Files.notExists(path)) {
                FileWriter writer = new FileWriter(way, true);
                try {
                    writer.write(product.toString());
                } catch (Exception erro) {

                }
                for (int x = 0; x < quantidade; x++) {
                    product.setLocationComp(x);
                    System.out.println(product.getComp());
                    writer.write(product.getComp());
                }
                writer.close();
                File file = new File("C:/Users/Daniel/OneDrive/Documentos/POO/Produtos");
                int count = file.listFiles().length;
                for (int y = 0; y < count; y++) {
                    path = Paths.get(
                            "C:/Users/Daniel/OneDrive/Documentos/POO/Produtos/" + (y + 1) + ".txt");
                    List<String> lines = Files.readAllLines((java.nio.file.Path) path);
                    String listString = String.join("", lines);
                    product.setLocationComp(y);
                    product.setStorage(listString);
                }
                p = 0;
                break;
            } else {
                location = String.valueOf(c + 1);
                path = Path.of("C:/Users/Daniel/OneDrive/Documentos/POO/Produtos/"
                        + location + ".txt");
                way = "C:/Users/Daniel/OneDrive/Documentos/POO/Produtos/" + location
                        + ".txt";
            }
        }

    }

    @FXML
    void RegistrarComp(ActionEvent event) {

        componentes = lblComponentes.getText();
        product.setLocationComp(p);
        product.setComp(componentes);
        System.out.println(product.getComp());
        lblComponentes.setText("");
        p++;

    }

}
