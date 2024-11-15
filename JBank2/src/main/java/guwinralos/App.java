package guwinralos;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Bem vindo ao JBank");

        VBox vbox = new VBox(15);
        Button btnRegistro = new Button("Registrar");
        Button btnLogin = new Button("Login");

        btnRegistro.setOnAction(e -> {
            Registro registro = new Registro();
            registro.start(new Stage());
        });

        btnLogin.setOnAction(e -> {
            Login login = new Login();
            login.start(new Stage());
        });

        vbox.getChildren().addAll(btnRegistro, btnLogin);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
