package com.AP;

import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;

public class Main {


    public static void main(String[] args) {

        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("TO-DO list"); //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setAutoRequestFocus(false); //prevent frame from being resized
        frame.setSize(420,600); // sets the x-dimension, y-dimension of frame
        frame.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("fox.png"); //create an ImageIcon
        frame.setIconImage(image.getImage()); //change icon of frame
        frame.getContentPane().setBackground(new Color(123,50,250)); //change color of background

        JLabel label = new JLabel();
        label.setText("Create your first task of this day"); //set text of label
   

//        Myframe myframe = new Myframe();



    }
}
