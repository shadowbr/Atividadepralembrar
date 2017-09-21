/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bigolin.livrogrimorio.app;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import org.bigolin.lib.Controller;

/**
 * FXML Controller class
 *
 * @author gamificacao
 */
public class TelaPrincipalController extends Controller {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    @FXML
    public void telaAdicionarIngrediente(){
        this.stage.setScene(getAdicionarIngredienteTela());
        this.stage.setFullScreen(true);
    }
    
    
    private Scene getAdicionarIngredienteTela() {

        Scene scene = null;
        try {
            // Loader
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(CadastroIngredienteController.class.getResource("cadastro_ingrediente.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();

            scene = new Scene(rootLayout);

        } catch (IOException e) {
            System.out.println("oi");
            e.printStackTrace();
        }
        return scene;
    }
}
