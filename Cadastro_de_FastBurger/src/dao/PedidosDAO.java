/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Pedidos;

/**
 *
 * @author aluno
 */
public class PedidosDAO {
      private Connection connection;
      String nome;
    String valor;
    String quant;
    PreparedStatement stmt;
    ResultSet rs;
    ArrayList<modelo.Pedidos> lista = new ArrayList<>();
    public PedidosDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    /**
     *
     * @param usuario
     * @throws SQLException
     */
    public void salvar(Pedidos pedido) throws SQLException{
        String sql = "INSERT INTO pedidosfb(nome,valor,quant) VALUES(?,?,?)"; 
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, pedido.getNome());
            stmt.setString(2, pedido.getValor());
            stmt.setString(3, pedido.getQuant());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
         new RuntimeException(u);
        }
    }
    public ArrayList<modelo.Pedidos> PesquisarPedidos() {
        String sql = "select * from pedidosfb";
        connection = new ConnectionFactory().getConnection();

        try {
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                modelo.Pedidos objpedidos = new modelo.Pedidos();
                objpedidos.setIdpedi(rs.getInt("idpedi"));
                objpedidos.setNome(rs.getString("nome"));
                objpedidos.setValor(rs.getString("valor"));
                objpedidos.setQuant(rs.getString("quant"));
                

                lista.add(objpedidos);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutosDAO Pesquisar: " + erro);
        }
        return lista;
    }
}
