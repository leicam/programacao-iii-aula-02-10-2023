package br.edu.umfg.classes;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class FabricaArvores {
    private static Map<String, TipoArvores> tipos =
            new HashMap<String, TipoArvores>();


    public static TipoArvores obterTipoArvores(String nome
            , Color cor, String dados){

        TipoArvores tipo = tipos.get(nome);

        if(tipo != null) {
            return tipo;
        }

        tipo = new TipoArvores(nome,cor,dados);
        tipos.put(nome,tipo);
        return tipo;
    }

}

