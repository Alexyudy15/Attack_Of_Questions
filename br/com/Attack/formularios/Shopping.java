/*
 * Tela na qual tinhamos pretenção de fazer desde o início, pois nessa tela fizemos
 * a simulação de como poderia ser um shopping, ou seja, demonstra que usuário poderá
 * personalizar o seu personagem da maneira que ele desejar. No futuro quando
 * formos criando de fato um jogo online e real, pretendemos deixar explicito que
 * o personagem é quem de fato o usuário desejaria ser.
 */
package br.com.Attack.formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Konex Soluções Tecnológicas.
 */

public class Shopping extends javax.swing.JFrame {

	private void TelaMenuPrincipal(){
        
	MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        dispose();		
    }
    
    public Shopping() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Compra1 = new javax.swing.JRadioButton();
        Compra2 = new javax.swing.JRadioButton();
        Compra3 = new javax.swing.JRadioButton();
        Compra4 = new javax.swing.JRadioButton();
        Compra5 = new javax.swing.JRadioButton();
        btnAvancar = new javax.swing.JLabel();
        Pag1 = new javax.swing.JLabel();
        Pag2 = new javax.swing.JLabel();
        Pag3 = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alterar Dados Cadastrais");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Compra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));
        getContentPane().add(Compra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));
        getContentPane().add(Compra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));
        getContentPane().add(Compra4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));
        getContentPane().add(Compra5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        btnAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/btnAvancar.png"))); // NOI18N
        btnAvancar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAvancarMouseClicked(evt);
            }
        });
        getContentPane().add(btnAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, -1, -1));

        Pag1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Pag1.setForeground(new java.awt.Color(255, 255, 255));
        Pag1.setText("1");
        Pag1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Pag1MouseReleased(evt);
            }
        });
        getContentPane().add(Pag1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        Pag2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Pag2.setForeground(new java.awt.Color(255, 255, 255));
        Pag2.setText("2");
        Pag2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Pag2MouseReleased(evt);
            }
        });
        getContentPane().add(Pag2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, -1, -1));

        Pag3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Pag3.setForeground(new java.awt.Color(255, 255, 255));
        Pag3.setText("3");
        Pag3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Pag3MouseReleased(evt);
            }
        });
        getContentPane().add(Pag3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, -1));

        Fundo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Fundo.setForeground(new java.awt.Color(255, 255, 255));
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/Shopping-Armas.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvancarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvancarMouseClicked
        
        //CONDIÇÃO DO BOTÃO 1
        if(Compra1.isSelected()){
            
            switch(JOptionPane.showConfirmDialog(null,"Deseja mesmo comprar "
                + "esses itens?","Finalizar compras",JOptionPane.YES_NO_OPTION)){
                
                case 0:
                    JOptionPane.showMessageDialog(null, "Item Adquirido com sucesso!");
                    
                    switch(JOptionPane.showConfirmDialog(null,"Deseja continuar "
                       + "comprando?","Faça suas compras sem pressa",JOptionPane.YES_NO_OPTION)){
                        
                        case 0:
                            break;
                        case 1:
                            TelaMenuPrincipal();
                            break;
                        }//FINAL DA 2ª JOP. 
                            break;
                    case 1:
                        break;
                    }//FINAL SWITCH COMPRAR OU FINALIZAR COMPRAR
            
                }//FINAL BOTÃO COMPRA 1
        
        //CONDIÇÃO DO BOTÃO 2
        else if(Compra2.isSelected()){
            switch(JOptionPane.showConfirmDialog(null,"Deseja mesmo comprar "
                + "esses itens?","Finalizar compras",JOptionPane.YES_NO_OPTION)){
                
                case 0:
                    JOptionPane.showMessageDialog(null, "Item Adquirido com sucesso!");
                    
                    switch(JOptionPane.showConfirmDialog(null,"Deseja continuar "
                    + "comprando?","Faça suas compras sem pressa",JOptionPane.YES_NO_OPTION)){
                
                        case 0:
                            break;
                        case 1:
                            TelaMenuPrincipal();
                        break;
                        }//FINAL DA 2ª JOP. 
                    
                    break;
                
                case 1:
                    break;
                    }//FINAL SWITCH COMPRAR OU FINALIZAR COMPRAR
            
                }//FINAL BOTÃO COMPRA 2
        
        //CONDIÇÃO DO BOTÃO 3
        else if(Compra3.isSelected()){
            switch(JOptionPane.showConfirmDialog(null,"Deseja mesmo comprar "
                + "esses itens?","Finalizar compras",JOptionPane.YES_NO_OPTION)){
                
                case 0:
                    JOptionPane.showMessageDialog(null, "Item Adquirido com sucesso!");
                    
                    switch(JOptionPane.showConfirmDialog(null,"Deseja continuar "
                    + "comprando?","Faça suas compras sem pressa",JOptionPane.YES_NO_OPTION)){
                
                        case 0:
                            break;
                        case 1:
                            TelaMenuPrincipal();
                        break;
                        }//FINAL DA 2ª JOP.
                    break;
                    
                case 1:
                    break;
                }//FINAL SWITCH COMPRAR OU FINALIZAR COMPRAR
            
            }//FINAL BOTÃO COMPRA 3
                
        //CONDIÇÃO DO BOTÃO 4
        else if(Compra4.isSelected()){
            switch(JOptionPane.showConfirmDialog(null,"Deseja mesmo comprar "
                    + "esses itens?","Finalizar compras",JOptionPane.YES_NO_OPTION)){
                
                case 0:
                    JOptionPane.showMessageDialog(null, "Item Adquirido com sucesso!");
                    
                    switch(JOptionPane.showConfirmDialog(null,"Deseja continuar "
                    + "comprando?","Faça suas compras sem pressa",JOptionPane.YES_NO_OPTION)){
                        case 0:
                            break;
                        case 1:
                            TelaMenuPrincipal();
                            break;
                        }//FINAL DA 2ª JOP.
                    break;
                
                case 1:
                    break;
                }//FINAL SWITCH COMPRAR OU FINALIZAR COMPRAR
            
            }//FINAL BOTÃO COMPRA 4
         
        //CONDIÇÃO DO BOTÃO 5
        else if(Compra5.isSelected()){
            switch(JOptionPane.showConfirmDialog(null,"Deseja mesmo comprar "
                + "esses itens?","Finalizar compras",JOptionPane.YES_NO_OPTION)){
                
                case 0:
                    JOptionPane.showMessageDialog(null, "Item Adquirido com sucesso!");
                    
                    switch(JOptionPane.showConfirmDialog(null,"Deseja continuar "
                        + "comprando?","Faça suas compras sem pressa",JOptionPane.YES_NO_OPTION)){
                        
                        case 0:
                            break;
                        case 1:
                            TelaMenuPrincipal();
                            break;
                        }//FINAL DA 2ª JOP.
                    break;
                
                case 1:
                    break;
                }//FINAL SWITCH COMPRAR OU FINALIZAR COMPRAR
            
            }//FINAL BOTÃO COMPRA 5
                
    }//GEN-LAST:event_btnAvancarMouseClicked

    private void Pag1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pag1MouseReleased
        Fundo.setIcon(new ImageIcon(Shopping.class.getResource("/br/com/Attack/icones/Shopping-Armas.png")));
    }//GEN-LAST:event_Pag1MouseReleased

    private void Pag2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pag2MouseReleased
        Fundo.setIcon(new ImageIcon(Shopping.class.getResource("/br/com/Attack/icones/Shopping-Calcados.png")));
    }//GEN-LAST:event_Pag2MouseReleased

    private void Pag3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pag3MouseReleased
        Fundo.setIcon(new ImageIcon(Shopping.class.getResource("/br/com/Attack/icones/Shopping-Roupas.png")));
    }//GEN-LAST:event_Pag3MouseReleased
 
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shopping().setVisible(true);
                
            }
        });
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Compra1;
    private javax.swing.JRadioButton Compra2;
    private javax.swing.JRadioButton Compra3;
    private javax.swing.JRadioButton Compra4;
    private javax.swing.JRadioButton Compra5;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Pag1;
    private javax.swing.JLabel Pag2;
    private javax.swing.JLabel Pag3;
    private javax.swing.JLabel btnAvancar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}