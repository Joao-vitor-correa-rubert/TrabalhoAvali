/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author Aluno
 */
public class ServicosFactory {
   private static final PessoaServicos ps = new PessoaServicos();
    
    public static PessoaServicos getPessoaServicos(){
        return ps;
    }
    
}
