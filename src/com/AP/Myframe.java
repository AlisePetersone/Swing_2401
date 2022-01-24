package com.AP;
import javax.swing.*;
import java.awt.*;

public class Myframe extends JFrame {

    Myframe(){

        this.setTitle("TO-DO list"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setAutoRequestFocus(false); //prevent frame from being resized
        this.setSize(420,600); // sets the x-dimension, y-dimension of frame
        this.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("fox.png"); //create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(new Color(123,50,250)); //change color of background


    }
}
