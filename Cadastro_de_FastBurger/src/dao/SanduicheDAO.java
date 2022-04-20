/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.*;
import javax.swing.JOptionPane;

       

/**
 *
 * @author aluno
 */
public class SanduicheDAO {
    
    private Connection connection;
    String nome;
    String ingredientes;
    Long valor;
    PreparedStatement stmt;
    ResultSet rs;
    ArrayList<modelo.Usuario> lista = new ArrayList<>();
    public SanduicheDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    /**
     *
     * @param usuario
     * @throws SQLException
     */
    public void salvar(Usuario usuario) throws SQLException{
        String sql = "INSERT INTO sanduichefb(nome,ingredientes,valor) VALUES(?,?,?)"; 
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getIngredientes());
            stmt.setString(3, usuario.getValor());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
         new RuntimeException(u);
        }
    }
    public ArrayList<modelo.Usuario> PesquisarSanduiches() {
        String sql = "select * from sanduichefb";
        connection = new ConnectionFactory().getConnection();

        try {
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                modelo.Usuario objtbsanduiche = new modelo.Usuario();
                objtbsanduiche.setIdsanduichefb(rs.getInt("idsanduichefb"));
                objtbsanduiche.setNome(rs.getString("nome"));
                objtbsanduiche.setIngredientes(rs.getString("ingredientes"));
                objtbsanduiche.setValor(rs.getString("valor"));

                lista.add(objtbsanduiche);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PesquisarSanduichesDAO Pesquisar: " + erro);
        }
        return lista;
    }
    public ArrayList listarTodos() {
        try {

            ArrayList dado = new ArrayList();

            PreparedStatement ps = connection.prepareStatement("SELECT * FROM usuario");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                dado.add(new Object[]{
                    rs.getString("nome"),
                    rs.getString("ingredientes"),
                    rs.getString("valor"),
                });

            }
            ps.close();
            rs.close();
            connection.close();

            return dado;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList");
            return null;
        }
    }
}
