/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Arthur
 */
public class MainApplication extends Application {
    
    //Scenes 
    private static Scene homePane;  
    
    //Scenes opened
    public static Stage primaryStage;
    
    
    private static ArrayList<onChangeScreen> listenners = new ArrayList<onChangeScreen>();

    public static interface onChangeScreen{
            void onScreenChanged(Scene newScreen, Object userData);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
        //recebe a stage inicial para realizar a troca 
        primaryStage = stage;

        //seta titulo do sistema
        //primaryStage.setTitle("Make Beer");
        
        AnchorPane home = FXMLLoader.load(getClass().getResource("Home.fxml"));
        homePane = new Scene(home);

        stage.setScene(homePane);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
   public static void addOnChangeScreenListenner(onChangeScreen newListener) {
        listenners.add(newListener);
   }
    
   
    public static Scene getHomeScene() {
        return homePane;
    }
}
