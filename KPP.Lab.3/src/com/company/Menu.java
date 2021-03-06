package com.company;

import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu {

    JFrame menu;
    Owner menuOwner;
    JPanel menuPanel;
    JButton poodleBtn,
            terrierBtn,
            shepherdBtn;
    MaGUI nextWindow;

    Menu() {
        menuOwner = new Owner();

        menu = new JFrame("Menu");
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuPanel = new JPanel();

        poodleBtn = new JButton("Poodle");
        poodleBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuOwner.getDog("Poodle");
                menu.setVisible(false);
                nextWindow = new MaGUI(menuOwner,Menu.this);
                nextWindow.window.setVisible(true);
            }
        });
        menuPanel.add(poodleBtn);

        terrierBtn = new JButton("Terrier");
        terrierBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuOwner.getDog("Terrier");
                menu.setVisible(false);
                nextWindow = new MaGUI(menuOwner,Menu.this);
                nextWindow.window.setVisible(true);
            }
        });
        menuPanel.add(terrierBtn);

        shepherdBtn = new JButton("Shepherd Dog");
        shepherdBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuOwner.getDog("Shepherd Dog");
                menu.setVisible(false);
                nextWindow = new MaGUI(menuOwner,Menu.this);
                nextWindow.window.setVisible(true);
            }
        });
        menuPanel.add(shepherdBtn);

        menu.getContentPane().add(menuPanel);
        menu.pack();
        menu.setLocationRelativeTo(null);
    }
}
