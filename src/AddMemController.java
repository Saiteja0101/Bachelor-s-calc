import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddMemController {

    @FXML
    private Button AddBtn;

    @FXML
    private Button BackBtn;

    @FXML
    private TextField MemName;

    private ObservableList<String> namesList = FXCollections.observableArrayList();

    // private Stage stage;

    @FXML
    void EnterMemName(ActionEvent event) {
        // You can handle text field input here if needed
    }

    @FXML
    void OnAddMemBtnClick(ActionEvent event) {
        String name = MemName.getText();
        namesList.add(name);
        MemName.clear();
    }

    @FXML
    void OnBackBtnClick(ActionEvent event) {
         Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    public ObservableList<String> getNamesList() {
        return namesList;
    }
}
