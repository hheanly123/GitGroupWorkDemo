module com.example.gitgroupworkdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitgroupworkdemo to javafx.fxml;
    exports com.example.gitgroupworkdemo;
}