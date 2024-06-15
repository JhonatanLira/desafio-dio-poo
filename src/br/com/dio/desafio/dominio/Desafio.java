package br.com.dio.desafio.dominio;

import java.util.Optional;

public class Desafio extends Conteudo{

    private String linkGithub;

    @Override
    public double calcularXp() {
        return XP_PADRAO*12;
    }
    public void envioDesafio(Desafio desafio){
        if(desafio != null){
            System.out.println("Desafio entregue com sucesso!");
            System.out.println("Titulo: "+this.getTitulo()+"\n Descrição: "+this.getDescricao()
                    +"\n Link do desafio: "+this.getLinkGithub());
        }
    }

    public String getLinkGithub() {
        return linkGithub;
    }

    public void setLinkGithub(String linkGithub) {
        this.linkGithub = linkGithub;
    }
}
