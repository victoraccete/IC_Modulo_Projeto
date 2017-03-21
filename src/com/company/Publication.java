package com.company;

import java.util.Date;
import java.util.List;

/**
 * Created by Jose_Augusto on 20/03/2017.
 */
public class Publication extends Production{

    @Override
    Production criarNova() {
        return null;
    }

    //private String  title; Não precisa pois já tem na classe mãe
    private String abstract_;
    private String revista;
    private List<String> palavrasChave;
    private List<Object> autores;// TODO: 20/03/2017 Modificar tipo de Object para o tipo correto
    private String financiador;
    private Date dataDeSubmissao;
    private Date dataDePublicacao;

    public Date getDataDeSubmissao() {
        return dataDeSubmissao;
    }

    public Date getDataDePublicacao() {
        return dataDePublicacao;
    }

    public String getRevista() {
        return revista;
    }

    public List<String> getPalavrasChave() {
        return palavrasChave;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getAbstract_() {
        return abstract_;
    }


}
