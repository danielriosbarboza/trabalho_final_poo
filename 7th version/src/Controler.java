import java.io.IOException;
import java.net.URI;
import java.awt.Desktop;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controler {

    @FXML
    private TextField search;

    @FXML
    void add(ActionEvent event) {
        FXMLLoader add = new FXMLLoader(getClass().getResource("Add.fxml"));
        try {
            Scene s = new Scene(add.load());
            Stage st = new Stage();
            st.setTitle("Adicionar Screen");
            st.setScene(s);
            st.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void delete(ActionEvent event) {
        FXMLLoader add = new FXMLLoader(getClass().getResource("Deleter.fxml"));
        try {
            Scene s = new Scene(add.load());
            Stage st = new Stage();
            st.setTitle("Deletar Screen");
            st.setScene(s);
            st.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void modificar(ActionEvent event) {

        FXMLLoader add = new FXMLLoader(getClass().getResource("Uptdate.fxml"));
        try {
            Scene s = new Scene(add.load());
            Stage st = new Stage();
            st.setTitle("Update Screen");
            st.setScene(s);
            st.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void vizualizar(ActionEvent event) {
        FXMLLoader add = new FXMLLoader(getClass().getResource("Show.fxml"));
        try {
            Scene s = new Scene(add.load());
            Stage st = new Stage();
            st.setTitle("Vizualizador");
            st.setScene(s);
            st.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void search_button(ActionEvent event) {

        String searchString = search.getText();
        try {
            URI link = new URI("http://google.com/search?q=" + searchString);
            Desktop.getDesktop().browse(link);
            search.setText("");

        } catch (Exception erro) {
            System.out.println(erro);
        }

    }

}