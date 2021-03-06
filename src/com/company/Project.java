package com.company;
import java.util.ArrayList;
import java.util.Scanner;

    /* Editado por carlospinheirof 31/03/2017.
    */

public class Project extends Production<Project>{
    
    /*
     *O atributo statusStrings é um array que contém as strings que dizem respeito à situação
     * atual do projeto. O atributo statusPos vai guardar a posição desse array, para saber o status atual.
     * Ex: se o statusPos for 2, significa que o projeto está concluído, pois statusStrings[2] é concluído.
     */
    String statusStrings[] = {"Em elaboração", "Em andamento", "Concluído"};
    private int statusPos = 0;
    String descricao;
    String tipo; //Tipo de projeto
    ArrayList <Object> integrantes = new ArrayList<Object>(); //TODO: Colocar o tipo de objeto correto no <>.
    ArrayList <Publication> publicacoes = new ArrayList<Publication>();
    String financiador;
    String linhaDePesquisa;
    Scanner ler = new Scanner(System.in);
    String stringaux;
    String dataDeInicio;
    String datadeTermino;
    private boolean v;
    Publication pubaux;
    public void informacoesDoProjeto(){
        System.out.printf("Título do projeto: %s\n", this.titulo);
        System.out.printf("Descrição:%s\n", this.descricao);
        System.out.printf("Linha de pesquisa: %s\n", this.linhaDePesquisa);
        System.out.printf("Financiador: %s\n", this.financiador);
        System.out.printf("Tipo de projeto: %s\n", this.tipo);
        if(this.statusPos == 0){
            System.out.println("Em elaboração");
        }else if(this.statusPos == 1){
            System.out.println("Em andamento");
        }else{
            System.out.println("Concluído");
        }
        listaDePublicacoes();
    }

    public boolean adicionarIntegrante(Object novo){
      return integrantes.add(novo);
   }


    @Override
    Project criarNova() {
        return this;
    }

    void projectEditionInfo(){
        Scanner scan = new Scanner(System.in);
        v = false;
        while(!v){
            try {
                if(statusPos != 2){
                    System.out.println("Digite o novo título.");
                    String titulo_ = scan.nextLine();
                    System.out.println("Qual o tipo de projeto.");
                    String tipo_ = scan.nextLine();
                    System.out.println("Digite a nova descrição.");
                    String descricao_ = scan.nextLine();
                    System.out.println("Digite a nova linha de pesquisa.");
                    String linhaDePesquisa_ = scan.nextLine();
                    System.out.println("Digite a nova agência financiadora.");
                    String financiador_ = scan.nextLine();
                    System.out.println("Situação atual do projeto.\n 0 - elaboração\n 1 - Em andamento\n 2 - Concluído\nAo marcar como concluído o projeto n poderá ser mais editado, apenas consultado");
                    int situacao = scan.nextInt();
                    while(situacao < 0 || situacao > 2){
                        System.out.println("Por favor, apenas 0/1/2.");
                        situacao = scan.nextInt();
                    }
                    scan.nextLine();
                    System.out.println("Digite a data de inicio");
                    String dataDeInicio_ = scan.nextLine();
                    if(situacao != 2){
                         editarProjeto(titulo_, descricao_, linhaDePesquisa_, financiador_, tipo_, dataDeInicio_, situacao, null);
                    }else{
                        System.out.println("Digite a data de termino");
                        String datadeTermino_ = scan.nextLine();
                        editarProjeto(titulo_, descricao_, linhaDePesquisa_, financiador_, tipo_, dataDeInicio_, situacao, datadeTermino_);
                    }
                } else {
                    System.out.println("Projetos concluídos só estão disponíveis para consulta.");
                }
                v = true;
            } catch (Exception e){
                System.out.println("Projeto não editado.");
                stringaux = ler.nextLine();
            }
        }
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getLinha(){
        return this.linhaDePesquisa;
    }
    public int getSituacao(){
        return this.statusPos;
    }
    private void editarProjeto(String titulo, String descricao, String linhaDePesquisa, String financiador, String tipo, String dataDeInicio, int situation, String datadeTermino){
            this.titulo = titulo;
            this.descricao = descricao;
            this.linhaDePesquisa = linhaDePesquisa;
            this.financiador = financiador;
            this.tipo = tipo;
            this.statusPos = situation;
            this.dataDeInicio = dataDeInicio;
            this.datadeTermino = datadeTermino;
            
    }
     public boolean adicionarPublicacao(Publication nova){
        return publicacoes.add(nova);
    }
    private void listaDePublicacoes(){
        if(!(this.publicacoes.isEmpty())) {
            for (int i = 0; i < this.publicacoes.size(); i++) {
                pubaux = this.publicacoes.get(i);
                pubaux.informacoesDaPublicacao();
            }
        } else{
            System.out.println("Esse projeto não possui publicações");
        }
    }

    public static Project buscarProjetoNome(ArrayList <Project> projetos){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o titulo do projeto");
        String stringaux = ler.nextLine();
        int j = 0;
        Project proaux = new Project();
        for (int i = 0; i < projetos.size(); i++) {
            proaux = projetos.get(i);
            if (stringaux.equals(proaux.getTitulo())) {
                i = projetos.size();
                j = 1;
            }
        }
        if (j == 0) {
            System.out.println("Esse projeto não foi encontrando.");
            return null;
        }else{
            return proaux;
        }
    }
}
