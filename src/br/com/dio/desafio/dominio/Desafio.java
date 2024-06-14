package br.com.dio.desafio.dominio;

public class Desafio extends Conteudo{

    private String linkGithub;

    @Override
    public double calcularXp() {
        return 0;
    }
    public void envioDesafio(Desafio desafio){

    }

    public String getLinkGithub() {
        return linkGithub;
    }

    public void setLinkGithub(String linkGithub) {
        this.linkGithub = linkGithub;
    }
}
