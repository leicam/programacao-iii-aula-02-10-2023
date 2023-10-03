import br.edu.umfg.classes.Floresta;
import br.edu.umfg.classes.TipoArvores;

import java.awt.*;

public class Main {
    private static Integer TAMANHO_QUADRO = 3000;
    private static Integer ARVORES_PARA_DESENHAR = 90000;
    private static Integer TIPOS_DE_ARVORES = 4;

    public static void main(String[] args) {
        Floresta floresta = new Floresta();

        for (Integer i = 0;
             i < Math.floor(ARVORES_PARA_DESENHAR/ TIPOS_DE_ARVORES);
             i++){

            floresta.plantar(random(0,TAMANHO_QUADRO),
                    random(0,TAMANHO_QUADRO),
                    "arvore de outono",
                    Color.ORANGE,
                    "textura arvore de outono");

            floresta.plantar(random(0,TAMANHO_QUADRO),
                    random(0,TAMANHO_QUADRO),
                    "arvore de verao",
                    Color.GREEN,
                    "textura arvore de verao");
            floresta.plantar(random(0,TAMANHO_QUADRO),
                    random(0,TAMANHO_QUADRO),
                    "arvore de blue",
                    Color.BLUE,
                    "textura arvore de Primavera");
            floresta.plantar(random(0,TAMANHO_QUADRO),
                    random(0,TAMANHO_QUADRO),
                    "arvore de red",
                    Color.RED,
                    "textura arvore de Primavera");
        }
        floresta.setSize(TAMANHO_QUADRO,
                TAMANHO_QUADRO);
        floresta.setVisible(true);
        System.out.println("Arvores para desenhar: "
                + ARVORES_PARA_DESENHAR);
        System.out.println("Memória Utilizada: "
                + (ARVORES_PARA_DESENHAR * 8 + TIPOS_DE_ARVORES
                    * 30 / 1024 / 1024
        ));
    }

    private static Integer random(
            Integer minimo, Integer maximo){
        return minimo +
                (int)(Math.random() * (maximo - minimo) +1);
    }
}