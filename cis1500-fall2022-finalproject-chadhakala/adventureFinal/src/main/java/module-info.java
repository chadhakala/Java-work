module com.example.adventurefinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.adventurefinal to javafx.fxml;
    exports com.example.adventurefinal;
}