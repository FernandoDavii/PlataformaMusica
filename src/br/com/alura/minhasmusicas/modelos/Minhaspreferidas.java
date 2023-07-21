package br.com.alura.minhasmusicas.modelos;

public class Minhaspreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " Está entre as preferidas do momento");
        }else{
            System.out.println(audio.getTitulo() + " Músicas que as pessoas estão curtindo");
        }
    }
}
