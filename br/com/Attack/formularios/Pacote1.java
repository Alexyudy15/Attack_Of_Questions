/*
 * Nessa tela decidimos criar para presentear o usuário.
 * Pedimos para ele escolher um dos 6 báus, logo de inicio iriamos criar um
 * Random que iria sortear, na qual teriamos que também mascarar os báus, como
 * tomamos tempo aprendendo a trabalhar Jfram, optamos por caminhos mais rápidos
 * para que pudessemos montar uma apresentação com a jogabilidade proposta na
 * primeira apresentação.
 */
package br.com.Attack.formularios;

import java.awt.event.ActionListener;
import javafx.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Konex Soluções Tecnológicas.
 */
public class Pacote1 extends javax.swing.JFrame {
    
    private void TelaMenuPrincipal(){
        
	MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        dispose();		
    }
    

    /**
     * Creates new form TelaInicio
     */
    public Pacote1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // alterar jtext
    public static int capacete=0;
    public static int roupa=0;
    public static int arma=0;
    public static int calcado=0;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextPacote2 = new javax.swing.JLabel();
        TextPacote = new javax.swing.JLabel();
        Icon = new javax.swing.JLabel();
        Pacote1 = new javax.swing.JLabel();
        Pacote2 = new javax.swing.JLabel();
        Pacote3 = new javax.swing.JLabel();
        Pacote4 = new javax.swing.JLabel();
        Pacote5 = new javax.swing.JLabel();
        Pacote6 = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pacote 1");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextPacote2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        TextPacote2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TextPacote2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 440, -1));

