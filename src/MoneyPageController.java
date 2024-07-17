import java.math.BigDecimal;
import java.text.DecimalFormat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MoneyPageController {

    @FXML
    private Button BackBtn;

    @FXML
    private Label DisplayMoney;

    @FXML
    void OnBackBtnClick(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
    public void setMoney(BigDecimal moneyyBigDecimal) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String formattedMoney = "₹ " + decimalFormat.format(moneyyBigDecimal);
        DisplayMoney.setText(formattedMoney);
    }

}
