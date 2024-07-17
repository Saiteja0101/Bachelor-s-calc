import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginPageController {

    @FXML
    private Button LoginBtn;

    @FXML
    private TextField enterUserName;

    @FXML
    private PasswordField password;

    @FXML
    void UserNameTField(ActionEvent event) {

    }

    @FXML
    void loginBtn(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
         Stage primaryStage = new Stage();
         primaryStage.setTitle("Add Money");
         primaryStage.setScene(new Scene(root));
         primaryStage.show();
    }

    @FXML
    void pwdTField(ActionEvent event) {

    }

}
