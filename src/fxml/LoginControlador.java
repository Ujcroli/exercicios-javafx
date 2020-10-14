package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {

	@FXML
	private TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;
	
	
	public void entrar() {
		
		boolean emailValido = campoEmail.getText().equals("jonathan@gmail.com");
		boolean senhaValida = campoSenha.getText().equals("123456789");
		
	
		if (emailValido && senhaValida) {
			Notifications.create().title("Login FXML").text("Login efetuado com sucesso!").showInformation();
		} else {
			Notifications.create().title("Login FXML").text("Usuario/Senha inválidos!").showError();
		}
	}
}
