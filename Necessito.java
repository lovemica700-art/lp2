import java.awt.Color;
import java.awt.event.ItemEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class Necessito {

   public static void main(String[] args) {

    JFrame frame = new JFrame("Exemplo Mod Escuro");
    JPanel painel = new JPanel();
       
    JMenuBar barraMenu = new JMenuBar();

    JMenu menuExibir = new JMenu("Exibir");

    painel.setBackground(Color.WHITE);

    JCheckBoxMenuItem intemModEscuro = new JCheckBoxMenuItem("Mod Escuro");

    intemModEscuro.addItemListener(e ->{

        if (e.getStateChange() == ItemEvent.SELECTED) {
            painel.setBackground (new Color (45,45,45));
        }else{
            painel.setBackground(Color.WHITE);
        }

        painel.repaint();

    });
    
    menuExibir.add(intemModEscuro);
    barraMenu.add(menuExibir);

    
    frame.setJMenuBar(barraMenu);
    frame.add(painel);
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);


   } 
    
    
}
 