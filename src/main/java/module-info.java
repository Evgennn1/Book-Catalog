module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;


    opens com.example.demo to javafx.fxml, com.fasterxml.jackson.annotation,  com.fasterxml.jackson.core, com.fasterxml.jackson.databind;
    exports com.example.demo;
}