/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author marekszymanski
 */
public class KoloFrame extends JFrame
{
    JPanel contentPane;
    JLabel imageLabel = new JLabel();
    JLabel headerLabel = new JLabel();
    int temp = 0;
    public boolean koniec = false;
    public KoloFrame()
    {
        
        
        
         Timer timer;
        timer = new Timer(200, new ActionListener() 
        { 
            public void actionPerformed(ActionEvent e)
            {
            }
        });
        timer.start();
        if(koniec)
            System.out.println("STOP");
    }

   
    
    
    
}
