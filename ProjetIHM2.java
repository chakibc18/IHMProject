/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetihm2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class ProjetIHM2 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        
        Scene scene = new Scene(root);
        /*
        ImageView imageview = new ImageView();
        ImageView imagethumb = new ImageView();
        imageview.setFitHeight(100);
        imageview.setFitWidth(100);
        
        imagethumb.setFitHeight(100);
        imagethumb.setFitWidth(100);
        List<File> images = new ArrayList<>();
        
        
        final FileChooser filechooser = new FileChooser();
        
        Button add = new Button("Add New");
        
        add.setMinWidth(75);
        add.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            
                 try {
            //get img url
            File file = filechooser.showOpenDialog(stage);
            
            
            if (file.isFile() && file.getName().contains(".jpg")||file.getName().contains(".png")||file.getName().contains(".bmp")||file.getName().contains(".gif"))
                
            {
                images.add(file);
                
               
            }
           
                    // imagethumb.setImage;
                          
        }
        catch(Exception e) {}
                
                
                
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
            
            
        });
        
        */
       
        
        stage.setScene(scene);
        stage.show();
        stage.setTitle("PROJET IHM"); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
