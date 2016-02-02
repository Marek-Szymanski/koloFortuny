/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author marekszymanski
 */
public class Animacja extends JFrame{
    JLabel pic;
    Timer tm;
    int x = 0;
    //Images Path In Array
    String[] list = {
                      "/Volumes/Untitled/RMIKoloFortuny-kopia/2e14b4ec9c-gif-im/frame_0_delay-0.03s.gif",//0
                      "/Volumes/Untitled/RMIKoloFortuny-kopia/2e14b4ec9c-gif-im/frame_1_delay-0.03s.gif",//1
                      "/Volumes/Untitled/RMIKoloFortuny-kopia/2e14b4ec9c-gif-im/frame_2_delay-0.03s.gif",//2
                      "/Volumes/Untitled/RMIKoloFortuny-kopia/2e14b4ec9c-gif-im/frame_3_delay-0.03s.gif",//3
                      "/Volumes/Untitled/RMIKoloFortuny-kopia/2e14b4ec9c-gif-im/frame_4_delay-0.03s.gif",//4
                      "/Volumes/Untitled/RMIKoloFortuny-kopia/2e14b4ec9c-gif-im/frame_5_delay-0.03s.gif",//5
                      "/Volumes/Untitled/RMIKoloFortuny-kopia/2e14b4ec9c-gif-im/frame_6_delay-0.03s.gif"//6
                    };
    int temp = 0;
    public Animacja(){
        super("Java SlideShow");
        pic = new JLabel();
        pic.setBounds(30, 30, 600, 600);

        //Call The Function SetImageSize
        SetImageSize(6);
        
       //set a timer
        tm = new Timer(150,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if(x >= list.length )
                    x = 0; 
                temp++;
                if(temp == 30)
                    dispose();
            }

            
        });
        add(pic);
        tm.start();
        setLayout(null);
        setSize(650, 650);
        getContentPane().setBackground(Color.decode("#bdb67b"));
        setLocationRelativeTo(null);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    //create a function to resize the image 
    public void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
    }

//Read more at http://1bestcsharp.blogspot.com/2015/04/JAVA-How-To-Create-A-Slideshow-In-Java-Swing-Using-NetBeans.html#0qX0vD6FOKy8lQIX.99
}
