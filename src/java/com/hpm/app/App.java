/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpm.app;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author HPM2015
 */
public class App {
    public static void main(String[] args){
        
        String question, answer1, answe2, answer3, answer4, answer5;
        Data set = new Data();
        int count = 1;
        //question = set.getQuestion(count);
        //answer1 = set.getAnswer(count);
        
        
        JFrame frame = new JFrame("Test Informatica");
        frame.setVisible(true);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Test Informatica");
        Answers answer = new Answers();
        GridBagConstraints c = new GridBagConstraints();
        
        //JPanel checkBoxPanel = new JPanel();
        JPanel panel = new JPanel(new GridBagLayout());
        //JLabel label = new JLabel("Test Informatica");
        JLabel questionLabel = new JLabel();
        c.gridx = 0;
        c.gridy = 0;
        panel.add(questionLabel, c);
        JCheckBox checkBox1 = new JCheckBox();
        c.gridx = 0;
        c.gridy = 1;
        panel.add(checkBox1, c);
        JCheckBox checkBox2 = new JCheckBox();
        c.gridx=0;
        c.gridy=2;
        panel.add(checkBox2, c);
        JCheckBox checkBox3 = new JCheckBox();
        c.gridx=0;
        c.gridy=3;
        panel.add(checkBox3, c);
        JCheckBox checkBox4 = new JCheckBox();
        c.gridx=0;
        c.gridy=4;
        panel.add(checkBox4, c);
        JCheckBox checkBox5 = new JCheckBox();
        c.gridx=0;
        c.gridy=5;
        panel.add(checkBox5, c);
        
        JButton nextButton = new JButton("Next");
        nextButton.setPreferredSize(new Dimension(100, 30));
        c.gridx=0;
        c.gridy=6;
        panel.add(nextButton, c);
        
        JButton previousButton = new JButton("Previous");
        c.gridx=1;
        c.gridy=6;
        previousButton.setPreferredSize(new Dimension(100, 30));
        panel.add(previousButton ,c);
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        
        
        //panel.add(label);
        
        
    }
}
