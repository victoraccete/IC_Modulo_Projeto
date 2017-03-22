    package com.company;
    import java.util.ArrayList;
    import java.util.Scanner;
    public class Main {
    
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
        
        
        
        public static void main(String[] args) {
            Project proj = new Project();
            Project temp = proj.criarNova();
            if (temp == null) System.out.println("PASSOU!");
            boolean v;
            int comando = 1;
            int comando2, j, i;
            String stringaux;
            Scanner ler = new Scanner(System.in);
            ArrayList<Project> projetos = new ArrayList<Project>();
            Project proaux = new Project();
            while (comando != 0) {
                System.out.println("Escolha a opção desejada\n1 - Adicionar um projeto, 2 - Informação de um projeto, 3 - Editar projeto, 0 - para sair desse menu");
                v = false;
                while (!v) {
                    try {
                        comando = ler.nextInt();
                        stringaux = ler.nextLine();
                        if (comando < 0 || comando > 3) { //aumentar o 2 de acordo com a quantidade de opções que forem colocando.
                            System.out.println("Entrada inválida, digite novamente.");
                        } else {
                            v = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Entrada inválida, digite novamente.");
                    }
                }
                switch (comando) {
                    case 1:     //adicionar projeto.
                        v = false;
                        while (!v) {
                            try {
                                System.out.println("Você selecionou adicionar um projeto.");
                                    proaux = new Project();
                                    proaux.projectEditionInfo();
                                    projetos.add(proaux);
                                 System.out.println("Adicionado com sucesso.");
                                // colocar o código.
                                v = true;
                            } catch (Exception e) {
                                System.out.println("Entrada inválida, tente novamente.");
                            }
                        }
                        break;
                    case 2:     //procura e informação sobre projeto.
                        v = false;
                        while (!v) {
                            try {
                                System.out.println("Você Selecionou procurar um projeto");
                                System.out.println("Você deseja procurar pelo:\n 1 - título\n 2 - linha de pesquisa\n 3 - situação");
                                comando2 = ler.nextInt();
                                stringaux = ler.nextLine();
                                if (comando2 <= 0 || comando2 > 3) {
                                    System.out.println("Comando foi inválido, digite 1 ou 2 ou 3.");
                                } else {
                                    switch (comando2) {
                                        case 1:
                                            proaux = buscarProjetoNome(projetos);
                                            if(proaux != null){
                                                proaux.informacoesDoProjeto();
                                            } 
                                            break;
                                        case 2:         ///problema de código repetido, não lembro como resolve.
                                            System.out.println("Digite a linha de pesquisa");
                                            stringaux = ler.nextLine();
                                            j = 0;
                                            for (i = 0; i < projetos.size(); i++) {
                                                proaux = projetos.get(i);
                                                if (stringaux.equals(proaux.getLinha())) {     // lembrar de criar esse método na classe project.
                                                    proaux.informacoesDoProjeto();
                                                    j = 1;
                                                }
                                            }
                                            if (j == 0) {
                                                System.out.println("Nenhum projeto foi encontrando.");
                                                break;
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Digite qual situação você deseja procurar.\n 1 - em elaboração\n 2 - em andamento\n 3 - Concluído");
                                            comando2 = ler.nextInt();
                                            stringaux = ler.nextLine();
                                            while (comando2 < 1 || comando2 > 3) {
                                                System.out.println("Digite de 1 a 3.");
                                                comando2 = ler.nextInt();
                                                stringaux = ler.nextLine();
                                            }
                                            switch (comando2) {
                                                case 1:
                                                    j = 0;
                                                    for (i = 0; i < projetos.size(); i++) {
                                                        proaux = projetos.get(i);
                                                        if (proaux.getSituacao() == 1) {     // lembrar de criar esse método na classe project.
                                                            proaux.informacoesDoProjeto();
                                                            j = 1;
                                                        }
                                                    }
                                                    if (j == 0) {
                                                        System.out.println("Nenhum projeto foi encontrando.");
                                                        break;
                                                    }
                                                    break;
                                                case 2:
                                                    j = 0;
                                                    for (i = 0; i < projetos.size(); i++) {
                                                        proaux = projetos.get(i);
                                                        if (proaux.getSituacao() == 2) {     // lembrar de criar esse método na classe project.
                                                            proaux.informacoesDoProjeto();
                                                            j = 1;
                                                        }
                                                    }
                                                    if (j == 0) {
                                                        System.out.println("Nenhum projeto foi encontrando.");
                                                        break;
                                                    }
                                                    break;
                                                case 3:
                                                    j = 0;
                                                    for (i = 0; i < projetos.size(); i++) {
                                                        proaux = projetos.get(i);
                                                        if (proaux.getSituacao() == 3) {     // lembrar de criar esse método na classe project.
                                                            proaux.informacoesDoProjeto();
                                                            j = 1;
                                                        }
                                                    }
                                                    if (j == 0) {
                                                        System.out.println("Nenhum projeto foi encontrando.");
                                                        break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    v = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Entrada inválida");
                            }
                        }
                        break;
                   /* case: 3 //Editando projeto já existente.
                        proaux = buscarProjetoNome(projetos);
                        if(proaux != null){
                        proaux.projectEditionInfo();
                    }
                    break;*/
                }
            }
        }
    }
