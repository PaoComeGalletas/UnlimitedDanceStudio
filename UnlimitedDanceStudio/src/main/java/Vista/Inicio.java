
package Vista;

import Control.accBtnsMenu;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Pao B Clark
 */
public class Inicio extends javax.swing.JFrame {
    
    CardLayout card;
    accBtnsMenu accMenu;

    public Inicio() {
        initComponents();
        card=(CardLayout)panCont.getLayout();
        card.show(panCont, "cardInicio");
        initAcc();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPpal = new javax.swing.JPanel();
        panMenu = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnAlum = new javax.swing.JButton();
        btnClas = new javax.swing.JButton();
        btnInscr = new javax.swing.JButton();
        btnMaes = new javax.swing.JButton();
        btnRprts = new javax.swing.JButton();
        panCont = new javax.swing.JPanel();
        panAlum = new javax.swing.JPanel();
        btnVerAlum = new javax.swing.JButton();
        btnModiAlum = new javax.swing.JButton();
        panInscrip = new javax.swing.JPanel();
        btnInscribir = new javax.swing.JButton();
        btnBajaClas = new javax.swing.JButton();
        btnBajaSis = new javax.swing.JButton();
        btnEmer = new javax.swing.JButton();
        btnRegis = new javax.swing.JButton();
        panInicio = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        lblBienvenido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        panPpal.setBackground(new java.awt.Color(239, 239, 239));
        panPpal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panMenu.setBackground(new java.awt.Color(65, 105, 225));

        btnInicio.setBackground(new java.awt.Color(65, 105, 225));
        btnInicio.setFont(new java.awt.Font("Londrina Solid Thin", 1, 43)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(239, 239, 239));
        btnInicio.setText("INICIO");

        btnAlum.setBackground(new java.awt.Color(65, 105, 225));
        btnAlum.setFont(new java.awt.Font("Londrina Solid Thin", 1, 18)); // NOI18N
        btnAlum.setForeground(new java.awt.Color(255, 255, 255));
        btnAlum.setText("Alumnos");

        btnClas.setBackground(new java.awt.Color(65, 105, 225));
        btnClas.setFont(new java.awt.Font("Londrina Solid Thin", 1, 18)); // NOI18N
        btnClas.setForeground(new java.awt.Color(255, 255, 255));
        btnClas.setText("Clases y Listas");

        btnInscr.setBackground(new java.awt.Color(65, 105, 225));
        btnInscr.setFont(new java.awt.Font("Londrina Solid Thin", 1, 18)); // NOI18N
        btnInscr.setForeground(new java.awt.Color(255, 255, 255));
        btnInscr.setText("Inscripciones y bajas");
        btnInscr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnInscr.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnMaes.setBackground(new java.awt.Color(65, 105, 225));
        btnMaes.setFont(new java.awt.Font("Londrina Solid Thin", 1, 18)); // NOI18N
        btnMaes.setForeground(new java.awt.Color(255, 255, 255));
        btnMaes.setText("Maestros");

        btnRprts.setBackground(new java.awt.Color(65, 105, 225));
        btnRprts.setFont(new java.awt.Font("Londrina Solid Thin", 1, 18)); // NOI18N
        btnRprts.setForeground(new java.awt.Color(255, 255, 255));
        btnRprts.setText("Reportes y Pagos");

        javax.swing.GroupLayout panMenuLayout = new javax.swing.GroupLayout(panMenu);
        panMenu.setLayout(panMenuLayout);
        panMenuLayout.setHorizontalGroup(
            panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMenuLayout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addGroup(panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInscr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRprts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMaes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panMenuLayout.setVerticalGroup(
            panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMenuLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnInicio)
                .addGap(48, 48, 48)
                .addComponent(btnInscr, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMaes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnRprts, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panPpal.add(panMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 470));

        panCont.setLayout(new java.awt.CardLayout());

        btnVerAlum.setBackground(new java.awt.Color(65, 105, 225));
        btnVerAlum.setFont(new java.awt.Font("Londrina Solid Thin", 1, 24)); // NOI18N
        btnVerAlum.setForeground(new java.awt.Color(255, 255, 255));
        btnVerAlum.setText("Ver Alumnos");

        btnModiAlum.setBackground(new java.awt.Color(65, 105, 225));
        btnModiAlum.setFont(new java.awt.Font("Londrina Solid Thin", 1, 24)); // NOI18N
        btnModiAlum.setForeground(new java.awt.Color(255, 255, 255));
        btnModiAlum.setText("Modificar alumno");

        javax.swing.GroupLayout panAlumLayout = new javax.swing.GroupLayout(panAlum);
        panAlum.setLayout(panAlumLayout);
        panAlumLayout.setHorizontalGroup(
            panAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAlumLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModiAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );
        panAlumLayout.setVerticalGroup(
            panAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAlumLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(btnVerAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(btnModiAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        panCont.add(panAlum, "cardAlum");

        btnInscribir.setBackground(new java.awt.Color(65, 105, 225));
        btnInscribir.setFont(new java.awt.Font("Londrina Solid Thin", 1, 24)); // NOI18N
        btnInscribir.setForeground(new java.awt.Color(255, 255, 255));
        btnInscribir.setText("Inscribir alumno a clase");

        btnBajaClas.setBackground(new java.awt.Color(65, 105, 225));
        btnBajaClas.setFont(new java.awt.Font("Londrina Solid Thin", 1, 24)); // NOI18N
        btnBajaClas.setForeground(new java.awt.Color(255, 255, 255));
        btnBajaClas.setText("Dar de Baja de Clase");

        btnBajaSis.setBackground(new java.awt.Color(65, 105, 225));
        btnBajaSis.setFont(new java.awt.Font("Londrina Solid Thin", 1, 24)); // NOI18N
        btnBajaSis.setForeground(new java.awt.Color(255, 255, 255));
        btnBajaSis.setText("Dar de baja del sistema");
        btnBajaSis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaSisActionPerformed(evt);
            }
        });

        btnEmer.setBackground(new java.awt.Color(65, 105, 225));
        btnEmer.setFont(new java.awt.Font("Londrina Solid Thin", 1, 18)); // NOI18N
        btnEmer.setForeground(new java.awt.Color(255, 255, 255));
        btnEmer.setText("Gestionar contactos de emergencia");

        btnRegis.setBackground(new java.awt.Color(65, 105, 225));
        btnRegis.setFont(new java.awt.Font("Londrina Solid Thin", 1, 24)); // NOI18N
        btnRegis.setForeground(new java.awt.Color(255, 255, 255));
        btnRegis.setText("Registrar al sistema");

        javax.swing.GroupLayout panInscripLayout = new javax.swing.GroupLayout(panInscrip);
        panInscrip.setLayout(panInscripLayout);
        panInscripLayout.setHorizontalGroup(
            panInscripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInscripLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(panInscripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmer, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(btnInscribir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBajaSis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBajaClas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        panInscripLayout.setVerticalGroup(
            panInscripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInscripLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(btnInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBajaSis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBajaClas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEmer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        panCont.add(panInscrip, "cardInscri");

        btnRegister.setBackground(new java.awt.Color(65, 105, 225));
        btnRegister.setFont(new java.awt.Font("Londrina Solid Thin", 1, 24)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Registrar al sistema");

        lblBienvenido.setFont(new java.awt.Font("Londrina Solid", 0, 60)); // NOI18N
        lblBienvenido.setText("BIENVENIDO");

        javax.swing.GroupLayout panInicioLayout = new javax.swing.GroupLayout(panInicio);
        panInicio.setLayout(panInicioLayout);
        panInicioLayout.setHorizontalGroup(
            panInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInicioLayout.createSequentialGroup()
                .addGroup(panInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInicioLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panInicioLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(lblBienvenido)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panInicioLayout.setVerticalGroup(
            panInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInicioLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(lblBienvenido)
                .addGap(37, 37, 37)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        panCont.add(panInicio, "cardInicio");

        panPpal.add(panCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 460, 470));

        getContentPane().add(panPpal, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBajaSisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaSisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBajaSisActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    
    public void initAcc(){
        accMenu=new accBtnsMenu(btnInicio, btnInscr, btnAlum, btnClas, btnMaes, btnRprts, panCont , card);
        
        btnInicio.addActionListener(accMenu);
        btnInscr.addActionListener(accMenu);
        btnClas.addActionListener(accMenu);
        btnAlum.addActionListener(accMenu);
        btnMaes.addActionListener(accMenu);
        btnRprts.addActionListener(accMenu);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlum;
    private javax.swing.JButton btnBajaClas;
    private javax.swing.JButton btnBajaSis;
    private javax.swing.JButton btnClas;
    private javax.swing.JButton btnEmer;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnInscr;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnMaes;
    private javax.swing.JButton btnModiAlum;
    private javax.swing.JButton btnRegis;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnRprts;
    private javax.swing.JButton btnVerAlum;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JPanel panAlum;
    private javax.swing.JPanel panCont;
    private javax.swing.JPanel panInicio;
    private javax.swing.JPanel panInscrip;
    private javax.swing.JPanel panMenu;
    private javax.swing.JPanel panPpal;
    // End of variables declaration//GEN-END:variables
}