        TextPacote.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TextPacote.setForeground(new java.awt.Color(255, 255, 255));
        TextPacote.setText("Clique em um dos baús");
        getContentPane().add(TextPacote, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 230, -1));

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/Icon.png"))); // NOI18N
        Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                IconMouseReleased(evt);
            }
        });
        getContentPane().add(Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        Pacote1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/bau.png"))); // NOI18N
        Pacote1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pacote1MouseClicked(evt);
            }
        });
        getContentPane().add(Pacote1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        Pacote2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/bau.png"))); // NOI18N
        Pacote2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pacote2MouseClicked(evt);
            }
        });
        getContentPane().add(Pacote2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        Pacote3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/bau.png"))); // NOI18N
        Pacote3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pacote3MouseClicked(evt);
            }
        });
        getContentPane().add(Pacote3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        Pacote4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/bau.png"))); // NOI18N
        Pacote4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pacote4MouseClicked(evt);
            }
        });
        getContentPane().add(Pacote4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        Pacote5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/bau.png"))); // NOI18N
        Pacote5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pacote5MouseClicked(evt);
            }
        });
        getContentPane().add(Pacote5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        Pacote6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/bau.png"))); // NOI18N
        Pacote6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pacote6MouseClicked(evt);
            }
        });
        getContentPane().add(Pacote6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        Fundo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fundo.setForeground(new java.awt.Color(255, 255, 255));
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/TelaLogin.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconMouseClicked
        JOptionPane.showMessageDialog(null,"Capacete aumenta o tempo inicial. \n"
                    + "Roupa aumenta durante a partida, quando ativada. \n"
                    + "Arma tira o tempo do oponente, quando ativada. \n"
                    + "Calçado acelera o tempo do oponente, quando ativada.");
    }//GEN-LAST:event_IconMouseClicked
            
    private void IconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconMouseReleased
            
    }//GEN-LAST:event_IconMouseReleased
    
    //BAU 1 
    private void Pacote1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pacote1MouseClicked
            switch(JOptionPane.showConfirmDialog(null,"Nome da Carta: Defesa Master \n"
                   + "capacete= 20 \n"
                   + "roupa=30 \n"
                   + "arma=10 \n"
                   + "Calçado=5","Aceita o Baú?",JOptionPane.YES_NO_OPTION)){
                
                case 0:
                    capacete=20;
                    roupa=10;
                    arma=30;
                    calcado=5;
                    break;
                case 1:
                    capacete=0;
                    roupa=0;
                    arma=0;
                    calcado=0;
                    break;
                    
            }
            TelaMenuPrincipal();
    }//GEN-LAST:event_Pacote1MouseClicked
    //BAU 2
    private void Pacote2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pacote2MouseClicked
            switch(JOptionPane.showConfirmDialog(null,"Nome da Carta: Plus Ultra \n"
                   + "capacete= 5 \n"
                   + "roupa=15 \n"
                   + "arma=30 \n"
                   + "Calçado=10","Aceita o Baú?",JOptionPane.YES_NO_OPTION)){
                
                case 0:
                    capacete=5;
                    roupa=10;
                    arma=30;
                    calcado=10;
                    break;
                case 1:
                    capacete=0;
                    roupa=0;
                    arma=0;
                    calcado=0;
                    break;    
            }
            TelaMenuPrincipal();
    }//GEN-LAST:event_Pacote2MouseClicked
    //BAU 3
    private void Pacote3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pacote3MouseClicked
            switch(JOptionPane.showConfirmDialog(null,"Nome da Carta: Speed \n"
                   + "capacete= 10 \n"
                   + "roupa=10 \n"
                   + "arma=15 \n"
                   + "Calçado=30","Aceita o Baú?",JOptionPane.YES_NO_OPTION)){
                
                case 0:
                    capacete=10;
                    roupa=10;
                    arma=30;
                    calcado=30;
                    break;
                case 1:
                    capacete=0;
                    roupa=0;
                    arma=0;
                    calcado=0;
                    break;    
            }
            TelaMenuPrincipal();
    }//GEN-LAST:event_Pacote3MouseClicked
    //BAU 4 
    private void Pacote4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pacote4MouseClicked
            switch(JOptionPane.showConfirmDialog(null,"Nome da Carta: Chumbo \n"
                   + "capacete= 20 \n"
                   + "roupa=20 \n"
                   + "arma=5 \n"
                   + "Calçado=5","Aceita o Baú?",JOptionPane.YES_NO_OPTION)){
                
                case 0:
                    capacete=20;
                    roupa=20;
                    arma=30;
                    calcado=5;
                    break;
                case 1:
                    capacete=0;
                    roupa=0;
                    arma=0;
                    calcado=0;
                      break;
            }
            TelaMenuPrincipal();
            
            
            
    }//GEN-LAST:event_Pacote4MouseClicked
    //BAU 5 
    private void Pacote5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pacote5MouseClicked
            switch(JOptionPane.showConfirmDialog(null,"Nome da Carta: Equilibrado \n"
                   + "capacete= 10 \n"
                   + "roupa=10 \n"
                   + "arma=10 \n"
                   + "Calçado=10","Aceita o Baú?",JOptionPane.YES_NO_OPTION)){
                
                case 0:
                    capacete=10;
                    roupa=10;
                    arma=30;
                    calcado=10;
                    break;
                case 1:
                    capacete=0;
                    roupa=0;
                    arma=0;
                    calcado=0;
                    break;
            }
            TelaMenuPrincipal();
    }//GEN-LAST:event_Pacote5MouseClicked
    //BAU 6 
    private void Pacote6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pacote6MouseClicked
            switch(JOptionPane.showConfirmDialog(null,"Nome da Carta: Raridade \n"
                   + "capacete= 5 \n"
                   + "roupa=35 \n"
                   + "arma=45 \n"
                   + "Calçado=5","Aceita o Baú?",JOptionPane.YES_NO_OPTION)){
                
                case 0:
                    capacete=5;
                    roupa=320;
                    arma=30;
                    calcado=5;
                    break;
                case 1:
                    capacete=0;
                    roupa=0;
                    arma=0;
                    calcado=0;
                    break;    
            }
            TelaMenuPrincipal();
            
    }//GEN-LAST:event_Pacote6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/Pacote1/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pacote1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pacote1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pacote1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pacote1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pacote1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Icon;
    private javax.swing.JLabel Pacote1;
    private javax.swing.JLabel Pacote2;
    private javax.swing.JLabel Pacote3;
    private javax.swing.JLabel Pacote4;
    private javax.swing.JLabel Pacote5;
    private javax.swing.JLabel Pacote6;
    private javax.swing.JLabel TextPacote;
    private javax.swing.JLabel TextPacote2;
    // End of variables declaration//GEN-END:variables
}
