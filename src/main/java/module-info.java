module cse.classwork {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse.classwork to javafx.fxml;
    exports cse.classwork;
}