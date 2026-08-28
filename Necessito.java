import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Necessito {

   public static void main(String[] args) {

     JFrame frame = new JFrame("Exemplo Menu");
       
    JMenuBar barraMenu = new JMenuBar();

    JMenu menuExibir = new JMenu("Exibir");

    JCheckBoxMenuItem intemModEscuro = new JCheckBoxMenuItem("Mod Escuro");
    
    menuExibir.add(intemModEscuro);
    barraMenu.add(menuExibir);

    
    frame.setJMenuBar(barraMenu);
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);


   } 
    
    
}
 
