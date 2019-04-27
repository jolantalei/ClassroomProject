import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UILesson  extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vBox = new VBox();
        Button button = new Button("Login");

        TextField username = new TextField();
        username.setPromptText("Username");

        vBox.getChildren().addAll(username, button);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {//anonīma metode iekšā klasē
                Button popUp = new Button("Hello");
                vBox.getChildren().add(popUp);
            }
        });



        Scene scene = new Scene(vBox, 640, 480);//nosaka ka scene būs ar šādu mūsu definētu layout
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
