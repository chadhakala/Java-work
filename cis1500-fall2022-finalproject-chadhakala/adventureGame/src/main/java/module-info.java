module com.example.adventuregame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.adventuregame to javafx.fxml;
    exports com.example.adventuregame;
}