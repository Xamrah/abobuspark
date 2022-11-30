package me.xamrah.abobusparkoop;

import javafx.application.Application;
import me.xamrah.abobusparkoop.application.SpringbootJavaFxApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FxWeaverSpringBootStarterSampleApplication {

    public static void main(String[] args) {
        Application.launch(SpringbootJavaFxApplication.class, args);
    }

}
