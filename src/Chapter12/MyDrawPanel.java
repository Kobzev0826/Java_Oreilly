package Chapter12;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g){
        //g.fillRect(0,0,this.getWidth(), this.getHeight());
        Graphics2D g2d = (Graphics2D) g;

        Color startColor = getrandomcolor();
        Color endCOlor = getrandomcolor();

        GradientPaint gradientPaint = new GradientPaint(10,10,startColor,150,150,endCOlor);
        g2d.setPaint(gradientPaint);
        g2d.fillOval(70,70,100,100);
        //g.setColor(randomColor);
        //g.fillOval(70,70,100,100);
    }

    public Color getrandomcolor(){
        int red = (int) (Math.random()* 255);
        int green = (int) (Math.random()* 255);
        int blue = (int) (Math.random()* 255);

        Color randomColor = new Color (red,green,blue);
        return randomColor;
    }


    public void go (){
        JFrame frame = new JFrame();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// завершение работы окна при закрытии программы

        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(drawPanel);

        frame.setSize(300,300);
        frame.setVisible(true);
    }


}
