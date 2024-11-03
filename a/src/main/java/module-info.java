module a {
    requires javafx.controls;
    requires javafx.fxml;

    opens a to javafx.fxml;
    exports a;
}
