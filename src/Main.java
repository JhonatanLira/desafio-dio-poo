import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//Herança
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Curso de javascript");
        curso2.setCargaHoraria(7);

      //  System.out.println(curso1);
        //System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Java");
        mentoria1.setDescricao("descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Desafio desafio = new Desafio();
        desafio.setTitulo("Desafio POO");
        desafio.setDescricao("Desdicao desafio POO");
        desafio.setLinkGithub("https://github.com/JhonatanLira/desafio-dio-poo.git");

        Dev devJhow = new Dev();
        devJhow.setNome("Jhonatan");
        devJhow.inscreverBootcamp(bootcamp);
        System.out.println("-");
        System.out.println("Conteúdos Inscritos: "+devJhow.getConteudosInscritos());
        devJhow.progredir();
        System.out.println("Conteúdos Inscritos: "+devJhow.getConteudosInscritos());

        desafio.envioDesafio(desafio);

      //  System.out.println("Conteúdos Concluídos: "+devJhow.getConteudosConcluidos());
      //  System.out.println("XP: "+devJhow.calcularTotalXp());
/*
        System.out.println("-------------------------");

        Dev devBill = new Dev();
        devBill.setNome("Bill");
        devBill.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: "+devBill.getConteudosInscritos());
        devBill.progredir();
        devBill.progredir();
        devBill.progredir();
        System.out.println("Conteúdos Inscritos: "+devBill.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: "+devBill.getConteudosConcluidos());
        System.out.println("XP: "+devBill.calcularTotalXp());
*/

    }
}