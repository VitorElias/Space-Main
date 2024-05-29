module br.com.Vitor {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.Vitor to javafx.fxml;
    exports br.com.Vitor;
}
