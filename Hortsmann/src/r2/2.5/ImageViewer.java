import java.awt.EventQueue;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class ImageViewer {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
        
            @Override
            public void run() {
                JFrame frame = new ImageViewerFrame();
                frame.setTitle("Foto-Otwieracz");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
