import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

public class AddorEditController {

    @FXML
    private Button AddMem;

    @FXML
    private Button AddMonBtn;

    @FXML
    private TitledPane AddorEditBtn;

    @FXML
    private Button BackBtn;

    @FXML
    private Button EditMem;

    @FXML
    private Button EditMonBtn;

    @FXML
    void OnAddMonBtnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddMoney.fxml"));
         Stage primaryStage = new Stage();
         primaryStage.setTitle("Add Money");
         primaryStage.setScene(new Scene(root));
         primaryStage.show();
    }

    @FXML
    void OnAddmemBtnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddMember.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("MoneyPage");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @FXML
    void OnBackBtnClick(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void OnEditMemBtnClick(ActionEvent event) {

    }

    @FXML
    void OnEditMonBtnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddMoney.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Edit Money");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

}
