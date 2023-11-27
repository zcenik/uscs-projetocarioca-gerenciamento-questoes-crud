/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import Dialogs.CustomDialogBox;
import Dialogs.CustomConfirmBox;
import Dialogs.CustomSuccessBox;
import Connection.DBConnection;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Gustavo
 */
public class AlterarQuestao extends javax.swing.JFrame {

    /**
     * Creates new form CadastroPage
     */
    public AlterarQuestao() {
        initComponents();
        try{
            Connection con = DBConnection.getConnection();
            Statement pst = con.createStatement();
            ResultSet rs = pst.executeQuery("SELECT COUNT(ID) FROM QUESTOES");
            
        }catch(Exception e){
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
        }
    }
    public boolean validateLength(){
        if(label_questao.getText().equals("") || label_a.getText().equals("") || label_b.getText().equals("") || label_c.getText().equals("") || label_d.getText().equals("") || label_resposta.getText().equals(""))
        {
            CustomDialogBox ccb = new CustomDialogBox("Pesquise um ID antes de alterar.");
            ccb.setVisible(true);
            return false;
        }
            
        if(label_questao.getText().length() > 100){
            CustomDialogBox ccb = new CustomDialogBox("A pergunta não pode conter mais de 100 caracteres.");
            ccb.setVisible(true);
            return false;
        }
        if(label_a.getText().length() > 70){
            CustomDialogBox ccb = new CustomDialogBox("A alternativa (A) não pode conter mais de 70 caracteres.");
            ccb.setVisible(true);
            return false;
        }
        if(label_b.getText().length() > 70){
            CustomDialogBox ccb = new CustomDialogBox("A alternativa (B) não pode conter mais de 70 caracteres.");
            ccb.setVisible(true);
            return false;
        }
        if(label_c.getText().length() > 70){
            CustomDialogBox ccb = new CustomDialogBox("A alternativa (C) não pode conter mais de 70 caracteres.");
            ccb.setVisible(true);
            return false;
        }
        if(label_d.getText().length() > 70){
            CustomDialogBox ccb = new CustomDialogBox("A alternativa (D) não pode conter mais de 70 caracteres.");
            ccb.setVisible(true);
            return false;
        }
        if(label_resposta.getText().length() > 70){
            CustomDialogBox ccb = new CustomDialogBox("A Resposta não pode conter mais de 70 caracteres.");
            ccb.setVisible(true);
            return false;
        }
        if(label_resposta.getText().equals(label_a.getText()) || label_resposta.getText().equals(label_b.getText()) || label_resposta.getText().equals(label_c.getText()) || label_resposta.getText().equals(label_d.getText())){
        } else {
            CustomDialogBox ccb = new CustomDialogBox("Coloque a resposta igual a ao menos uma das alternativas.");
            ccb.setVisible(true);
            return false;
        }
           return true; 
    }
    
