package cse.classwork;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.FileWriter;
import java.io.IOException;

public class Scene1
{
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TextArea textArea;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void writeOnClick(ActionEvent actionEvent) {
        try(FileWriter fileWriter = new FileWriter("data.txt"))
        {
            fileWriter.write(textArea.getText());
            label.setText("Saved to data.txt");
        } catch (IOException e) {
            label.setText("Could not write to file");
        }
    }


    @javafx.fxml.FXML
    public void goToScene2(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("scene2");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}