package cop2513.breakout;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.util.Duration;
import jdk.nashorn.internal.ir.Block;


import javax.swing.*;
import javax.swing.text.html.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.geom.Point2D;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static cop2513.breakout.Constants.*;

//java.util.ArrayList<Block>;


/**
 * Class for the Breakout game.
 */
public class Breakout {

    /*int _dy;
    int _dy;*/
    int dy = 3;


    private Timeline _timeline;

    /**
     * The root of the scene graph that holds the board of the game.
     */
    private Pane _root;

    /**
     * The ball.
     */
    private Ball ball;

    private Image _imageView;

    /**
     * Whether to draw the grid lines.
     */
    private boolean _drawGridLines;

    /**
     * Create a new Breakout game.
     *
     * @param //drawGridLines if true then draw the grid lines,
     * <p>
     * otherwise do not.
     */

    private int layout[][];

    /*private void DefaultBricks() {

        Image blockRed = new ImageViewGameObj(_root, "cop2513/breakout/images/red-block.png", BLOCK_WIDTH, BLOCK_HEIGHT);

        *//*ImageViewGameObj blockRed = new
                ImageViewGameObj(_root, "cop2513/breakout/images/red-block.png", BLOCK_WIDTH, BLOCK_HEIGHT);
        ImageViewGameObj blockBlue = new
                ImageViewGameObj(_root, "cop2513/breakout/images/blue-block.png", BLOCK_WIDTH, BLOCK_HEIGHT);
        ImageViewGameObj blockGreen = new
                ImageViewGameObj(_root, "cop2513/breakout/images/green-block.png", BLOCK_WIDTH, BLOCK_HEIGHT);
        ImageViewGameObj blockOrange = new
                ImageViewGameObj(_root, "cop2513/breakout/images/orange-block.png", BLOCK_WIDTH, BLOCK_HEIGHT);
        ImageViewGameObj blockPurple = new
                ImageViewGameObj(_root, "cop2513/breakout/images/purple-block.png", BLOCK_WIDTH, BLOCK_HEIGHT);*//*

        ImageViewGameObj[] img = {blockRed, blockBlue, blockGreen, blockOrange, blockPurple};
        Random rand = new Random();
        for(int k = 0; k < img.length; k++){

            block.setImage();

        }

            layout = new int[NUM_COLS][NUM_ROWS];
            for(int i = 0; i < layout.length; i++){
                for(int j = 0; j<layout[0].length;j++){
                    layout[i][j] = 1;

                }
            }
            for(int i = 0; i < layout.length; i++){


                for(int j = 0; j<layout[0].length;j++){
                    if(layout[i][j] > 0){





                    *//*ImageViewGameObj block = new
                            ImageViewGameObj(_root, "cop2513/breakout/images/red-block.png", BLOCK_WIDTH, BLOCK_HEIGHT);*//*
                        *//*block.setX(VERTICAL_GUTTER/NUM_ROWS +(i*BLOCK_WIDTH) );
                        block.setY(HORIZONTAL_GUTTER/NUM_COLS+(j*BLOCK_HEIGHT) );*//*
                    }

                }
            }



    }*/

   /* public static void blockList(String[] args) {

        ArrayList<Block> bblockList = new ArrayList<Block>(30);
        for (int i = 0, x = Constants.HORIZONTAL_GUTTER; i < Constants.NUM_COLS; i++, x += Constants.COL_WIDTH) {
            System.out.println("i: " + i + ", x: " + x);
            // where do the blocks go
            Block b = new Block();
            b.setX(x);
            //  add block to collection of blocks

        }
    }*/


