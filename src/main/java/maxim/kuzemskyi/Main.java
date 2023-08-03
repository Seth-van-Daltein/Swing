package maxim.kuzemskyi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();

        JPanel jPanelCloseOperation = new JPanel();
        jFrame.add(jPanelCloseOperation);

        JButton jButtonCCC = new JButton("close");
        jPanelCloseOperation.add(jButtonCCC);

        jButtonCCC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrameClose = new JFrame();
                jFrameClose.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                //Робимо для того щоб вікно виводилось посередині екрану незалежно від розширення екрану
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Dimension dimension = toolkit.getScreenSize();
                jFrameClose.setBounds(dimension.width / 2 - 200, dimension.height / 2 - 150, 300, 200); //розташування вікна рівно по центру

                //Change title(name) of the Window
                jFrameClose.setTitle("Close Window");

                //Робимо вікно видимим
                jFrameClose.setVisible(true);



                JPanel jPanelClose = new JPanel();
                jFrameClose.add(jPanelClose);

                JButton jButtonCloseOk = new JButton("Ok");
                JButton jButtonCloseCancel = new JButton("Cancel");

                jPanelClose.add(jButtonCloseOk);
                jPanelClose.add(jButtonCloseCancel);

                jButtonCloseOk.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jFrameClose.setVisible(true);
                        System.exit(0);
                    }
                });

                jButtonCloseCancel.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jFrameClose.setVisible(false);
                    }
                });
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
        jFrame.setTitle("KANEKI");

        //Change image of the Window
        ImageIcon img = new ImageIcon("./images/iconImage.png");
        jFrame.setIconImage(img.getImage());

        //Робимо вікно видимим
        jFrame.setVisible(true);

        return jFrame;

    }

}