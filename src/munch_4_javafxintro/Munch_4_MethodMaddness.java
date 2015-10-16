/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package munch_4_javafxintro;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
        

public class Munch_4_MethodMaddness extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(1000, 1000);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        drawShapes2(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    private void drawShapes(GraphicsContext gc) {
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.GREY);
        int shiftx = 250;
        gc.fillPolygon(new double []{130, 160+shiftx, 450+shiftx},
                new double []{600, 200, 600}, 3);
        gc.strokePolygon(new double []{130, 160+shiftx, 450+shiftx},
                new double []{600, 200, 600}, 3); 
        gc.setFill(Color.CORNFLOWERBLUE);
        gc.fillRect(100, 600, 600, 500);
        gc.setFill(Color.FIREBRICK);
        gc.setStroke(Color.BLACK);
        gc.strokeRect(100, 600, 600, 500);
        gc.fillRect(100, 400, 150, 1500);
        gc.strokeRect(100, 400, 150, 1000); 
        
    }
    private void drawShapes2(GraphicsContext gc) {
        gc.setFill(Color.SIENNA);
        gc.setStroke(Color.BLACK);
        gc.strokeRect(500, 850, 100, 1000);
        gc.fillRect(500, 850, 100, 1000);
    }
}