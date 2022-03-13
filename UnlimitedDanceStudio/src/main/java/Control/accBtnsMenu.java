
package Control;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


public class accBtnsMenu implements ActionListener {
    
    JButton btnInicio;
    JButton btnInscr;
    JButton btnAlum;
    JButton btnClas;
    JButton btnMaes;
    JButton btnRprts;
    
    JPanel panCont;
    CardLayout card;
    
    public accBtnsMenu(JButton btnInicio,JButton btnInscr, JButton btnAlum, JButton btnClas, JButton btnMaes,
                     JButton btnRprts, JPanel panCont, CardLayout card){
        this.btnInicio=btnInicio;
        this.btnInscr=btnInscr;
        this.btnAlum=btnAlum;
        this.btnClas=btnClas;
        this.btnMaes=btnMaes;
        this.btnRprts=btnRprts;
        
        this.panCont=panCont;
        this.card=card;
        
    }

  

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() instanceof JButton){
            
            if(e.getSource() == btnInicio){
                card.show(panCont, "cardInicio");
                System.out.println("Entra");
            }
            
            if(e.getSource() == btnInscr){
                card.show(panCont, "cardInscri");
                System.out.println("Entra");
            }
            
             if(e.getSource() == btnAlum){
                card.show(panCont, "cardAlum");
                 System.out.println("Entra");
             }
             
            
        }
    }

    
}
