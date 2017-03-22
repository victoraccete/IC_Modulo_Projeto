package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Project proj = new Project();
        Project temp = proj.criarNova();
        if(temp == null) System.out.println("PASSOU!");
        private boolean v;
        private int comando = 1;
        private int comando2, j, i;
        private String stringaux;
        Scanner ler = new Scanner(System.in);
        ArrayList <Project> projetos = new ArrayList<Project>();
        Project proaux = new Project();
        while(comando != 0){
                System.out.println("Escolha a opção desejada\n1 - Editar projeto existente, 2 - Informação de um projeto, 0 - para sair desse menu");
                v = false;
                while(!v){
                    try{
                         comando = ler.nextInt();
                         stringaux = ler.nextLine();
                        if(comando < 0 || comando > 2){ //aumentar o 2 de acordo com a quantidade de opções que forem colocando.
                            System.out.println("Entrada inválida, digite novamente.");
                        }else{
                           v = true;
                        }     
                    }catch(Exception e){
                        System.out.println("Entrada inválida, digite novamente.");
                    }
                }
                switch(comando){
                    case 1:     //editar projeto.
                        v = false;
                        while(!v){
                            try{
                                // colocar o código.
                              v = true;      
                            }catch(Exception e){
                                System.out.println("Entrada inválida, tente novamente.");
                            }
                        }
                    break;
                    case 2:
                        v = false;
                        while(!v){
                            try{
                                System.out.println("Você Selecionou procurar um projeto");
                                System.out.println("Você deseja procurar pelo:\n 1 - título\n 2 - linha de pesquisa\n 3 - situação");
                                comando2 = ler.nextInt();
                                stringaux = ler.nextLine();
                                if(comando2 <= 0 || comando2 > 3){
                                     System.out.println("Comando foi inválido, digite 1 ou 2 ou 3.");
                                }else{
                                    switch(comando2){
                                        case 1:
                                              System.out.println("Digite o titulo do projeto");   
                                              stringaux = ler.nextLine();  
                                                j = 0;
                                                for(i = 0; i < projetos.size(); i++){
                                                    proaux = projetos.get(i);
                                                    if(stringaux.equals(proaux.getTitulo())){		// lembrar de criar esse método na classe project.				
                                                        i = projetos.size();
                                                        j = 1;
                                                    }
                                                }
                                                if(j == 0){
                                                    System.out.println("Esse projeto não foi encontrando.");
                                                    break;
                                                }
                                                proaux.informacoesDoProjeto();
                                        break;
                                        case 2:         ///problema de código repetido, não lembro como resolve.
                                            System.out.println("Digite a linha de pesquisa");   
                                              stringaux = ler.nextLine();  
                                                j = 0;
                                                for(i = 0; i < projetos.size(); i++){
                                                    proaux = projetos.get(i);
                                                    if(stringaux.equals(proaux.getLinha())){     // lembrar de criar esse método na classe project.				
                                                        proaux.informacoesDoProjeto();
                                                        j = 1;
                                                    }
                                                }
                                                if(j == 0){
                                                    System.out.println("Nenhum projeto foi encontrando.");
                                                    break;
                                                }
                                        break;
                                        case 3:
                                            System.out.println("Digite qual situação você deseja procurar.\n 1 - em elaboração\n 2 - em andamento\n 3 - Concluído"); 
                                            comando2 = ler.nextInt();
                                            stringaux = ler.nextLine();
                                            while(comando2 < 1 || comando2 > 3){
                                                System.out.println("Digite de 1 a 3.");
                                                comando2 = ler.nextInt();
                                                stringaux = ler.nextLine();
                                            }
                                            switch(comando2){
                                                case 1:
                                                    j = 0;
                                                    for(i = 0; i < projetos.size(); i++){
                                                        proaux = projetos.get(i);
                                                        if(proaux.getSituacao() == 1){     // lembrar de criar esse método na classe project.				
                                                            proaux.informacoesDoProjeto();
                                                            j = 1;
                                                        }
                                                    }
                                                    if(j == 0){
                                                        System.out.println("Nenhum projeto foi encontrando.");
                                                        break;
                                                    }
                                                break;
                                                case 2:
                                                     j = 0;
                                                    for(i = 0; i < projetos.size(); i++){
                                                        proaux = projetos.get(i);
                                                        if(proaux.getSituacao() == 2){     // lembrar de criar esse método na classe project.				
                                                            proaux.informacoesDoProjeto();
                                                            j = 1;
                                                        }
                                                    }
                                                    if(j == 0){
                                                        System.out.println("Nenhum projeto foi encontrando.");
                                                        break;
                                                    }
                                                break;
                                                case 3:
                                                     j = 0;
                                                    for(i = 0; i < projetos.size(); i++){
                                                        proaux = projetos.get(i);
                                                        if(proaux.getSituacao() == 3){     // lembrar de criar esse método na classe project.				
                                                            proaux.informacoesDoProjeto();
                                                            j = 1;
                                                        }
                                                    }
                                                    if(j == 0){
                                                        System.out.println("Nenhum projeto foi encontrando.");
                                                        break;
                                                    }
                                                break;    
                                            }
                                        break;
                                    }
                                    v = true;
                                }
                            }catch(Exception e){
                                 System.out.println("Entrada inválida");
                            }        
                }
                            }catch(Exception e){
                                
                            }
                        }
                    break;    
                }
        }   
    }
}
