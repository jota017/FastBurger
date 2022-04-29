/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import dao.PedidosDAO;
import dao.SanduicheDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ModelTable;
import modelo.Usuario;
import modelo.Pedidos;

/**
 *
 * @author aluno
 */
public class TelaCarrinho extends javax.swing.JFrame {

 
    /**
     * Creates new form TelaCarrinho
     */
    public TelaCarrinho() {
        initComponents();
        setResizable(false);
    setLocationRelativeTo(null);
   this.setLocationRelativeTo(null);
   listarValoresProdutos();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCarrinho = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        Remover2 = new javax.swing.JButton();
        txtRemoverPedi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Fazer Pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));

        tabelaCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Valor", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCarrinhoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCarrinho);
        if (tabelaCarrinho.getColumnModel().getColumnCount() > 0) {
            tabelaCarrinho.getColumnModel().getColumn(0).setResizable(false);
            tabelaCarrinho.getColumnModel().getColumn(1).setResizable(false);
            tabelaCarrinho.getColumnModel().getColumn(2).setResizable(false);
            tabelaCarrinho.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 440));

        jButton2.setText("Atualizar Carrinho");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        Remover2.setText("Remover");
        Remover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remover2ActionPerformed(evt);
            }
        });
        getContentPane().add(Remover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));
        getContentPane().add(txtRemoverPedi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/telas FastBurguer (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setPreferredSize(new java.awt.Dimension(203, 60));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/sanduba-removebg-preview (4).png"))); // NOI18N
        jMenu1.setText("Card�pio");

        jMenuItem4.setText("Pedidos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Carrinho-removebg-preview.png"))); // NOI18N
        jMenu2.setText("Carrinho");

        jMenuItem1.setText("Menu Principal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
new UsuarioGUI().setVisible(true);
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
new TelaSanduiches().setVisible(true);
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new CadastroPerfil().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelaCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCarrinhoMouseClicked
listarValoresProdutos();
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaCarrinhoMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
listarValoresProdutos();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Remover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remover2ActionPerformed
if (txtRemoverPedi.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Erro ao excluir o pedido, o campo n�o pode estar vazio!");
    } else {
        
        int Idpedi1;
        Idpedi1 = Integer.parseInt(txtRemoverPedi.getText());
        
     
Pedidos pedi = new Pedidos();
pedi.setIdpedi(Idpedi1);

PedidosDAO pediDAO = new PedidosDAO();
   pediDAO.ExcluirSanduiche(pedi);

listarValoresProdutos(); 
Clear();
// TODO add your handling code here:
    }//GEN-LAST:event_Remover2ActionPerformed
    }
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
            java.util.logging.Logger.getLogger(TelaCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCarrinho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Remover2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaCarrinho;
    private javax.swing.JTextField txtRemoverPedi;
    // End of variables declaration//GEN-END:variables
public void Clear(){
txtRemoverPedi.setText("");
}
    
    
private void listarValoresProdutos() {
        try {
            PedidosDAO objpedidos = new PedidosDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaCarrinho.getModel();
            model.setNumRows(0);

            ArrayList<modelo.Pedidos> lista = objpedidos.PesquisarPedidos();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getIdpedi(),
                    lista.get(num).getNome(),
                    lista.get(num).getValor(),
                    lista.get(num).getQuant(),});
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Valores Cadastro Produtos VIEW: " + erro);
        }

    }


}
