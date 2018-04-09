import java.awt.EventQueue;
import java.awt.MenuBar;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class ImageViewerFrame extends JFrame {
    private JLabel label;
    private JFileChooser chooser;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;

    public ImageViewerFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // Użycie etykiety do wyświetlania obrazów
        label = new JLabel();
        add(label);

        // Dodawanie opcji wyboru obrazu
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        // Pasek menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("Plik");
        menuBar.add(menu);

        JMenuItem openItem = new JMenuItem("Open");
        menu.add(openItem);
        openItem.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent event) {
            
                // wyświetlanie okna dialogowego pliku
                int result = chooser.showOpenDialog(null);

                // jeśli plik został wybrany, ustawiamy go jako ikonę etykiety
                if (result == JFileChooser.APPROVE_OPTION) { 
                    String name = chooser.getSelectedFile().getPath();
                    label.setIcon(new ImageIcon(name));
                }
            }
        });
        
        JMenuItem exiItem = new JMenuItem("Close");
        menu.add(exiItem);
        exiItem.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

    }

}