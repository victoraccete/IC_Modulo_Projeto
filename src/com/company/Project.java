package com.company;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Project extends Production{
    // TODO: Calendar period;
    String description;

    /*
     *O atributo statusStrings é um array que contém as strings que dizem respeito à situação
     * atual do projeto. O atributo statusPos vai guardar a posição desse array, para saber o status atual.
     * Ex: se o statusPos for 2, significa que o projeto está concluído, pois statusStrings[2] é concluído.
     */
    String statusStrings[] = {"Em elaboração", "Em andamento", "Concluído"};
    private int statusPos = 0;

    String natureza; //Tipo de projeto
    ArrayList members;
    String funder;
    String researchLine;

    Project projectEditionInfo(Project proj){
        Scanner scan = new Scanner(System.in);
        try {
            if(statusPos != 2){
                System.out.println("Digite o novo título.");
                String title = scan.nextLine();
                System.out.println("Digite a nova descrição.");
                String description = scan.nextLine();
                System.out.println("Digite a nova linha de pesquisa.");
                String researchLine = scan.nextLine();
                System.out.println("Digite a nova agência financiadora.");
                String funder = scan.nextLine();
                proj = proj.editProject(title, description, researchLine, funder);
            } else {
                System.out.println("Projetos concluídos só estão disponíveis para consulta.");
            }
        } catch (Exception e){
            System.out.println("Projeto não editado.");
        }


        return proj;
    }

    private Project editProject(String title, String description, String researchLine, String funder){
            this.title = title;
            this.description = description;
            this.researchLine = researchLine;
            this.funder = funder;
            
            return this;
    }

    @Override
    Production createNew() {
        return null;
    }
}
