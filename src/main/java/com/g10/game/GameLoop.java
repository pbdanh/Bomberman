package com.g10.game;

import com.g10.screens.ScreenManager;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

import java.io.FileNotFoundException;

public class GameLoop {
    static long deltaTime = System.nanoTime();

    public static void start() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(16), actionEvent -> {
            ScreenManager.getCurrentScreen().update((float) ((System.nanoTime() - deltaTime) / 1000000000.0));
            deltaTime = System.nanoTime();
            try {
                ScreenManager.getCurrentScreen().render();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}
