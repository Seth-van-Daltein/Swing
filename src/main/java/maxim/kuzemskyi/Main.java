package maxim.kuzemskyi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame jFrame = getFrame();

        //Панелька для розміщення елементів
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        JButton jButton1 = new JButton("blue");
        JButton jButton2 = new JButton("red");
        JButton jButton3 = new JButton("yellow");
        JButton jButton4 = new JButton("green");


        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);

//        String sColor = "";

        //Дія після натискання кнопки
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.blue);
                String sColor = jButton1.getText();
                System.out.println(sColor);
            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.red);
                String sColor = jButton2.getText();
                System.out.println(sColor);
            }
        });

        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.yellow);
                String sColor = jButton3.getText();
                System.out.println(sColor);

            }
        });

        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.green);
                String sColor = jButton4.getText();
                System.out.println(sColor);
            }
        });

    }


    /*
    Створення чистого вікна і його налаштування
    */
    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };

        //Робимо щоб нормально закривати програму
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Робимо для того щоб вікно виводилось посередині екрану незалежно від розширення екрану
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 300); //розташування вікна рівно по центру

        //Change title(name) of the Window
        jFrame.setTitle("Test App");

        //Change image of the Window
        ImageIcon img = new ImageIcon("./images/iconImage.png");
        jFrame.setIconImage(img.getImage());

        //Робимо вікно видимим
        jFrame.setVisible(true);

        return jFrame;

    }

}