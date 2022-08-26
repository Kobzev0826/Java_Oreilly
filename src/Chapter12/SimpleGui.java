package Chapter12;

import javax.swing.*;

public class SimpleGui {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("clickme");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// завершение работы окна при закрытии программы

        frame.getContentPane().add(button); // добавление кнопки на форму

        frame.setSize(300,300);

        frame.setVisible(true);
    }

}
