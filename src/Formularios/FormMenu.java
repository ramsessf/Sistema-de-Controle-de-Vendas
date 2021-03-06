/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author virtual box
 */
public class FormMenu extends javax.swing.JFrame {

    /**
     * Creates new form FormMenu
     */
    public FormMenu() {
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

        DeskPainel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivos = new javax.swing.JMenu();
        subMenuArqClientes = new javax.swing.JMenuItem();
        subMenuArqProdutos = new javax.swing.JMenuItem();
        subMenuArqUsuarios = new javax.swing.JMenuItem();
        subMenuArqSenha = new javax.swing.JMenuItem();
        subMenuArqUsuario = new javax.swing.JMenuItem();
        subMenuArqSair = new javax.swing.JMenuItem();
        menuMovimentos = new javax.swing.JMenu();
        subMenuVendas = new javax.swing.JMenuItem();
        subMenuRelVendas = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        Sobre = new javax.swing.JMenuItem();
        subMenuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DeskPainel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout DeskPainelLayout = new javax.swing.GroupLayout(DeskPainel);
        DeskPainel.setLayout(DeskPainelLayout);
        DeskPainelLayout.setHorizontalGroup(
            DeskPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 863, Short.MAX_VALUE)
        );
        DeskPainelLayout.setVerticalGroup(
            DeskPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        menuArquivos.setText("Arquivos");

        subMenuArqClientes.setText("Clientes");
        subMenuArqClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuArqClientesActionPerformed(evt);
            }
        });
        menuArquivos.add(subMenuArqClientes);

        subMenuArqProdutos.setText("Produtos");
        subMenuArqProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuArqProdutosActionPerformed(evt);
            }
        });
        menuArquivos.add(subMenuArqProdutos);

        subMenuArqUsuarios.setText("Usuarios");
        subMenuArqUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuArqUsuariosActionPerformed(evt);
            }
        });
        menuArquivos.add(subMenuArqUsuarios);

        subMenuArqSenha.setText("Alterar senha");
        menuArquivos.add(subMenuArqSenha);

        subMenuArqUsuario.setText("Alterar usuario");
        menuArquivos.add(subMenuArqUsuario);

        subMenuArqSair.setText("Sair");
        menuArquivos.add(subMenuArqSair);

        jMenuBar1.add(menuArquivos);

        menuMovimentos.setText("Movimentos");

        subMenuVendas.setText("Vendas");
        menuMovimentos.add(subMenuVendas);

        subMenuRelVendas.setText("Relatórios Vendas");
        menuMovimentos.add(subMenuRelVendas);

        jMenuBar1.add(menuMovimentos);

        menuAjuda.setText("Ajuda");

        Sobre.setText("Ajuda");
        menuAjuda.add(Sobre);

        subMenuSobre.setText("Sobre");
        menuAjuda.add(subMenuSobre);

        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeskPainel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeskPainel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuArqClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuArqClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subMenuArqClientesActionPerformed

    private void subMenuArqProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuArqProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subMenuArqProdutosActionPerformed

    private void subMenuArqUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuArqUsuariosActionPerformed
        // botao menu cadastro usuarios
        FormUsuario usuario = new FormUsuario();
        DeskPainel.add(usuario);
        usuario.show();
    }//GEN-LAST:event_subMenuArqUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DeskPainel;
    private javax.swing.JMenuItem Sobre;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivos;
    private javax.swing.JMenu menuMovimentos;
    private javax.swing.JMenuItem subMenuArqClientes;
    private javax.swing.JMenuItem subMenuArqProdutos;
    private javax.swing.JMenuItem subMenuArqSair;
    private javax.swing.JMenuItem subMenuArqSenha;
    private javax.swing.JMenuItem subMenuArqUsuario;
    private javax.swing.JMenuItem subMenuArqUsuarios;
    private javax.swing.JMenuItem subMenuRelVendas;
    private javax.swing.JMenuItem subMenuSobre;
    private javax.swing.JMenuItem subMenuVendas;
    // End of variables declaration//GEN-END:variables
}
