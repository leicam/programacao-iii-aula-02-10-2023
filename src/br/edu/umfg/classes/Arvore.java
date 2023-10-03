package br.edu.umfg.classes;

import java.awt.*;

public class Arvore {
    private Integer x;
    private Integer y;
    private TipoArvores tipo;

    public Arvore(Integer x, Integer y, TipoArvores tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public void desenhar(Graphics graphics){
        tipo.desenhar(graphics,x,y);

    }
}
