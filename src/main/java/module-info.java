module org.example.resultsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.resultsystem to javafx.fxml;
    exports org.example.resultsystem;
    exports org.example.resultsystem.model;
    opens org.example.resultsystem.model to javafx.fxml;
    exports org.example.resultsystem.controller;
    opens org.example.resultsystem.controller to javafx.fxml;
    exports org.example.resultsystem.databaseConnection;
    opens org.example.resultsystem.databaseConnection to javafx.fxml;
}