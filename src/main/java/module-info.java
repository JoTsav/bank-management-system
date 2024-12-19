module com.dev.bank {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.dev.bank to javafx.fxml;
    exports com.dev.bank;
}
