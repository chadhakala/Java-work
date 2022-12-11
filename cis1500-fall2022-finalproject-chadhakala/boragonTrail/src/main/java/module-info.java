module com.example.boragontrail {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.boragontrail to javafx.fxml;
    exports com.example.boragontrail;
}