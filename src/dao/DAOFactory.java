/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
/**
 *
 * @author Fernando Souza & João V.
 * @since 01/06/2014 - 08:50
 * @version 1.9 Beta Magnifico
 */
public class DAOFactory {
    
    private static final PessoaDAO pDAO = new PessoaDAO();
    
    public static PessoaDAO getPessoaDAO(){
        return pDAO;
    }//fecha getprodutoDAO
}//fecha classe

