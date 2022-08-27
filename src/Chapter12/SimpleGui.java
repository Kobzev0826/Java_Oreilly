package Chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui implements ActionListener {

    private JButton button;
    private JLabel label1;
    private JButton buttonChangeLabel;
    JFrame frame;

    public static void main(String[] args) {
        SimpleGui simpleGui = new SimpleGui();
        simpleGui.go();
    }


    public void go(){
        this.frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ���������� ������ ���� ��� �������� ���������

        this.button = new JButton("clickme");
        // ���������� � ������ ���������� ������
        // ������������ �������� ������ ������, ����������� ActionListener
        button.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
        frame.getContentPane().add(BorderLayout.SOUTH,button); // ���������� ������ �� ����

        this.label1 = new JLabel("Label1");
        frame.getContentPane().add(BorderLayout.WEST,label1);

        this.buttonChangeLabel = new JButton("Change Label");
        frame.getContentPane().add(BorderLayout.EAST,buttonChangeLabel);


        frame.setSize(500,500);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
        //button.setText("i've been clicked!");
    }
}
