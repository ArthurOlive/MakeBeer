/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import beans.Calculadora;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author mikei
 */
public class CalculadoraController implements Initializable {
    
    @FXML
    private TextField ibuField;
      
    @FXML
    private TextField abvField;
    
    @FXML
    private Button btnLimparAbv;

    @FXML
    private Button btnLimparIbu;
    
    @FXML
    private TextField inputDensidadePre;

    @FXML
    private TextField inputDensidadePos;
    
    @FXML
    private TextField inputVolumeIbu;

    @FXML
    private TextField inputUtilizacao;

    @FXML
    private TextField inputMassaLupulu;

    @FXML
    private TextField inputUnidadeAlfa;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
    @FXML
    void calcularIbu(KeyEvent event) {
        validarInput(inputVolumeIbu);
        validarInput(inputUtilizacao);
        validarInput(inputMassaLupulu);
        validarInput(inputUnidadeAlfa);
        
        if(!inputVolumeIbu.getText().isEmpty() && !inputUtilizacao.getText().isEmpty()
           && !inputMassaLupulu.getText().isEmpty() && !inputUnidadeAlfa.getText().isEmpty()) {
            double volume = Double.valueOf(inputVolumeIbu.getText());
            double utilizacao = Double.valueOf(inputUtilizacao.getText());
            double massaLupulu = Double.valueOf(inputMassaLupulu.getText());
            double unidadeAlfa = Double.valueOf(inputUnidadeAlfa.getText());
            
            String valorCalculado = String.valueOf(
                Calculadora.calcularIbu(utilizacao, massaLupulu, unidadeAlfa, volume)
            );
            ibuField.setText(valorCalculado);
        } else {
            ibuField.setText("");
        }
    }
    
    @FXML
    void calcularAbv(KeyEvent event) {
        
        validarInput(inputDensidadePos);
        validarInput(inputDensidadePre);
        
        if(!inputDensidadePos.getText().isEmpty() && !inputDensidadePre.getText().isEmpty()){
            double densidadePre = Double.valueOf(inputDensidadePre.getText());
            double densidadePos = Double.valueOf(inputDensidadePos.getText());

            String valorCalculado = String.valueOf(Calculadora.calcularAbv(densidadePre, densidadePos));
            abvField.setText(valorCalculado);
        } else {
            abvField.setText("");
        }
    }

    @FXML
    void limparAbv(MouseEvent event) {
        inputDensidadePos.setText("");
        inputDensidadePre.setText("");
        abvField.setText("");
    }

    @FXML
    void limparIbu(MouseEvent event) {
        inputVolumeIbu.setText("");
        inputUtilizacao.setText("");
        inputMassaLupulu.setText("");
        inputUnidadeAlfa.setText("");
        ibuField.setText("");
    }
    
    private void validarInput(TextField input) {
        if(validacaoInputText(input.getText())) {
            String value = input.getText();
            input.setText(value);
            input.positionCaret(value.length());
        } else if(!input.getText().isEmpty()) { 
            String value = input.getText();
            int length = value.length();
            value = value.substring(0, length - 1);
            input.setText(value);
            input.positionCaret(length);
        }
    }
    
    private boolean validacaoInputText(String text) {
         String pattern = "([-+])?(\\d)*([.])?(\\d)*";
         return (!text.isEmpty() && text.matches(pattern));
    }
}
