package br.com.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

}
