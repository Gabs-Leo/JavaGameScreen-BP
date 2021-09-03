package com.gabs.game;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author gabs
 */
public class Main extends Canvas implements Runnable{
    //public static int WIDTH = 160, HEIGHT = 90, SCALE = ;
    
    Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    public int WIDTH = (int)size.getWidth(), HEIGHT = (int)size.getHeight();
    
    public Main(){
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        
        JFrame frame = new JFrame();
        frame.add(main);
        frame.setTitle("MyGame!");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        System.out.println("oi!");
        
        new Thread(main).start();
        
    }

    public void eventTick(){
        
    }
    public void render(){
        
    }
    
    
    @Override
    public void run() {
        while(true){
            eventTick();
            render();
            try {
                Thread.sleep(1000/60);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
