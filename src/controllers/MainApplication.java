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
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
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

    public static interface onChangeScreen{
            void onScreenChanged(Scene newScreen, Object userData);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
        //recebe a stage inicial para realizar a troca 
        primaryStage = stage;

        //seta titulo do sistema
        primaryStage.setTitle("Make Beer");
        primaryStage.setResizable(false);
                
        AnchorPane home = FXMLLoader.load(getClass().getResource("/views/Home.fxml"));
        homePane = new Scene(home);

        stage.setScene(homePane);
        stage.show();
        
        Image image = new Image("/img/icon.png");

        stage.getIcons().add(image);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
     
    private static ArrayList<onChangeScreen> listenners = new ArrayList<onChangeScreen>();

    public static void addOnChangeScreenListenner(onChangeScreen newListener) {
         listenners.add(newListener);
    }
    
    public static Scene getHomeScene() {
        return homePane;
    }
    
    private static void notifyAllList(Scene focusScreen, Object userData) {
        for (onChangeScreen l : listenners) {
                l.onScreenChanged(focusScreen, userData);
        }
    }
}
