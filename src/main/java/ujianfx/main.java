package ujianfx;

import javafx.application.Application;
import javafx.stage.Stage;

public class main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Set primaryStage ke SceneManager
        SceneManager.setStage(primaryStage);

        // Panggil scene awal
        SceneManager.switchScene("/fxml/FXMLLogin.fxml");

        // Log koneksi database
        if (Model.connect() != null) {
            System.out.println("Koneksi database berhasil");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
