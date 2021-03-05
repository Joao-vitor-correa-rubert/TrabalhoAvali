/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.PessoaVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author Fernando Souza & João V.
 * @since 01/06/2014 - 08:50
 * @version 1.9 Beta Magnifico
 */
public class PessoaDAO {
    
    public void cadastrarPessoa(PessoaVO p) throws SQLException{
          Connection con = ConexaoBanco.getConexao();
          Statement Stat = con.createStatement();
       
       try {
           String sql= "";
           
           sql = "insert into pessoa(idpessoa,nome,nickname,email,sexo,idade,telefone,senha)"
                 +"values(null,'"+p.getNome()+"','"+p.getNickname()+"','"+p.getEmail()+"','"+p.getSexo()+"',"+p.getIdade()+",'"+p.getTelefone()+"','"+p.getSenha()+"')";
           
           Stat.execute(sql);
           
       } catch (SQLException se) {
           throw  new SQLException("Erro ao cadastrar,"
                   + "tente novamente!"+se.getMessage());
       }finally{
           Stat.close();
           con.close();
       }//fecha finally
    }//FECHA SQL
}
