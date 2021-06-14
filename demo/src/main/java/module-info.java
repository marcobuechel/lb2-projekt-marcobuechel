module ch.bztf {
    requires javafx.controls;
    requires javafx.fxml;

    opens ch.bztf to javafx.fxml;
    exports ch.bztf;
}
