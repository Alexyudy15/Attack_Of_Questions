/*
 * Nessa tela puxamos a informação pessoal da categoria de sexo e tela de pacote 
 * de equipamentos , e criamos a  tela na qual ele escolhe com qual personagem 
 * feminino neste caso.
 * 
 */
package br.com.Attack.formularios;

import java.awt.event.ActionListener;
import javafx.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Konex Soluções Tecnológicas.
 */

public class PublicoF extends javax.swing.JFrame {
    public static String PersonaUsuario;
    
    
    private void TelaPacote1(){
        
	Pacote1 pacote1 = new Pacote1();
        pacote1.setVisible(true);
        dispose();		
    }
    

    /**
     * @return the idadeF
     */
    
    /**
     * Creates new form TelaInicio
     */
    public PublicoF() {
        initComponents();
         
    }
    private InformacaoPessoal classe = new InformacaoPessoal();
    private int idadeFeminino = classe.idadeF;
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // alterar jtext
        int personaF1;
        int personaF2;
        int personaF3;
    
    public static int boasvindasPersonagemF1(int personaF1){
        int boasvindasP = 0;
    
    switch(personaF1){
        case 1:
            JOptionPane.showMessageDialog(null,"Boa escolha, esse personagem é ótimo"
                    + "em perguntas da sociedade e atualidades.");    
        break;
        
        case 2:
            JOptionPane.showMessageDialog(null,"É muito experiente "
                    + "em perguntas filosóficas, se você se identifica com filosofia  "
                    + "é o personagem ideal para você.");
            
        break; 
        
        case 3:
            JOptionPane.showMessageDialog(null,"Nerd tem facilidade em resolver "
                    + "calcúlos matemáticos, se você se identifica fez a "
                    + "escolha certa");
        break; 
        
        case 4:
            JOptionPane.showMessageDialog(null," Físico, tem a super capacidade"
                    + "em resolver calcúlos físicos, se você se identifica"
                    + "fez a escolha certa");
        break;
        
        case 5:
            JOptionPane.showMessageDialog(null,"Adora o Brasil, é muito inteligente"
                    + "em língua portuguesa, se você se identifica fez a escolha certa");    
        break; 
    }
    
    
    return boasvindasP ;
    
}   
    public static int boasvindasPersonagemF2(int personaF2){
    int boasvindasP  = 0;
    
    switch(personaF2){
        case 1:
            JOptionPane.showMessageDialog(null,"Sabe tudo sobre a humanidade, se você se "
                    + "você se identifica, fez a escolha certa.");
        break;
        
        case 2:
            JOptionPane.showMessageDialog(null,"Sabe tudo sobre História, se você se "
                    + "você se identifica, fez a escolha certa.");    
        break; 
        
        case 3:
            JOptionPane.showMessageDialog(null," Então você quer fazer algumas viagens"
                    + "pelo o mundo a fora? Você fez a escolha certa.");  
        break; 
        
        case 4:
            JOptionPane.showMessageDialog(null,"Conhece tudo sobre geografia política"
                    + "você se identifica, fez a escolha certa.");     
        break;
        
        case 5:
        JOptionPane.showMessageDialog(null,"Amante por países, cidade, províncias,"
                + "conhece o mundo a fora. Quando o assunto é cultura, sabe de tudo.");    
        break; 
    }
    
    
    return boasvindasP ;
    
}     
    public static int boasvindasPersonagemF3(int personaF3){
        int boasvindasP  = 0;
    
        switch(personaF3){
            case 1:
            JOptionPane.showMessageDialog(null,"Então você é uma pessoa que gosta "
                    + "de curiosidades? Se você se identifica, fez a escolha certa."); 
                break;
        
            case 2:
            JOptionPane.showMessageDialog(null,"Quando o assunto é esporte o seu "
                    + "sorriso é mais reluzente que o sol  "
                    + "Acho que alguém se identificou, você fez a escolha certa.");     
                break; 
        
            case 3:
            JOptionPane.showMessageDialog(null,"Quando é assunto de finanças, "
                    + "seus olhos brilham? "
                    + "Temos um amante de finanças aqui!");    
                break; 
        
            case 4:
            JOptionPane.showMessageDialog(null,"Então quer dizer que, quando o "
                + "assunto é empreender, seu coração bate mais forte?");     
                break;
        
            case 5:
            JOptionPane.showMessageDialog(null,"Amante por programação detectado. "
                + "Vai um café?");    
            break; 
    }
    
    
    return boasvindasP ;
    
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoPersona = new javax.swing.ButtonGroup();
        Textpergunta = new javax.swing.JLabel();
        TextPersoF1 = new javax.swing.JRadioButton();
        TextPersoF4 = new javax.swing.JRadioButton();
        TextPersoF5 = new javax.swing.JRadioButton();
        TextPersoF2 = new javax.swing.JRadioButton();
        TextPersoF3 = new javax.swing.JRadioButton();
        btnProximo = new javax.swing.JLabel();
        btnVerMais = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Publico Feminino");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Textpergunta.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Textpergunta.setForeground(new java.awt.Color(255, 255, 255));
        Textpergunta.setText("Clique em \"Ver mais\" para liberar os personagens disponiveis para sua categoria");
        getContentPane().add(Textpergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 670, -1));

