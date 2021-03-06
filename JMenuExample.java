import java.awt.GridLayout;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
 

 
public class JMenuExample {
 
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");
        JPanel panel = new JPanel();
        JTextArea ta = new JTextArea();
         
        
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");
         
        
        JMenuItem save = new JMenuItem("Save");
        JMenuItem quit = new JMenuItem("Quit");
         
       
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
 
       
        JMenuItem tryYourBest = new JMenuItem("Try your best:)");
 
        file.add(save);
        file.add(quit);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        help.add(tryYourBest);
         
        mb.add(file);
        mb.add(edit);
        mb.add(help);
         
        
        JButton jb1 = new JButton("Button 1");
        JButton jb2 = new JButton("Button 2");      
        JButton jb3 = new JButton("Button 3");
         
      
        panel.add(jb1); 
        panel.add(jb2);
        panel.add(jb3);
         
        frame.setLayout(new GridLayout(3, 1));
        frame.add(mb);
        frame.add(panel);
        frame.add(ta);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
 
    }
 
}