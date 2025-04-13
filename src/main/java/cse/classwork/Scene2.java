package cse.classwork;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Scene2
{
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TextArea textArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void goToScene1(ActionEvent actionEvent) {
        try{
            SceneSwitcher.switchTo("scene1");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @javafx.fxml.FXML
    public void raedOnClick(ActionEvent actionEvent){
       try(FileReader reader = new FileReader("data.txt"))
       {
           String content ="";
           while(true){
               int i = reader.read();
               if(i==-1)
                   break;
               content= content + (char) i;
           }
           textArea.setText(content);
       } catch (Exception e) {
           label.setText("Could not load the file");
       }
    }
}