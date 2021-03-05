/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.PessoaDAO;
import java.sql.SQLException;
import modelo.PessoaVO;
/**
 *
 * @author Aluno
 */
public class PessoaServicos {
    public void cadastrarPessoa(PessoaVO p) throws SQLException{
        PessoaDAO pDAO = DAOFactory.getPessoaDAO();
        pDAO.cadastrarPessoa(p);
    }
    
}//fecha classe

