package com.curso.cardview.Model;

public class Postagem {

    private String postagem;
    private String nome;
    private int imagem;

    public Postagem() {
    }

    public Postagem(String postagem, String nome, int imagem) {
        this.postagem   = postagem;
        this.nome       = nome;
        this.imagem     = imagem;
    }

    public String getPostagem() {
        return postagem;
    }

    public void setPostagem(String postagem) {
        this.postagem = postagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