    public boolean validateNumberToQuery(){
        if(consulta_id.getText().equals("")){
            CustomDialogBox ccb = new CustomDialogBox("Campo Obrigatório, Insira um ID");
            ccb.setVisible(true);
            return false;
            
        }
            return true;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        consulta_id = new javax.swing.JTextField();
        label_a = new javax.swing.JTextField();
        label_b = new javax.swing.JTextField();
        label_c = new javax.swing.JTextField();
        label_d = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        label_resposta = new javax.swing.JTextField();
        rSButtonHover1 = new rojerusan.RSButtonHover();
        rSButtonHover2 = new rojerusan.RSButtonHover();
        label_questao = new javax.swing.JTextField();
        rSButtonHover3 = new rojerusan.RSButtonHover();
        jLabel13 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(34, 57, 121));
        jLabel6.setText("uma Questão existente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 410, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel2.setText("Resposta correta:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 650, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel3.setText("ID da questão:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel5.setText("Questão:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel7.setText("Opção A:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel10.setText("Opção B:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel11.setText("Opção C:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, -1, -1));

        consulta_id.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        consulta_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 204)));
        consulta_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_idActionPerformed(evt);
            }
        });
        jPanel1.add(consulta_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 90, 40));

        label_a.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        label_a.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 204)));
        jPanel1.add(label_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 1020, 40));

        label_b.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        label_b.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 204)));
        jPanel1.add(label_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 1020, 40));

        label_c.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        label_c.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 204)));
        jPanel1.add(label_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 1020, 40));

        label_d.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        label_d.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 204)));
        jPanel1.add(label_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 1020, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel12.setText("Opção D:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, -1, -1));

        label_resposta.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        label_resposta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 204)));
        jPanel1.add(label_resposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 640, 920, 40));

        rSButtonHover1.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 112, 192)));
        rSButtonHover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/qems/search.png"))); // NOI18N
        rSButtonHover1.setText("Buscar");
        rSButtonHover1.setColorHover(new java.awt.Color(0, 112, 192));
        rSButtonHover1.setColorText(new java.awt.Color(0, 112, 192));
        rSButtonHover1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 100, -1));

        rSButtonHover2.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 153, 102)));
        rSButtonHover2.setText("Limpar");
        rSButtonHover2.setColorHover(new java.awt.Color(255, 153, 102));
        rSButtonHover2.setColorText(new java.awt.Color(255, 153, 102));
        rSButtonHover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 740, -1, -1));

        label_questao.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        label_questao.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 204)));
        label_questao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                label_questaoActionPerformed(evt);
            }
        });
        jPanel1.add(label_questao, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 1020, 40));

        rSButtonHover3.setBorder(null);
        rSButtonHover3.setText("Alterar");
        rSButtonHover3.setColorHover(new java.awt.Color(34, 57, 121));
        rSButtonHover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 740, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 102));
        jLabel13.setText("ALTERAR");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 170, -1));

        close.setFont(new java.awt.Font("SansSerif", 0, 25)); // NOI18N
        close.setForeground(new java.awt.Color(153, 153, 153));
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 10, 20, 20));

        kGradientPanel1.setkEndColor(new java.awt.Color(34, 57, 121));
        kGradientPanel1.setkGradientFocus(100);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 204));
        kGradientPanel1.setkTransparentControls(false);
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kGradientPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 100, 10));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("USCS");
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 50));

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 830));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel14.setText(" Voltar");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 760, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 830));

        setSize(new java.awt.Dimension(1523, 824));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void consulta_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consulta_idActionPerformed

    private void rSButtonHover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover2ActionPerformed
        consulta_id.setText("");
        label_questao.setText("");
        label_a.setText("");
        label_b.setText("");
        label_c.setText("");
        label_d.setText("");
        label_resposta.setText("");
        consulta_id.setEditable(true);
    }//GEN-LAST:event_rSButtonHover2ActionPerformed

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        String id = consulta_id.getText();
        try{
            Connection con = DBConnection.getConnection();
            Statement pst = con.createStatement();
            ResultSet rs = pst.executeQuery("SELECT * FROM QUESTOES WHERE ID='"+id+"'");
            if(rs.first()){
                label_questao.setText(rs.getString(2));
                label_a.setText(rs.getString(3));
                label_b.setText(rs.getString(4));
                label_c.setText(rs.getString(5));
                label_d.setText(rs.getString(6));
                label_resposta.setText(rs.getString(7));
                consulta_id.setEditable(false);
            }else{
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                CustomDialogBox ccb = new CustomDialogBox("Este ID da questão não existe.");
                ccb.setVisible(true);
            }
        
        }catch (Exception e){
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,e);
        }
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void label_questaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_label_questaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_label_questaoActionPerformed

    private void rSButtonHover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover3ActionPerformed
        if(validateNumberToQuery())
        {
            if(validateLength()){
        String id = consulta_id.getText();
        String name = label_questao.getText();
        String opt1 = label_a.getText();
        String opt2 = label_b.getText();
        String opt3 = label_c.getText();
        String opt4 = label_d.getText();
        String resposta = label_resposta.getText();
        
        try{
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("UPDATE QUESTOES SET NAME=?, OPT1=?, OPT2=?, OPT3=?, OPT4=?, RESPOSTA=? WHERE ID=?");
            pst.setString(1,name);
            pst.setString(2,opt1);
            pst.setString(3,opt2);
            pst.setString(4,opt3);
            pst.setString(5,opt4);
            pst.setString(6,resposta);
            pst.setString(7,id);
            pst.executeUpdate();
            
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            setVisible(false);
            AlterarQuestao aq = new AlterarQuestao();
            aq.setVisible(true);
            CustomSuccessBox csb = new CustomSuccessBox("Exercício alterado com Sucesso!");
            csb.setVisible(true);
            }catch(Exception e){
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf,e);
            }
        }
        }
        
    }//GEN-LAST:event_rSButtonHover3ActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        CustomConfirmBox ccb = new CustomConfirmBox("Você deseja fechar o programa?", this);
        ccb.setVisible(true);
    }//GEN-LAST:event_closeMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        GerenciarPage gp = new GerenciarPage();
        gp.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(AlterarQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarQuestao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JTextField consulta_id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField label_a;
    private javax.swing.JTextField label_b;
    private javax.swing.JTextField label_c;
    private javax.swing.JTextField label_d;
    private javax.swing.JTextField label_questao;
    private javax.swing.JTextField label_resposta;
    private rojerusan.RSButtonHover rSButtonHover1;
    private rojerusan.RSButtonHover rSButtonHover2;
    private rojerusan.RSButtonHover rSButtonHover3;
    // End of variables declaration//GEN-END:variables
}

