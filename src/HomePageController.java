import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomePageController {

    @FXML
    private Button MemBtn;

    @FXML
    private Button MoneyBtn;

    @FXML
    private Button SpendBtn;

    @FXML
    void OnMembersBtnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MemberDisPage.fxml"));
         Stage primaryStage = new Stage();
         primaryStage.setTitle("Members");
         primaryStage.setScene(new Scene(root));
         primaryStage.show();
    }

    @FXML
    void OnMoneyBtnClick(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("MoneyDisPage.fxml"));
         Stage primaryStage = new Stage();
         primaryStage.setTitle("MoneyPage");
         primaryStage.setScene(new Scene(root));
         primaryStage.show();
    }

    @FXML
    void OnSpendBtnClick(ActionEvent event) {
        System.out.println("Spend");
    }

    @FXML
    void OnAddOrEditBtnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddOrEdit.fxml"));
         Stage primaryStage = new Stage();
        //  primaryStage.setMinHeight(400);
        //  primaryStage.setMinWidth(600);
         primaryStage.setTitle("Add/Edit");
         primaryStage.setScene(new Scene(root));
         primaryStage.show();
    }

    @FXML
    void OnExitBtnClick(ActionEvent event) {
        System.exit(0);
    }


}
