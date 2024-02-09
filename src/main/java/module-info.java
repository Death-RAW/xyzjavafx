module com.example.xyz {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.xyz to javafx.fxml;
    exports com.example.xyz;
}