module com.example.base {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.base to javafx.fxml;
    exports com.example.base;
}