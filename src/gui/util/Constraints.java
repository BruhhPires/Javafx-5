package gui.util;

import javafx.scene.control.TextField;

public class Constraints {  // CLASSE QUE DEFINI LIMITES NA DIGITAÇÃO DO CAMPO DESEJADO 
	public static void setTextFieldInteger(TextField txt) {  // METODO QUE SÓ PERMITE NUMERO INTEIROS
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && !newValue.matches("\\d*")) {
				txt.setText(oldValue);
			}
		});
	}

	public static void setTextFieldMaxLength(TextField txt, int max) { // METODO QUE GARANTE APENAS UM NUMERO X DE DIGITOS
		txt.textProperty().addListener((obs, oldValue, newValue) -> {  // O LISTENER CONTROLA O COMPORTAMENTO QUANDO O CONTROLER RECEBER ALGUM DADO
			if (newValue != null && newValue.length() > max) {
				txt.setText(oldValue);
			}
		});
	}

	public static void setTextFieldDouble(TextField txt) { // METODO QUE PERMITE ENTRADA DE NUMEROS DOUBLE
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) {
				txt.setText(oldValue);
			}
		});
	}
}