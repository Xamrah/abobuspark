package me.xamrah.abobusparkoop.application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import me.xamrah.abobusparkoop.FxWeaverSpringBootStarterSampleApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class SpringbootJavaFxApplication extends Application {

    private ConfigurableApplicationContext context;

    @Override
    public void init() throws Exception {
        this.context = new SpringApplicationBuilder()
                .sources(FxWeaverSpringBootStarterSampleApplication.class)
                .run(getParameters().getRaw().toArray(new String[0]));
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        context.publishEvent(new StageReadyEvent(primaryStage));
    }

    @Override
    public void stop() throws Exception {
        context.close();
        Platform.exit();
    }
}
