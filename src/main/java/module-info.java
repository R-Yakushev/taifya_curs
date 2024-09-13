module local.linux.tfy_curs {
    requires javafx.controls;
    requires javafx.fxml;


    opens local.linux.tfy_curs to javafx.fxml;
    exports local.linux.tfy_curs;
}