    public Breakout(boolean drawGridLines) {
        // TODO: your implementation here

        _root = new Pane();
        /*_ball = new Pane();*/
        /*Ball ball = new Ball(_root);*/
        /*Block block;*/
        ArrayList<Block> blockList = new ArrayList<Block>(30);


        ImageViewGameObj paddle = new
                ImageViewGameObj(_root, "cop2513/breakout/images/paddle.png");

        /*ImageViewGameObj block = new
                ImageViewGameObj(_root, "cop2513/breakout/images/red-block.png", BLOCK_WIDTH, BLOCK_HEIGHT);*/
        ImageViewGameObj blockBlue = new
                ImageViewGameObj(_root, "cop2513/breakout/images/blue-block.png", BLOCK_WIDTH, BLOCK_HEIGHT);
        ImageViewGameObj blockGreen = new
                ImageViewGameObj(_root, "cop2513/breakout/images/green-block.png", BLOCK_WIDTH, BLOCK_HEIGHT);
        ImageViewGameObj blockOrange = new
                ImageViewGameObj(_root, "cop2513/breakout/images/orange-block.png", BLOCK_WIDTH, BLOCK_HEIGHT);
        ImageViewGameObj blockPurple = new
                ImageViewGameObj(_root, "cop2513/breakout/images/purple-block.png", BLOCK_WIDTH, BLOCK_HEIGHT);

        ImageViewGameObj block = new
                ImageViewGameObj(_root, "cop2513/breakout/images/red-block.png", BLOCK_WIDTH, BLOCK_HEIGHT);

        for (int i = 0, x = Constants.HORIZONTAL_GUTTER; i < Constants.NUM_COLS; i++, x += Constants.COL_WIDTH) {


            layout = new int[NUM_COLS][NUM_ROWS];
            for(int m = 0; m < layout.length; m++){
                for(int j = 0; j<layout[0].length;j++){
                    layout[m][j] = 1;

                }
            }
            for(int m = 0; m < layout.length; m++){
                for(int j = 0; j<layout[0].length;j++){
                    if(layout[m][j] > 0){


                        /*block.setX(78);
                        blockOrange.setX(234);
                        blockGreen.setX(312);
                        blockPurple.setX(390);
                        blockBlue.setX(468);
                        block.setX(546);
                        blockOrange.setX(624);
                        blockGreen.setX(702);
                        blockPurple.setX(780);*/

                        /*block.setX(VERTICAL_GUTTER/NUM_ROWS +(i*BLOCK_WIDTH) );
                        block.setY(HORIZONTAL_GUTTER/NUM_COLS+(j*BLOCK_HEIGHT) );*/





                    }

                }
            }
            System.out.println("i: " + i + ", x: " + x);
            // where do the blocks go
            block.setX(78);
            blockOrange.setX(234);
            blockGreen.setX(312);
            blockPurple.setX(390);
            blockBlue.setX(468);
            block.setX(546);
            blockOrange.setX(624);
            blockGreen.setX(702);
            blockPurple.setX(780);





            //Block b = new Block();
            //b.setX(x);
            //  add block to collection of blocks

        }









        /*ImageViewGameObj ball = new
                ImageViewGameObj(_root, "cop2513/breakout/images/bigger-ball.png");*/


        //imports image of the paddle.png and assigns it to 'paddle'


       /* for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS - HORIZONTAL_GUTTER; j++) {
                block = new Block(_root);
                blockList.add(block);
                block.setY(vertBuffer + (rowHeight * i));
                block.setX(vertBuffer + (colWidth * j));
            }
        }*/



        /*layout = new int[NUM_COLS][NUM_ROWS];
        for(int i = 0; i < layout.length; i++){
            for(int j = 0; j<layout[0].length;j++){
                layout[i][j] = 1;

            }
        }
        for(int i = 0; i < layout.length; i++){
            for(int j = 0; j<layout[0].length;j++){
                if(layout[i][j] > 0){


                    block.setX(VERTICAL_GUTTER/NUM_ROWS +(i*BLOCK_WIDTH) );
                    block.setY(HORIZONTAL_GUTTER/NUM_COLS+(j*BLOCK_HEIGHT) );





                }

            }
        }*/

        //imports image of various colored blocks and assigns them accordingly
        /*ImageViewGameObj block = new
                ImageViewGameObj(_root, "cop2513/breakout/images/red-block.png", BLOCK_WIDTH, BLOCK_HEIGHT);
        block.setY(SCENE_HEIGHT - block.getHeight() * 10);
        block.setX(SCENE_WIDTH - block.getWidth() * 5.72);*/


        /*ImageViewGameObj blockRed = new
                ImageViewGameObj(_root, "cop2513/breakout/images/red-block.png", BLOCK_WIDTH, BLOCK_HEIGHT);
        ImageViewGameObj blockBlue = new
                ImageViewGameObj(_root, "cop2513/breakout/images/blue-block.png", BLOCK_WIDTH, BLOCK_HEIGHT);
        ImageViewGameObj blockGreen = new
                ImageViewGameObj(_root, "cop2513/breakout/images/green-block.png", BLOCK_WIDTH, BLOCK_HEIGHT);
        ImageViewGameObj blockOrange = new
                ImageViewGameObj(_root, "cop2513/breakout/images/orange-block.png", BLOCK_WIDTH, BLOCK_HEIGHT);
        ImageViewGameObj blockPurple = new
                ImageViewGameObj(_root, "cop2513/breakout/images/purple-block.png", BLOCK_WIDTH, BLOCK_HEIGHT);


        ArrayList<Block> block = new ArrayList<block>();
        block.add(block);*/


        //imports image of the bigger-ball.png and assigns it to 'ball'
        ImageViewGameObj ball = new
                ImageViewGameObj(_root, "cop2513/breakout/images/bigger-ball.png");


        //sets the default location of the paddle
        paddle.setY(SCENE_HEIGHT - paddle.getHeight());
        paddle.setX((SCENE_WIDTH - paddle.getWidth()) / 2);


        //sets the default location of the ball
        ball.setX((SCENE_WIDTH - ball.getWidth()) / 2);
        ball.setY((SCENE_WIDTH - ball.getWidth()) / 2);

        //sets the default location of all the blocks
        /*blockArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            blockArrayList.add("cop2513/breakout/images/"+i+".png");
        }*/


        //create array for blocks


        //set stage boundaries


        //Timeline of the ball, where the ball is going when it hits an object
        _timeline = new Timeline(
                new KeyFrame(
                        Duration.millis(10),
                        (evt) -> {


                            ball.setY(ball.getY() + dy);


                            // is the ball hitting the paddle?
                            if (ball.getBounds().intersects(paddle.getBounds())) {

                                dy = -dy;
                            }

                            // is the ball hitting the block?
                            if (ball.getBounds().intersects(block.getBounds())) {
                                dy = -dy;
                            }
                            if (ball.getBounds().intersects(blockGreen.getBounds())) {
                                dy = -dy;
                            }
                            if (ball.getBounds().intersects(blockPurple.getBounds())) {
                                dy = -dy;
                            }
                            if (ball.getBounds().intersects(blockOrange.getBounds())) {
                                dy = -dy;
                            }
                            if (ball.getBounds().intersects(blockBlue.getBounds())) {
                                dy = -dy;
                            }




                            // is the ball hitting the boundaries
                            /*if (ball.getBounds().intersects(Stage.getBounds())) {
                                _dy = -_dy;
                            }*/


                        })
        );
        _timeline.setCycleCount(Animation.INDEFINITE);
        _timeline.play();


        //Event that will make paddle follow mouse inputs from user
        _root.setOnMouseMoved((evt) -> {
            //outputs x and y coordinates based on mouse movements with in the scene.
            //System.out.println("mouse at: (" + evt.getX() + ", " + evt.getY() + ")");
            // TODO: set center X to paddle to mouse's X
            ////Make paddle follow mouse inputs from user
            if (evt.getX() > paddle.getWidth() / 2.0D && evt.getX() < 800.0D - paddle.getWidth() / 2.0D) {
                paddle.setX(evt.getX() - 56.0D);
            }

        });


    }

