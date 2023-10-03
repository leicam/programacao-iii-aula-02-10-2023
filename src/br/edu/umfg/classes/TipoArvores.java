package br.edu.umfg.classes;

import java.awt.*;

public class TipoArvores {
    private String nome;
    private Color cor;
    private String dados;

    public TipoArvores(String nome, Color cor, String dados) {
        this.nome = nome;
        this.cor = cor;
        this.dados = dados;
    }

    public void desenhar(Graphics graphics,Integer x,Integer y){
        graphics.setColor(Color.BLACK);
        graphics.fillRect(x-1,y,3,5);
        graphics.setColor(this.cor);
        graphics.fillOval(x-5,y-10,10,10);

    }
}
