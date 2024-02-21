module org.example.teste_de_fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens org.example.teste_de_fx to javafx.fxml;
    exports org.example.teste_de_fx;
}