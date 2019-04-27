import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SecondMain extends Application {

    Button button;

    public static void main(String[] args) {
        launch(args);//šī ir aplikācija, kas setapo kā javafx progammu
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //viss ko šeit rakstīs ir galvebais java fx kods
        primaryStage.setTitle("Title of the window");
        button = new Button();
        button.setText("Click me");

        button.setOnAction(e -> System.out.println("hey "));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}

