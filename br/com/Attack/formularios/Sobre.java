/*
 * É a tela na qual informações sobre a Konex soluções tecnólogicas e o sobre o 
 * o jogo.
 * 
 */
package br.com.Attack.formularios;

import java.awt.event.ActionListener;
import javafx.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Konex Soluções Tecnológicas.
 */
public class Sobre extends javax.swing.JFrame {
    
    ActionListener TextTutorial_click;

    /**
     * Creates new form TelaInicio
     */
    
       private void TelaMenuPrincipal(){
        
	MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        dispose();		
    }
    
    public Sobre() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // alterar jtext
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        txt9 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JLabel();
        txt6 = new javax.swing.JLabel();
        txt7 = new javax.swing.JLabel();
        txt8 = new javax.swing.JLabel();
        txt12 = new javax.swing.JLabel();
        txt11 = new javax.swing.JLabel();
        txt10 = new javax.swing.JLabel();
        txt13 = new javax.swing.JLabel();
        Copy = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sobre");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 255, 255));
        txt2.setText("A Konex soluções tecnológicas é uma startup que vende soluções por meio de programas, aplicativos e");
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 660, 30));

        txt3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt3.setForeground(new java.awt.Color(255, 255, 255));
        txt3.setText("otimizações. A grande diferença da Konex para outras Startups é a qualidade e inovação  que resulta");
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 640, -1));

        txt4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt4.setForeground(new java.awt.Color(255, 255, 255));
        txt4.setText(" em experiências únicas. É garantido expêriencias boas devido ao processo de análise geral do problema,");
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 640, 10));

        txt5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt5.setForeground(new java.awt.Color(255, 255, 255));
        txt5.setText("da construção sa solução, do teste de comportamento da solução, do desenvolvimento do programa,");
        getContentPane().add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 660, -1));

        txt1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 204, 0));
        txt1.setText("Konex");
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 100, -1));

        txt9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt9.setForeground(new java.awt.Color(255, 204, 0));
        txt9.setText("Attack of Questions");
        getContentPane().add(txt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 240, -1));

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/IconPasso.png"))); // NOI18N
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnVoltarMouseReleased(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, -1, -1));

        txt6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt6.setForeground(new java.awt.Color(255, 255, 255));
        txt6.setText(" da interface e do ambiente de trabalho.");
        getContentPane().add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txt7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt7.setForeground(new java.awt.Color(255, 255, 255));
        txt7.setText("A nossa inteligência e nossos processos fazem com que a tecnologia pareça mágica aos olhos da sociedade,");
        getContentPane().add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        txt8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt8.setForeground(new java.awt.Color(255, 255, 255));
        txt8.setText("porque nossa criatividade dá a solução para o coração das empresas.");
        getContentPane().add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        txt12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt12.setForeground(new java.awt.Color(255, 255, 255));
        txt12.setText("um deles terá categorias de perguntas diferentes com 5 alternativas podendo escolher qual ele deseja jogar, ");
        getContentPane().add(txt12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        txt11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt11.setForeground(new java.awt.Color(255, 255, 255));
        txt11.setText(" publico A(17 à 19 anos), publico B(20 á 24 anos) e publico C(25 à 28 anos). Tendo em vista que cada");
        getContentPane().add(txt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        txt10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt10.setForeground(new java.awt.Color(255, 255, 255));
        txt10.setText("É um jogo online de perguntas em conhecimentos gerais baseado em estratégia, o jogo é indicado para o");
        getContentPane().add(txt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        txt13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt13.setForeground(new java.awt.Color(255, 255, 255));
        txt13.setText("é importante ressaltar que o nível de pergunta muda de acordo com o público.");
        getContentPane().add(txt13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        Copy.setForeground(new java.awt.Color(255, 255, 255));
        Copy.setText("copyright © 2020 todos os direitos reservados");
        getContentPane().add(Copy, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, -1, -1));

        Fundo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fundo.setForeground(new java.awt.Color(255, 255, 255));
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/TelaAzul.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseReleased
        TelaMenuPrincipal();
        dispose();
    }//GEN-LAST:event_btnVoltarMouseReleased

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
            java.util.logging.Logger.getLogger(Tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tutorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sobre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Copy;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel btnVoltar;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt10;
    private javax.swing.JLabel txt11;
    private javax.swing.JLabel txt12;
    private javax.swing.JLabel txt13;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt7;
    private javax.swing.JLabel txt8;
    private javax.swing.JLabel txt9;
    // End of variables declaration//GEN-END:variables
}