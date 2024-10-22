module com.example.tugasmodul3proglan {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tugasmodul3proglan to javafx.fxml;
    exports com.example.tugasmodul3proglan;
    exports org.example;
    opens org.example to javafx.fxml;
}