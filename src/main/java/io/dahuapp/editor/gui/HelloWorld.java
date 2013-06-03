/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io.dahuapp.editor.gui;

 
import java.net.URL;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
 
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
      primaryStage.setTitle("java-buddy.blogspot.com");
     
      myBrowser = new MyBrowser();
      scene = new Scene(myBrowser, 640, 480);
     
      primaryStage.setScene(scene);
      primaryStage.show();
  }
 
  class MyBrowser extends Region{
     
      HBox toolbar;
     
      WebView webView = new WebView();
      WebEngine webEngine = webView.getEngine();
     
      public MyBrowser(){
         
          final URL urlHello = getClass().getResource("helloWorld.html");
          webEngine.load(urlHello.toExternalForm());
              
  }
 
}
}