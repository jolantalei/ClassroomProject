import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SwitchScenes extends Application {
    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        //viss ko šeit rakstīs ir galvebais java fx kods
        window = primaryStage;
        Label label1 = new Label("welcome to the first scene");
        Button button1 = new Button("go to 2 scene");
        button1.setOnAction(e -> window.setScene(scene2));

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);

        Button button2 = new Button("go to first scene");
        button2.setOnAction(event -> window.setScene(scene1));

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);//šis pievieno pogu
        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene1);//ar kuru skatu sākt
        window.setTitle("title here");
        window.show();//lai sāk rādīt




    }



}
