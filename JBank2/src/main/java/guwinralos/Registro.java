package guwinralos;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Registro extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tela de Registro");

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);

        // Campos de entrada
        TextField tfNome = new TextField();
        tfNome.setPromptText("Nome");

        TextField tfCpf = new TextField();
        tfCpf.setPromptText("CPF");

        DatePicker dpDataNascimento = new DatePicker();
        dpDataNascimento.setPromptText("Data de Nascimento");

        TextField tfEmail = new TextField();
        tfEmail.setPromptText("Email");

        PasswordField pfSenha = new PasswordField();
        pfSenha.setPromptText("Senha");

        // registro
        Button btnRegistrar = new Button("Registrar");
        btnRegistrar.setOnAction(e -> {
            String nome = tfNome.getText();
            String cpf = tfCpf.getText();
            String dataNascimento = dpDataNascimento.getValue().toString();
            String email = tfEmail.getText();
            String senha = pfSenha.getText();
            
            // salvar esses dados em um banco de dados ou estrutura.
            System.out.println("Registro com sucesso! Dados: " + nome + ", " + cpf + ", " + dataNascimento + ", " + email);
        });

        grid.add(new Label("Nome:"), 0, 0);
        grid.add(tfNome, 1, 0);

        grid.add(new Label("CPF:"), 0, 1);
        grid.add(tfCpf, 1, 1);

        grid.add(new Label("Data de Nascimento:"), 0, 2);
        grid.add(dpDataNascimento, 1, 2);

        grid.add(new Label("Email:"), 0, 3);
        grid.add(tfEmail, 1, 3);

        grid.add(new Label("Senha:"), 0, 4);
        grid.add(pfSenha, 1, 4);

        grid.add(btnRegistrar, 1, 5);

        Scene scene = new Scene(grid, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
