package guwinralos;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Login extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tela de Login");

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);

        // Campos de login
        TextField tfCpfOuEmail = new TextField();
        tfCpfOuEmail.setPromptText("CPF ou Email");

        PasswordField pfSenha = new PasswordField();
        pfSenha.setPromptText("Senha");

        // Botão de login
        Button btnLogin = new Button("Entrar");
        btnLogin.setOnAction(e -> {
            String cpfOuEmail = tfCpfOuEmail.getText();
            String senha = pfSenha.getText();
            
            // Aqui você deve validar se os dados são corretos.
            System.out.println("Login tentado com: " + cpfOuEmail);
        });

        grid.add(new Label("CPF ou Email:"), 0, 0);
        grid.add(tfCpfOuEmail, 1, 0);

        grid.add(new Label("Senha:"), 0, 1);
        grid.add(pfSenha, 1, 1);

        grid.add(btnLogin, 1, 2);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
