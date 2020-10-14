package fxml;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		String arquivoCSS = getClass().getResource("/fxml/Login.css").toExternalForm();
		URL arquivoFXML = getClass().getResource("/fxml/Login.fxml");
		GridPane raix = FXMLLoader.load(arquivoFXML);
		
		Scene cene = new Scene(raix, 350, 350);
		cene.getStylesheets().add(arquivoCSS);
		
		primaryStage.setResizable(false);
		primaryStage.setTitle("Tela de Login");
		primaryStage.setScene(cene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
