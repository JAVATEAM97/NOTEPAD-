package ir.mat.project;

import static ir.mat.project.activity_main.MoveItemButton;
import static ir.mat.project.activity_main.MoveItems;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;


/**
 *
 * @author mat
 */
public class MainActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        File dir = new File(Global.DirectoryOfProjectsAddress);

        if(!dir.exists())
        dir.mkdir();


        
        
        activity_main main = new activity_main();
        
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        main.setLocationRelativeTo(null);
                
        main.ChangeDirTreeAddress(Global.DirectoryRootAddress);

        main.ChangeProjectTreeAddress();
        
        MoveItemButton.setIcon(new ImageIcon(Class.class.getResource("/res/down.png")));
        MoveItems.setIcon(new ImageIcon(Class.class.getResource("/res/doubledown.png")));
        
        main.ExpandJtree2Nodes();
        
        main.getContentPane().setBackground(Color.decode("#D5F0FF"));
          
        main.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);

        MetalLookAndFeel.setCurrentTheme(new MyDefaultMetalTheme());
      
        try {
        UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (Exception e) {
          e.printStackTrace();
        }

        SwingUtilities.updateComponentTreeUI(main);
        
        main.setVisible(true);
        

    }
    
}
