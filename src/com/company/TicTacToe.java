package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe implements ActionListener // реализация прослушивателя действий
{
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;

    TicTacToe()
    {

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
    public void firstTurn()
    {

    }
    public void check()
    {

    }
    public void xWins(int a, int b, int c)
    {

    }
    public void oWins(int a, int b, int c)
    {

    }
}
