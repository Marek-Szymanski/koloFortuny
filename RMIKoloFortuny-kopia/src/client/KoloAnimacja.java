/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import static java.awt.Frame.MAXIMIZED_HORIZ;
import static java.awt.Frame.MAXIMIZED_VERT;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author marekszymanski
 */
public class KoloAnimacja extends JFrame implements Runnable{
    JPanel contentPane;
    JLabel imageLabel = new JLabel();
    JLabel headerLabel = new JLabel();

    public KoloAnimacja() throws HeadlessException {
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        contentPane = (JPanel) getContentPane();
        contentPane.setLayout(new BorderLayout());
        setPreferredSize(new Dimension(600, 600));
        pack();
        setTitle("Losowanie");
        setVisible(true);
        try {
            sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(KoloAnimacja.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        ImageIcon ii = new ImageIcon("/Volumes/Untitled/RMIKoloFortuny-kopia/2e14b4ec9c-gif-im/frame_0_delay-0.03s.gif");
                    
                    if(ii!=null)
                        imageLabel.setIcon(ii);
                    else
                        System.out.println("ERROR");
                    contentPane.add(imageLabel, java.awt.BorderLayout.CENTER);
                   
        
        
    }
    
    
    
    @Override
    public void run() {
        
        for(int i=0;i<25;i++)
        {
            
                try {
                   
                    
                    //ImageIcon ii = new ImageIcon("/Volumes/Untitled/RMIKoloFortuny-kopia/2e14b4ec9c-gif-im/frame_"+i+"_delay-0.03s.gif");
                    
                    
                   
                    sleep(500);

                } catch (Exception exception) {
                    exception.printStackTrace();
                }
        }
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(KoloAnimacja.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);
        
    }
    
}
