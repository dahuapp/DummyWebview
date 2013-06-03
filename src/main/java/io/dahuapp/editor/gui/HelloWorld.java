/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package io.dahuapp.editor.gui;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import java.net.URL;

/**
*
* @web http://java-buddy.blogspot.com/
*/
public class HelloWorld extends Application {

	private Scene scene;
	MyBrowser myBrowser;

	/**
	* @param args the command line arguments
	*/
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Webview Test");

		myBrowser = new MyBrowser();
		scene = new Scene(myBrowser, 640, 480);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	class MyBrowser extends Region{

		HBox toolbar;

		WebView webView = new WebView();
		WebEngine webEngine = webView.getEngine();

		public MyBrowser() {       
			final URL urlHello = getClass().getResource("helloWorld.html");
			webEngine.load(urlHello.toExternalForm());
			getChildren().add(webView);
		}

		protected void layoutChildren(){
			double w = getWidth();
			double h = getHeight();
			layoutInArea(webView, 0, 0, w, h, 0, HPos.CENTER, VPos.CENTER);
		}
	}
}
