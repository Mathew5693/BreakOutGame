package cop2513.breakout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.awt.*;

import static cop2513.breakout.Constants.*;

/**
 * Created by Mathew on 5/1/2017.
 */
public class App extends Application{



    @Override
    public void start(Stage stage) {


        Breakout breakout = new Breakout(true);
        Scene scene = new Scene(breakout.getRoot(), SCENE_WIDTH, SCENE_HEIGHT);
        stage.setScene(scene);
        stage.setTitle("Welcome to Breakout!");
        stage.show();
    }

}




