package ch.makery.address;/**
 * Created by m0rn on 19.10.2016.
 */

import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {
    private Stage primaryStage;
    private BorderPane rootLayout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");
        initRootLayout();
        showPersonalOverview();
    }

    private void showPersonalOverview() {

    }
    //Инициализируем корневой макет
    public void initRootLayout() {
        
    }
}
