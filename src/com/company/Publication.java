package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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

    public void informacoesDaPublicacao() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Abstract: " + this.abstract_);
        System.out.print("Palavras-chave: ");
        for(String palavra : this.palavrasChave) {
            System.out.print(palavra + " ");
        }
        System.out.println();

        System.out.print("Autores: ");
        for(Object autor : this.autores) { //TODO: 21/03/2017 Modificar tipo de Object para o tipo correto
            //TODO: 21/03/2017 Colocar para imprimir autor.nome
        }
        System.out.println();

        System.out.println("Revista: " + this.revista);


        DateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data de submissão: " + dateFormat.format(this.dataDeSubmissao));
        System.out.println("Data de publicação: " +dateFormat.format( this.dataDePublicacao));

        System.out.println("Financiador: " + this.financiador);

    }

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
