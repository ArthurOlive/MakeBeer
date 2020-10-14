/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import beans.Receita;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import models.ReceitasModel;

/**
 * FXML Controller class
 *
 * @author Arthur
 */
public class HomeController implements Initializable {

    /**
     * Initializes the controller class.
     */
    /*Models*/
    private ReceitasModel receitasModel = new ReceitasModel();
    
    @FXML
    private Button btn_config;

    @FXML
    private Button btn_receitas;

    @FXML
    private Button btn_calc;

    @FXML
    private Pane receitas;

    @FXML
    private Pane calculadora;

    @FXML
    private Pane config;
    
    @FXML
    private ListView<Receita> vListReceitas;
    
    private List<Receita> listReceitas = new ArrayList<>();
    
    private ObservableList<Receita> observable;
    
    //private List<Receita> receitas = new ArrayList<Receita>();
    
    @FXML
    private void handleButtonMenu(ActionEvent event) {
        if (event.getSource() == btn_receitas) {
            receitas.toFront();
        } else if (event.getSource() == btn_calc) {
            calculadora.toFront();
        } else if (event.getSource() == btn_config) {
            config.toFront();
        }
    }
    
    public void loadingReceitas(){
        
        Receita r1 = receitasModel.getReceitaDefault();
        
        listReceitas.add(r1);
        
        observable = FXCollections.observableArrayList(listReceitas);
        
        vListReceitas.setItems(observable);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadingReceitas();
        MainApplication.addOnChangeScreenListenner (new MainApplication.onChangeScreen() {
            @Override
            public void onScreenChanged(Scene newScreen, Object userData) {
                if (newScreen == MainApplication.getHomeScene()) {
                    //initialize table view functionary
                    System.out.println("Screen Scene : Home");
                }
            }
        });
    }    
    
}
