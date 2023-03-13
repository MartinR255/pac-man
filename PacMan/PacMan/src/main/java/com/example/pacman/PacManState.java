package com.example.pacman;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.Serializable;

public class PacManState implements Serializable {

    public class SquareState implements Serializable {
        int type;
        transient ImageView image;
        public SquareState(int t){
        }

        public void loadImage(){
        }
    }
    public static PacManState load(String filePath){
        return null;
    }

    public static void save(String filePath){
    }
}
