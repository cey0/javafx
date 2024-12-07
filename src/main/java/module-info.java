module ujianfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;
    requires javafx.base;
    requires javafx.graphics;
    requires transitive java.sql; // Menambahkan 'transitive' untuk akses ke java.sql.Connection

    opens ujianfx to javafx.fxml;

    exports ujianfx;
}
