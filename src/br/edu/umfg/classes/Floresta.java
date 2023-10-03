package br.edu.umfg.classes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Floresta extends JFrame {
    private List<Arvore> arvores = new ArrayList<Arvore>();

    @Override
    public void paint(Graphics graphics){

        for(Arvore arvore : arvores){
            arvore.desenhar(graphics);
        }
    }

    public void plantar(Integer x,Integer y,String nome,Color cor,String dados){
        TipoArvores tipo = FabricaArvores.obterTipoArvores(nome, cor, dados);
        arvores.add(new Arvore(x,y,tipo));
    }

}
