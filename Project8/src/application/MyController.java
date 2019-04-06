package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MyController {
	@FXML
	private TextField name;
	@FXML
	private Text hello1;
	@FXML
	private Button btn;
	public void ShowDate(ActionEvent event) {
		String namer = name.getText();
		hello1.setText("Hello " + namer);
    }
}