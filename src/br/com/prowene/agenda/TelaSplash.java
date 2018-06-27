package br.com.prowene.agenda;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

public class TelaSplash extends JWindow {

	private static final long serialVersionUID = -106910416958255668L;
	private int duration;
    
    public TelaSplash(int d) {
        duration = d;
    }
    

    public void showSplash() {        
        JPanel content = (JPanel)getContentPane();
        content.setBackground(Color.white);
        int width = 600;
        int height = 300;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width-width)/2;
        int y = (screen.height-height)/2;
        setBounds(x,y,width,height);
        JLabel label = new JLabel(new ImageIcon((TelaSplash.class.getResource("/br/com/prowene/icon/agendaLogo.jpg"))));
        JLabel copyrt = new JLabel("Copyright 2013, Prowene IT Solutions", JLabel.CENTER);
        copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 10));
        content.add(label, BorderLayout.CENTER);
        content.add(copyrt, BorderLayout.SOUTH);
        Color oraRed = new Color(0, 20, 20,  255);
        content.setBorder(BorderFactory.createLineBorder(oraRed, 1));        
        setVisible(true);
        try { Thread.sleep(duration); } catch (Exception e) {}        
        setVisible(false);        
    }
    
    public void showSplashAndExit() {        
        showSplash();             
    }       
} 
 
