/* Essa classe tem como o objetivo alterar os dados do usuário, tendo em vista
*  que se o usário desejar fazer mudanças, é notório que nos não fizemos  
*  a conexão com banco de dados, por que nós ainda não aprendemos. 
*/
package br.com.Attack.formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Konex Soluções Tecnológicas.
 */

public class AlterarDados extends javax.swing.JFrame {
    public static String usuario;
    public static String senhaUsuario;
    public static String emailUsuario;

    /**
     * Creates new form TelaInicial
     */
    

private void TelaMenuPrincipal(){
        
	MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        dispose();		
    }
	
    
    public AlterarDados() {
        initComponents();
    }
    
    //Personagens
    private PublicoF personaf = new PublicoF();
    private String PersonagemF = personaf.PersonaUsuario;
    
    private PublicoM personam = new PublicoM();
    private String PersonagemM = personam.PersonaUsuario;
   
    //Sexo 
    private InformacaoPessoal SexoMasculino = new InformacaoPessoal();
    private String SexoM = SexoMasculino.sexoM;
    
    private InformacaoPessoal SexoFeminino = new InformacaoPessoal();
    private String SexoF = SexoFeminino.sexoF;
    
    //Dados Pessoais de Cadastro
    private Cadastro Login = new Cadastro();
    private String LoginUser = Login.usuario;
    
    private Cadastro Senha = new Cadastro();
    private String SenhaUser = Senha.senhaUsuario;
    
    private Cadastro Email = new Cadastro();
    private String EmailUser = Email.emailUsuario;
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TextSenha = new javax.swing.JLabel();
        TextEmail = new javax.swing.JLabel();
        TextNome = new javax.swing.JLabel();
        TextAlterarDados = new javax.swing.JLabel();
        CampoEmail = new javax.swing.JTextField();
        CampoNomeUsuario = new javax.swing.JTextField();
        CampoSenha = new javax.swing.JPasswordField();
        btnAvancar = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alterar Dados Cadastrais");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextSenha.setForeground(new java.awt.Color(255, 255, 255));
        TextSenha.setText("Senha:");
        getContentPane().add(TextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, -1));

        TextEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextEmail.setForeground(new java.awt.Color(255, 255, 255));
        TextEmail.setText("E-Mail:");
        getContentPane().add(TextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        TextNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextNome.setForeground(new java.awt.Color(255, 255, 255));
        TextNome.setText("Nome:");
        getContentPane().add(TextNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        TextAlterarDados.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TextAlterarDados.setForeground(new java.awt.Color(255, 255, 255));
        TextAlterarDados.setText("Alterar dados cadastrais");
        getContentPane().add(TextAlterarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        CampoEmail.setText(EmailUser);
        CampoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEmailActionPerformed(evt);
            }
        });
        getContentPane().add(CampoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 240, 30));

        CampoNomeUsuario.setText(LoginUser);
        CampoNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(CampoNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 240, 30));

        CampoSenha.setText(SenhaUser);
        CampoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 240, 30));

        btnAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/btnAvancar.png"))); // NOI18N
        btnAvancar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAvancarMouseReleased(evt);
            }
        });
        getContentPane().add(btnAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        Fundo.setForeground(new java.awt.Color(255, 255, 255));
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Attack/icones/TelaLogin.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 700, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeUsuarioActionPerformed
        CampoNomeUsuario.setText(LoginUser);
    }//GEN-LAST:event_CampoNomeUsuarioActionPerformed

    private void btnAvancarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvancarMouseReleased
        usuario = (CampoNomeUsuario.getText());
        emailUsuario = (CampoEmail.getText());
        senhaUsuario = (CampoSenha.getText());
                  
                            
                            
        if(!"".equals(usuario) && !"".equals(emailUsuario) && !"".equals(senhaUsuario)){
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso","Alteração Realizada com sucesso",WIDTH);
                TelaMenuPrincipal();
            }else{
            JOptionPane.showMessageDialog(null, "Dados não alterados!","Informação!", JOptionPane.WARNING_MESSAGE);
                TelaMenuPrincipal();
            }
    }//GEN-LAST:event_btnAvancarMouseReleased
 
    private void CampoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEmailActionPerformed
        CampoEmail.setText(EmailUser);
    }//GEN-LAST:event_CampoEmailActionPerformed

    private void CampoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSenhaActionPerformed
        CampoSenha.setText(SenhaUser);
    }//GEN-LAST:event_CampoSenhaActionPerformed

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
                new AlterarDados().setVisible(true);
                
            }
        });
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoEmail;
    private javax.swing.JTextField CampoNomeUsuario;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel TextAlterarDados;
    private javax.swing.JLabel TextEmail;
    private javax.swing.JLabel TextNome;
    private javax.swing.JLabel TextSenha;
    private javax.swing.JLabel btnAvancar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}