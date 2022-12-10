module com.example.hellomtndew {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hellomtndew to javafx.fxml;
    exports com.example.hellomtndew;
}