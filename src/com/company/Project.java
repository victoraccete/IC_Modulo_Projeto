package com.company;
import java.util.ArrayList;
import java.util.Scanner;

    /* Editado por carlospinheirof 31/03/2017.
    */

public class Project extends Production{
    String description;

    /*
     *O atributo statusStrings é um array que contém as strings que dizem respeito à situação
     * atual do projeto. O atributo statusPos vai guardar a posição desse array, para saber o status atual.
     * Ex: se o statusPos for 2, significa que o projeto está concluído, pois statusStrings[2] é concluído.
     */
    String statusStrings[] = {"Em elaboração", "Em andamento", "Concluído"};
    private int statusPos = 0;

    String type; //Tipo de projeto
    ArrayList <Person> members = new ArrayList<Person>(); // Colocar o tipo de objeto correto no <>.
    String funder;
    String researchLine;
    String title;
    String dateBegin;
    String dateEnd;
    String aux;
    public void infoProject(){
        System.out.printf("Título do projeto: %s\n", this.title);
        System.out.printf("Descrição:\n%s\n", this.description);
        System.out.printf("Linha de pesquisa: %s\n", this.researchLine);
        System.out.printf("Financiador: %s\n", this.funder);
        System.out.printf("Tipo de projeto: %s\n", this.type);
        if(this.statusPos == 0){
            System.out.println("Em elaboração");
        }else if(this.statusPos == 1){
            System.out.println("Em andamento");
        }else{
            System.out.println("Concluído");
        }
    }
    public boolean addMember(Person novo){
      return members.add(novo);
     
   }
    void projectEditionInfo(){
        Scanner scan = new Scanner(System.in);
        try {
            if(statusPos != 2){
                System.out.println("Digite o novo título.");
                String title_ = scan.nextLine();
                System.out.println("Qual o tipo de projeto.");
                String type_ = scan.nextLine();
                System.out.println("Digite a nova descrição.");
                String description_ = scan.nextLine();
                System.out.println("Digite a nova linha de pesquisa.");
                String researchLine_ = scan.nextLine();
                System.out.println("Digite a nova agência financiadora.");
                String funder_ = scan.nextLine();
                System.out.println("Situação atual do projeto.\n 0 - elaboração\n 1 - Em andamento\n 2 - Concluído\nAo marcar como concluído o projeto n poderá ser mais editado, apenas consultado");
                int situation_ = scan.nextInt();
                    aux = scan.nextLine();
                while(situation_ < 0 || situation_ > 2){
                    System.out.println("Por favor, apenas 0/1/2.");
                    situation_ = scan.nextInt();
                    aux = scan.nextLine();
                }
                System.out.println("Digite a data de inicio");
                String dateBegin_ = scan.nextLine();
                if(situation_ != 2){
                     editProject(title_, description_, researchLine_, funder_, type_, dateBegin_, situation_, null);
                }else{
                    System.out.println("Digite a data de termino");
                    String dateEnd_ = scan.nextLine();
                    editProject(title_, description_, researchLine_, funder_, type_, dateBegin_, situation_, dateEnd_);
                }
            } else {
                System.out.println("Projetos concluídos só estão disponíveis para consulta.");
            }
        } catch (Exception e){
            System.out.println("Projeto não editado.");
        }
    }

    private void editProject(String title, String description, String researchLine, String funder, String type, String dateBegin, int situation, String dateEnd){
            this.title = title;
            this.description = description;
            this.researchLine = researchLine;
            this.funder = funder;
            this.type = type;
            this.statusPos = situation;
            this.dateBegin = dateBegin;
            this.dateEnd = dateEnd;
            
    }

    @Override
    Production createNew() {
        return null;
    }
}
