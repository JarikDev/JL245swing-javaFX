package com;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.*;

public class Main   {
    public static void main(String[] args) {
        JFrame frame =new JFrame("Swing and JavaFX");
        JFXPanel jfxPanel=new JFXPanel();
        frame.add(jfxPanel);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Group root=new Group();
        Scene scene=new Scene(root, Color.YELLOW);
        root.getChildren().addAll(new Button("Press Me"));
       jfxPanel.setScene(scene);
    }
}























