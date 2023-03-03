package ramka;

import javax.swing.*;
import java.awt.*; //awt - abstract window toolkit

public class Ramka extends JFrame
{
    public Ramka()
    {
        /*
        JFrame frame = new JFrame();
        frame.setTitle("Tytuł");
        frame.setSize(300, 300);
        //frame.setSize(new Dimension(300, 300));
        frame.setLocation(200, 100);
        //frame.setLocation(new Point(200, 100));
        frame.setBounds(100, 250, 400, 400);
        frame.setResizable(true);//czy famke można edytować po wywolaniu
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("kurs.jpg"));
        frame.setDefaultCloseOperation(3);//<- skrot = (JFrame.EXIT_ON_CLOSE)
        frame.setVisible(true);
         */
        int szer = Toolkit.getDefaultToolkit().getScreenSize().width;
        int wys = Toolkit.getDefaultToolkit().getScreenSize().height;
        System.out.println(wys);
        System.out.println(szer);
        this.setTitle("Tytuł");
        this.setSize(szer/2, wys/2);
        int szerRamki = this.getSize().width;
        int wysRamki = this.getSize().height;
        this.setLocation((szer-szerRamki)/2, (wys-wysRamki)/2);
        this.setDefaultCloseOperation(3);
        //this.pack();
    }

    public static void main(String[] args)
    {
        new Ramka().setVisible(true);
    }
    
}
