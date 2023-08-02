package maxim.kuzemskyi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class Main {

    public static void main(String[] args) {
        JFrame jFrame = getFrame();

        //Панелька для розміщення елементів
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        JButton jButton = new JButton("submit");
        jPanel.add(jButton);


//        jButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                jFrame.setTitle(((JButton)e.getSource()).getText());
//            }
//        });

        //прикла використання Event Handler
        /*
            target - предмет, який буде виконувати дію
            action - ім'я властивості або методу цільового об'єкта(об'єкт або метод до якого буде застосовуватися дія)
            eventPropertyName - ім'я читабельної властивості вхідної події
         */
        jButton.addActionListener(EventHandler.create(ActionListener.class, /*target*/jFrame, "title", "source.text"));
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