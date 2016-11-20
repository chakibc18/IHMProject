/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetihm2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.MotionBlur;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;

/**
 *
 * @author HP
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private HBox hbox;

    @FXML
    private ImageView imgmain;
    
    Image picture ;
    
    
    @FXML
    Button addButton;
    @FXML
    private AnchorPane add;
    @FXML
    private RadioButton radioOriginal;
    @FXML
    private RadioButton radioBlur;
    @FXML
    private RadioButton radioGlaussian;
    @FXML
    private RadioButton radioShadow;
    @FXML
    private RadioButton radioSepia;
    @FXML
    private Button stop;
    @FXML
    private Button play;
    @FXML
    private Button pause;

    /**
     *
     * @param event
     */
    @FXML
    public void addimage() {

        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(null); // pour choisir le fichier

        try {

            String path = file.getAbsolutePath();                 // on récoupere l'emplacement du fichier
            InputStream inputStream = new FileInputStream(path);  // on crée un input stream du fichier récouperer

            picture = new Image(inputStream);

            ImageView img = new ImageView();
            img.setFitWidth(150);
            img.setFitHeight(150);
            img.setImage(picture);

            img.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event1) -> {
                ImageView view = (ImageView) event1.getTarget(); // on récoupére l'imageview lors du click
                imgmain.setImage(view.getImage());
            });

            hbox.getChildren().add(img);

        } catch (IOException ex) {
        }

    }
    
    //Les effets pour les images
     @FXML
    public void effecOrigin() {

        imgmain.setEffect(null);
        radioSepia.setSelected(false);
        radioShadow.setSelected(false);
        radioBlur.setSelected(false);
        radioGlaussian.setSelected(false);
    }
    @FXML
    public void effecBlur() {

        MotionBlur mb = new MotionBlur();
        mb.setRadius(15.0f);
        mb.setAngle(45.0f);
        imgmain.setEffect(mb);
        radioSepia.setSelected(false);
        radioShadow.setSelected(false);
        radioOriginal.setSelected(false);
        radioGlaussian.setSelected(false);
        

    }
    @FXML
    public void effecGaluss() {

           imgmain.setEffect(new GaussianBlur());
           radioSepia.setSelected(false);
           radioShadow.setSelected(false);
           radioBlur.setSelected(false);
           radioOriginal.setSelected(false);
    }
    @FXML
    public void effecShadow() {
             InnerShadow is = new InnerShadow();
             is.setOffsetX(2.0f);
             is.setOffsetY(2.0f);
 
           imgmain.setEffect(is);
           radioSepia.setSelected(false);
        radioOriginal.setSelected(false);
        radioBlur.setSelected(false);
        radioGlaussian.setSelected(false);
    }
     
 @FXML
    public void effecSepia() {
             SepiaTone sepiaTone = new SepiaTone();
             sepiaTone.setLevel(0.7);
 
           imgmain.setEffect(sepiaTone);
           radioOriginal.setSelected(false);
        radioShadow.setSelected(false);
        radioBlur.setSelected(false);
        radioGlaussian.setSelected(false);
    }
    /////fin des effets
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
