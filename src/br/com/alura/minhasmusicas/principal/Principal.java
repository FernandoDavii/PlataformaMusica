package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Audio;
import br.com.alura.minhasmusicas.modelos.Minhaspreferidas;
import br.com.alura.minhasmusicas.modelos.Musicas;
import br.com.alura.minhasmusicas.modelos.podcast;

public class Principal {
    public static void main(String[] args) {
        Musicas music = new Musicas();
        music.setTitulo("Quebradeira");
        music.setCantor("Nandinho de Bangu");
        music.setGenero("funk");
        for (int i = 0; i < 300; i++) {
            music.reproduz();
        }
        for (int i = 0; i < 200; i++) {
            music.curte();
        }
        podcast pod = new podcast();
        pod.setTitulo("Como me tornei o Brasileiro com a maior empresa do mundo?");
        pod.setApresentador("Fernando Davi");
        pod.setDescricao("Trajetória de Fernando Davi até se tornar o que é hoje!");
        for (int i = 0; i < 500; i++) {
            pod.reproduz();
        }
        for (int i = 0; i < 250; i++) {
            pod.curte();
        }
        Minhaspreferidas minhaspreferidas = new Minhaspreferidas();

        minhaspreferidas.inclui(music);
        minhaspreferidas.inclui(pod);



    }

}
