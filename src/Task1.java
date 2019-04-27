import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Task1 extends Application {
    private TextField username;
    private TextField password;
    private Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Best food app");
        window = primaryStage;

        username = new TextField();
        username.setPromptText("username");

        password = new PasswordField();//PAROLES vietā punktiņi
        password.setPromptText("username");

        Button loginButton = new Button("Login");
        Button registerButton = new Button("Register");
        VBox vBox = new VBox();

        vBox.getChildren().addAll(username, password, loginButton,registerButton );

        loginButton.setOnAction(event -> {
            login();
        });
        registerButton.setOnAction(event -> {
            register();
        });

        Scene scene = new Scene(vBox, 640, 480);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void login (){
        String userNameString = username.getText();//get text dabūja lauku contentu
        String passwordString = password.getText();

        try {
             String successfulUsername = Authenticator.login(userNameString, passwordString);
            if (successfulUsername == null){//kāpēc null?
                System.out.println("failed");
            }else {
                window.close();
                System.out.println("welcome " + successfulUsername);
            }
               }catch (FileNotFoundException e){
            e.printStackTrace();//kasm šis ir?
        }
    }
    private void register(){
            String userNameString = username.getText();//get text dabūja laiku contentu
            String passwordString = password.getText();

            try {
                String registeredUser = Authenticator.registerUser(userNameString, passwordString);
                System.out.println("welcome "  + registeredUser);
            } catch (IOException e) {
                e.printStackTrace();//kas ir šis
            } catch (RuntimeException e){
                System.out.println("user exist");
            }
        }

    }





