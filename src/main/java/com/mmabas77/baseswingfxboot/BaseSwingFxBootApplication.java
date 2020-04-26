package com.mmabas77.baseswingfxboot;

import com.mmabas77.baseswingfxboot.ui.fx.MainForm;
import com.mmabas77.baseswingfxboot.ui.swing.MainFrame;
import javafx.application.Platform;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class BaseSwingFxBootApplication implements CommandLineRunner {

    /* The Application Logger*/
    private static final Logger logger = LoggerFactory.getLogger(BaseSwingFxBootApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context
                = new SpringApplicationBuilder(BaseSwingFxBootApplication.class)
                .headless(false).run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Start Running Desktop");
        selectLook(args);
        prepareDB();
    }

    private void prepareDB() {
        logger.info("Preparing Database");
    }

    private void selectLook(String[] args) {
        boolean isSwing = true;
        logger.info("Selecting {} as the look", isSwing ? "Swing" : "JavaFx");
        if (isSwing) {
            startSwing(args);
        } else {
            startFx(args);
        }
    }

    private void startSwing(String... args) {
        logger.info("Starting Swing MainFrame");
        SwingUtilities.invokeLater(() -> MainFrame.main(args));
    }

    private void startFx(String... args) {
        logger.info("Starting JavaFx MainForm");
        Platform.startup(() -> {
            try {
                new MainForm().start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
