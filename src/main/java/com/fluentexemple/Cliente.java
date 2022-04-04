
package com.fluentexemple;

/**
 *
 * @author felipe
 */
public class Cliente {
    private String nome;
    private String sobrenome;
    private String email;
    private boolean ativo;
    public Cliente comNome(String nome) {
        this.nome = nome;
        return this;
    }
    public Cliente comSobreNome(String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }
     public Cliente comEmail(String email) {
        this.email = email;
        return this;
    }
    public Cliente habilitado() {
        this.ativo = true;
        return this;
    }
    
     public Cliente desahabilitado() {
        this.ativo = false;
        return this;
    }
}