import br.com.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIngrid = new Dev();
        devIngrid.setNome("Ingrid");
        devIngrid.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ingrid: " + devIngrid.getConteudosIncritos());
        devIngrid.progredir();
        devIngrid.progredir();
        System.out.println(".");
        System.out.println("Conteúdos Inscritos Ingrid: " + devIngrid.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos Ingrid: " + devIngrid.getConteudosConcluidos());
        System.out.println("XP" + devIngrid.calcularXp());

        System.out.println(".....");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosIncritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println(".");
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP" + devJoao.calcularXp());

    }
}