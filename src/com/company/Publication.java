package com.company;

import java.util.Date;
import java.util.List;

/**
 * Created by Jose_Augusto on 20/03/2017.
 */
public class Publication extends Production{

    @Override
    Production createNew() {
        return null;
    }

    private String  title;
    private String abstract_;
    private String revista;
    private List<String> keyWords;
    private List<Object> autores;// TODO: 20/03/2017 Modificar tipo de Object para o tipo correto
    private String financiador;
    private Date submissionDate;
    private Date publicationDate;

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public String getRevista() {
        return revista;
    }

    public List<String> getKeyWords() {
        return keyWords;
    }


    public String getTitle() {
        return title;
    }

    public String getAbstract_() {
        return abstract_;
    }


}
