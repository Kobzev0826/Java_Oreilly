package Chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui implements ActionListener {

    private JButton button;

    public static void main(String[] args) {
        SimpleGui simpleGui = new SimpleGui();
        simpleGui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        this.button = new JButton("clickme");

        // добавление к списку слушателей кнопки
        // Передаваемый аргумент объект класса, реализующий ActionListener
        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// завершение работы окна при закрытии программы

        frame.getContentPane().add(button); // добавление кнопки на форму

        frame.setSize(300,300);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        button.setText("i've been clicked!");
    }
}
