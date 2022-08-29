package Chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui {

    private JButton button;
    private JLabel label1;
    private JButton buttonChangeLabel;
    JFrame frame;

    public static void main(String[] args) {
        SimpleGui simpleGui = new SimpleGui();
        simpleGui.go();
    }


    public void go() {
        this.frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// завершение работы окна при закрытии программы

        this.button = new JButton("clickme");
        // добавление к списку слушателей кнопки
        // Передаваемый аргумент объект класса, реализующий ActionListener
        button.addActionListener(new ColorListener());

        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, button); // добавление кнопки на форм

        this.label1 = new JLabel("Label1");
        frame.getContentPane().add(BorderLayout.WEST, label1);

        this.buttonChangeLabel = new JButton("Change Label");
        this.buttonChangeLabel.addActionListener(new LabelButtonListener());
        frame.getContentPane().add(BorderLayout.EAST, buttonChangeLabel);


        frame.setSize(500, 500);

        frame.setVisible(true);
    }

    class ColorListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
            //button.setText("i've been clicked!");
        }
    }

    class LabelButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            label1.setText("Text");
        }
    }
}
