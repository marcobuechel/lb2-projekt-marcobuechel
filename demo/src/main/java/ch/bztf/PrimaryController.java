package ch.bztf;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void switchToDritter() throws IOException {
        App.setRoot("Dritter");
    }

    @FXML
    private void switchToVierter() throws IOException {
        App.setRoot("Vierter");
    }

    @FXML
    private void switchToFuenfter() throws IOException {
        App.setRoot("Fuenfter");
    }
}
