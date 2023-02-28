package com.example.pacman;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class PacManGame extends Application {
    public PacManGame(){

    }

    public class PacManPlayer extends Thread{
        public PacManPlayer(){
        }

        @Override
        public void run() {
            super.run();
        }
    }

    public class GhostNPC extends Thread{
        public GhostNPC(){
        }

        @Override
        public void run() {
            super.run();
        }
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PacManGame.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public class SquarePane extends Pane {  //jeden stvorcek na gride

        public  SquarePane(){}
        public void paint(){

        }
    }

    public class PlaygroundPane extends GridPane {   //celu obrazovku

        public  PlaygroundPane(){}
        public void paint(){

        }
    }


    public static void main(String[] args) {
        launch();
    }
}