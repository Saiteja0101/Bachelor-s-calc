import java.io.IOException;
import java.math.BigDecimal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddMoneyPageController {

    @FXML
    private TextField EnterMonBtn;

    @FXML
    private Button SubmitBtn;

    @FXML
    void EnterMoneyBtn(ActionEvent event) {
        data();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void OnSubmitBtnClick(ActionEvent event) {
       data();
       Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();

    }
    private void data() {
    String moneyText = EnterMonBtn.getText();
    try {
        BigDecimal money = new BigDecimal(moneyText);
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MoneyDisPage.fxml"));
        Parent root = loader.load();
        MoneyPageController controller = loader.getController();
        controller.setMoney(money);
        Stage stage = new Stage();
        stage.setTitle("MoneyPage");
        stage.setScene(new Scene(root));
        stage.show();
        
        SubmitBtn.setDisable(false);
    } catch (NumberFormatException | IOException e) {
        SubmitBtn.setDisable(true);
    }
}


}
