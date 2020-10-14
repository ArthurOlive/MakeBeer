/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.Scene;

/**
 * FXML Controller class
 *
 * @author Arthur
 */
public class HomeController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        MainApplication.addOnChangeScreenListenner (new MainApplication.onChangeScreen() {
            @Override
            public void onScreenChanged(Scene newScreen, Object userData) {
                if (newScreen == MainApplication.getHomeScene()) {
                    //initialize table view functionary
                    System.out.println("Screen Scene : Login");
                }
            }
        });
    }    
    
}
