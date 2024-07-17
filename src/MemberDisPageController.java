import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class MemberDisPageController {

    @FXML
    private Button BackBtn;

    @FXML
    private ListView<String> DisplayMemNames;

    private ObservableList<String> memberNames = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        // Initialize the ListView
        DisplayMemNames.setItems(memberNames);
    }

    public void displayNames(String name) {
        DisplayMemNames.getItems().add(name);
    }

    @FXML
    void OnBackBtnClick(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

}