        GrupoPersona.add(TextPersoF1);
        TextPersoF1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TextPersoF1.setForeground(new java.awt.Color(255, 255, 255));
        TextPersoF1.setText("??????????????");
        TextPersoF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPersoF1ActionPerformed(evt);
            }
        });
        getContentPane().add(TextPersoF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 30));

        GrupoPersona.add(TextPersoF4);
        TextPersoF4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TextPersoF4.setForeground(new java.awt.Color(255, 255, 255));
        TextPersoF4.setText("??????????????");
        getContentPane().add(TextPersoF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 30));

        GrupoPersona.add(TextPersoF5);
        TextPersoF5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TextPersoF5.setForeground(new java.awt.Color(255, 255, 255));
        TextPersoF5.setText("??????????????");
        getContentPane().add(TextPersoF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, 30));

        GrupoPersona.add(TextPersoF2);
        TextPersoF2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TextPersoF2.setForeground(new java.awt.Color(255, 255, 255));
        TextPersoF2.setText("??????????????");
        TextPersoF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPersoF2ActionPerformed(evt);
            }
        });
        getContentPane().add(TextPersoF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 30));

        GrupoPersona.add(TextPersoF3);
        TextPersoF3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TextPersoF3.setForeground(new java.awt.Color(255, 255, 255));
        TextPersoF3.setText("??????????????");
        getContentPane().add(TextPersoF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 30));

        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/btnAvancar.png"))); // NOI18N
        btnProximo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnProximoMouseReleased(evt);
            }
        });
        getContentPane().add(btnProximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, -1, -1));

        btnVerMais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/btnVerMais.png"))); // NOI18N
        btnVerMais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnVerMaisMouseReleased(evt);
            }
        });
        getContentPane().add(btnVerMais, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        Fundo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Fundo.setForeground(new java.awt.Color(255, 255, 255));
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/TelaLogin.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TextPersoF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPersoF1ActionPerformed
       
    }//GEN-LAST:event_TextPersoF1ActionPerformed

    private void TextPersoF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPersoF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPersoF2ActionPerformed

    private void btnProximoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProximoMouseReleased
        TelaPacote1();
    }//GEN-LAST:event_btnProximoMouseReleased

    private void btnVerMaisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerMaisMouseReleased
        if(idadeFeminino <17){
                //MISTÉRIO
                Textpergunta.setText(Textpergunta.getText().replace("Clique em \"Ver mais\" para liberar os personagens disponiveis para sua categoria","      Clique em \"Selecionar\" para escolher seu personagem nessa essa aventura."));
                TextPersoF1.setText(TextPersoF1.getText().replace("??????????????","??????????????"));
                TextPersoF2.setText(TextPersoF2.getText().replace("??????????????","??????????????"));
                TextPersoF3.setText(TextPersoF3.getText().replace("??????????????","??????????????"));
                TextPersoF4.setText(TextPersoF4.getText().replace("??????????????","??????????????"));
                TextPersoF5.setText(TextPersoF5.getText().replace("??????????????","??????????????"));
                btnVerMais.setIcon(new ImageIcon(PublicoF.class.getResource("/br/com/Attack/icones/btnSelecionar.png")));
                
            }
            //PUBLICO A
            else if(idadeFeminino== 17 || idadeFeminino <=19){
                Textpergunta.setText(Textpergunta.getText().replace("Clique em \"Ver mais\" para liberar os personagens disponiveis para sua categoria","      Clique em \"Selecionar\" para escolher seu personagem nessa essa aventura."));
                TextPersoF1.setText(TextPersoF1.getText().replace("??????????????","A Socióloga"));
                TextPersoF2.setText(TextPersoF2.getText().replace("??????????????","A Filosófica"));
                TextPersoF3.setText(TextPersoF3.getText().replace("??????????????","A Nerd"));
                TextPersoF4.setText(TextPersoF4.getText().replace("??????????????","A Física"));
                TextPersoF5.setText(TextPersoF5.getText().replace("??????????????","A Linguística"));
                btnVerMais.setIcon(new ImageIcon(PublicoF.class.getResource("/br/com/Attack/icones/btnSelecionar.png")));
                
                
                if(TextPersoF1.isSelected()){
                    personaF1=1;
                    PersonaUsuario = "A Socióloga";
                }
                else if(TextPersoF2.isSelected()){
                    personaF2=2;
                    PersonaUsuario = "A Socióloga";
                }
                else if(TextPersoF3.isSelected()){
                   personaF1=3;
                   PersonaUsuario = "A Nerd";
                }
                else if(TextPersoF4.isSelected()){
                    personaF1=4;
                    PersonaUsuario = "A Física";
                }
                else if(TextPersoF5.isSelected()){
                    personaF1=5;
                    PersonaUsuario = "A Linguística";
                }
                
                int chamadapersona= boasvindasPersonagemF1(personaF1);
            }
            //PUBLICO B
            else if(idadeFeminino== 20 || idadeFeminino <=24){
                Textpergunta.setText(Textpergunta.getText().replace("Clique em \"Ver mais\" para liberar os personagens disponiveis para sua categoria","      Clique em \"Selecionar\" para escolher seu personagem nessa essa aventura."));
                TextPersoF1.setText(TextPersoF1.getText().replace("??????????????","A Antropóloga"));
                TextPersoF2.setText(TextPersoF2.getText().replace("??????????????","A Historiadora"));
                TextPersoF3.setText(TextPersoF3.getText().replace("??????????????","A Intercambista"));
                TextPersoF4.setText(TextPersoF4.getText().replace("??????????????","A Geógrafa Política"));
                TextPersoF5.setText(TextPersoF5.getText().replace("??????????????","A Turista"));
                btnVerMais.setIcon(new ImageIcon(PublicoF.class.getResource("/br/com/Attack/icones/btnSelecionar.png")));
                
                
                if(TextPersoF1.isSelected()){
                    personaF2=1;
                    PersonaUsuario = "A Antropóloga";
                }
                else if(TextPersoF2.isSelected()){
                    personaF2=2;
                    PersonaUsuario = "A Historiadora";
                }
                else if(TextPersoF3.isSelected()){
                   personaF2=3;
                   PersonaUsuario = "A Intercambista";
                }
                else if(TextPersoF4.isSelected()){
                    personaF2=4;
                    PersonaUsuario = "A Geógrafa Política";
                }
                else if(TextPersoF5.isSelected()){
                    personaF2=5;
                    PersonaUsuario = "A Turista";
                }
                int chamadapersona= boasvindasPersonagemF2(personaF2);
            }
            //PUBLICO C
            else if(idadeFeminino== 25 || idadeFeminino <=100){
                Textpergunta.setText(Textpergunta.getText().replace("Clique em \"Ver mais\" para liberar os personagens disponiveis para sua categoria","      Clique em \"Selecionar\" para escolher seu personagem nessa essa aventura."));
                TextPersoF1.setText(TextPersoF1.getText().replace("??????????????","A Curiosa"));
                TextPersoF2.setText(TextPersoF2.getText().replace("??????????????","A Esportista"));
                TextPersoF3.setText(TextPersoF3.getText().replace("??????????????","A Financeira"));
                TextPersoF4.setText(TextPersoF4.getText().replace("??????????????","A Física"));
                TextPersoF5.setText(TextPersoF5.getText().replace("??????????????","A Empresária"));
                btnVerMais.setIcon(new ImageIcon(PublicoF.class.getResource("/br/com/Attack/icones/btnSelecionar.png")));
                
                
                if(TextPersoF1.isSelected()){
                    personaF3=1;
                    PersonaUsuario = "A Curiosa";
                }
                else if(TextPersoF2.isSelected()){
                    personaF3=2;
                    PersonaUsuario = "A Esportista";
                }
                else if(TextPersoF3.isSelected()){
                   personaF3=3;
                   PersonaUsuario = "A Financeira";
                }
                else if(TextPersoF4.isSelected()){
                    personaF3=4;
                    PersonaUsuario = "A Física";
                }
                else if(TextPersoF5.isSelected()){
                    personaF3=5;
                    PersonaUsuario = "A Empresária";
                }
                int chamadapersona= boasvindasPersonagemF3(personaF3);
                
            }
        
        
    }//GEN-LAST:event_btnVerMaisMouseReleased

    
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
                new PublicoF().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.ButtonGroup GrupoPersona;
    private javax.swing.JRadioButton TextPersoF1;
    private javax.swing.JRadioButton TextPersoF2;
    private javax.swing.JRadioButton TextPersoF3;
    private javax.swing.JRadioButton TextPersoF4;
    private javax.swing.JRadioButton TextPersoF5;
    private javax.swing.JLabel Textpergunta;
    private javax.swing.JLabel btnProximo;
    private javax.swing.JLabel btnVerMais;
    // End of variables declaration//GEN-END:variables


    
    
}
