package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int classificacao;
    private int totalDeCurtidas;
    private int totalDeReproducoes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void curte(){
        this.totalDeCurtidas++;
    }
    public void reproduz(){
        this.totalDeReproducoes++;
    }
}
