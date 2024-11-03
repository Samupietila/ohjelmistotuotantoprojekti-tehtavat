package a;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }
//     @Override
//     public void start(Stage stage) {
//     Scene scene = new Scene(new javafx.scene.control.Label("FXML Loading Test"), 640, 480);
//     stage.setScene(scene);
//     stage.show();
// }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }
    private static Parent loadFXML(String fxml) throws IOException {
        String resourcePath = fxml + ".fxml";
        System.out.println("Attempting to load FXML from: " + resourcePath);
    
        if (App.class.getResource(resourcePath) == null) {
            System.out.println("FXML file not found at path: " + resourcePath);
            throw new IOException("FXML file not found at path: " + resourcePath);
        }
    
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(resourcePath));
        return fxmlLoader.load();
    }
//     private static Parent loadFXML(String fxml) throws IOException {
//     FXMLLoader fxmlLoader = new FXMLLoader(new File("/Users/samupietila/Ohjelmistotuotantoprojekti_tehtavat/src/main/resources/primary.fxml").toURI().toURL());
//     return fxmlLoader.load();
// }
    

    public static void main(String[] args) {
        launch();
    }

}