    public Pane getRoot() {
        return _root;

    }

    public Image getImage() {

        return _imageView;
    }

    /*public Ball getBall(){
        return _ball;
    }*/


     /*public Pane getImage(){
         return _imageView;
     }*/


    // TODO: Your additional methods here

    /**
     * Helper method to show angle of where the ball hit.
     * IMPORTANT NOTE: Your ball class must have a
     *                 getX and getY methods that return the coordinates of the
     *                 center point of the ball.
     *
     * Based on code taken from,
     * http://gamedev.stackexchange.com/a/22614,
     * last access 4/25/2017
     *
     * @param block the block to test against.
     * @return one of BlockSide.BLOCK_TOP_BOT when the ball hit the top or bottom,
     *                BlockSide.BLOCK_LT_RT when the ball hit either the left or right side,
     *                BlockSide.BLOCK_CORNER when the ball hit a corner
     */
    /*private BlockSide (Block block) {

        final double upcorner = 63.43;
        final double botcorner = 116.56;

        final double epsilon = 0.02;

        Point2D brickFacing = new Point2D(0, -1);
        brickFacing = brickFacing.normalize();

        Point2D ballToBrick = new
                Point2D(
                        _ball.getX() - (block.getX() + block.getHalfWidth()),
                        _ball.getY() - (block.getY() + block.getHalfHeight()));
        ballToBrick = ballToBrick.normalize();
        double angle = Math.toDegrees(Math.acos(ballToBrick.dotProduct(brickFacing)));

        if (upcorner - epsilon <= angle && angle <= upcorner + epsilon) {
            // if hit close to upper corners
            return BlockSide.BLOCK_CORNER;
        }
        else if (botcorner - epsilon <= angle && angle <= botcorner + epsilon) {
            // if hit close to lower corners
            return BlockSide.BLOCK_CORNER;
        }
        else if (0 <= angle && angle < upcorner + epsilon) {
            // check top
            return BlockSide.BLOCK_TOP_BOT;
        }
        else if (botcorner + epsilon < angle) {
            // check bottom
            return BlockSide.BLOCK_TOP_BOT;
        }
        else if (upcorner + epsilon < angle && angle < botcorner - epsilon) {
            // only need 1 for this since angle is the same regardless of which
            // side we're on
            return BlockSide.BLOCK_LT_RT;
        }
        else {
            // should never occur
            throw new IllegalStateException("whichPartHit failed!");
        }
    }*/

    /**
     * Helper method to draw grid lines onto the board.
     */
    private void addGridLines() {
        // draw vertical lines
        for (int x = COL_WIDTH; x < SCENE_WIDTH; x += COL_WIDTH) {
            Line line = new Line(x, 0, x, SCENE_HEIGHT);
            line.setStroke(Color.LIGHTGREY);
            _root.getChildren().add(line);
        }

        // draw horizontal lines
        for (int y = ROW_HEIGHT; y < SCENE_HEIGHT; y += ROW_HEIGHT) {
            Line line = new Line(0, y, SCENE_WIDTH, y);
            line.setStroke(Color.LIGHTGREY);
            _root.getChildren().add(line);
        }
    }

    /**
     * Returns a random number in the given range from min (inclusive)
     * to max (exclusive).
     * Code taken from
     * https://www.mkyong.com/java/java-generate-random-integers-in-a-range/,
     * last access 4/22/2017
     *
     * @param min the min (inclusive) of the range.
     * @param max the max (exclusive) of the range.
     * @return a random number in the given range from min to max.
     */
    public static int randInRange(int min, int max) {
        Random r = new Random();
        return r.ints(min, (max + 1)).findFirst().getAsInt();
    }



}



