package br.com.bots.farming.laenhanced.main;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LaEnhanced extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane root = new Pane();
		configureRoot(root);
		Scene scene = new Scene(root, 400, 400);
		scene.getStylesheets().add("style.css");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void configureRoot(Pane root) {
		ToggleButton onOff = new ToggleButton("OFF");
		onOff.setPrefSize(400, 400);
		onOff.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				
			}
		});
		
		root.getChildren().add(onOff);
	}
}
