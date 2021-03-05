/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Fernando Souza & João V.
 * @since 01/06/2014 - 08:50
 * @version 1.9 Beta Magnifico
 */
public class PessoaVO {
    
    private String nome;
    private String sexo;
    private String nickname;
    private String email;
    private int idade;
    private String telefone;
    private String senha;

    public PessoaVO() {
    }

    public PessoaVO(String nome, String sexo, String nickname, String email, int idade, String telefone, String senha) {
        this.nome = nome;
        this.sexo = sexo;
        this.nickname = nickname;
        this.email = email;
        this.idade = idade;
        this.telefone = telefone;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return  "\nNome: "+nome
                +"\nNickname: "+nickname
                +"\nE-mail: "+email
                +"\nSexo: "+sexo
                +"\nIdade: "+idade
                +"\nTelefone: "+telefone
                +"\nSenha: "+senha;
    }//fecha to string 
}//fecha class
