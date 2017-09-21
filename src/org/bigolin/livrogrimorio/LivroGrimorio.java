/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bigolin.livrogrimorio;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.bigolin.livrogrimorio.app.TelaPrincipalController;

/**
 *
 * @author gamificacao
 */
public class LivroGrimorio extends Application {
    
    private Stage primaryStage; //isso não havia em outras classes
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;

        primaryStage.setTitle("Livro de poções");
        primaryStage.setScene(getRootLayout());
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }
    
     private Scene getRootLayout() {

        Scene scene = null;
        try {
            // Loader
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(TelaPrincipalController.class.getResource("tela_principal.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            
            //observe essas duas linhas
            TelaPrincipalController tc = loader.getController();
            tc.setStage(primaryStage);
            
            scene = new Scene(rootLayout);

        } catch (IOException e) {
            System.out.println("oi");
            e.printStackTrace();
        }
        return scene;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
