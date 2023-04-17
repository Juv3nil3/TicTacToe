module com.example.tictactoecomm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tictactoecomm to javafx.fxml;
    exports com.example.tictactoecomm;
}