package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.SpringLayout.Constraints;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{
	
	@FXML
	private TextField txtNumber1;
	@FXML
	private TextField txtNumber2;

	@FXML
	private Label labelResult;
		
	@FXML                              // DECLARAÇÃO CORRESTPONDENTE AO CONTROLE VISUAL
	private Button btSum;

	@FXML
	public void onBtSumAction() {     // METODO DE ALERTA COM O SEUS ATRIBUTOS
		try {
		Locale.setDefault(Locale.US);
		double number1 = Double.parseDouble(txtNumber1.getText()); // PEGA O TEXTO DIGITATO CONVERTE PRA DOUBLE  ATRIBUI ELE NA VARIAVEL NUMBER1
		double number2 = Double.parseDouble(txtNumber2.getText());
		double sum = number1+number2;
		labelResult.setText(String.format("%.2f", sum));  // LANÇA O TEXTO, NA LABEL RESULT
		}
		catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse Error", e.getMessage(), AlertType.ERROR);
		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		gui.util.Constraints.setTextFieldDouble(txtNumber1);   // UTILIZA O METODO NO TXTNUMBER1
		gui.util.Constraints.setTextFieldDouble(txtNumber2);
		gui.util.Constraints.setTextFieldMaxLength(txtNumber1, 7);
		gui.util.Constraints.setTextFieldMaxLength(txtNumber2, 7);
	} 	
		
}
