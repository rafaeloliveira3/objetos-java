package com.mycompany.cadastro.livros;

import java.util.*;

public class CadastrarLivros {
    public static void main(String[] args){
        
        /* Declaração de Classes */
        
        Livro livro = new Livro();
        Scanner input = new Scanner(System.in);
        ArrayList<Livro> LivroDados = new ArrayList<>();
        
        /* Menu de Acesso */
        
        int counter = 4;
        while(counter != 0){
            System.out.println("Escolha uma opção, digite um dos n°s informados: \n1 - Cadastrar Livro \n2 - Exibir Dados do Livro \n3 - Editar Livro \n0 - Sair");
            counter = input.nextInt();
            System.out.println();
            
            switch(counter){
                case 0:
                    /* Saída do Programa*/
                    System.out.println("Obrigado por utilizar o Programa");
                    break;
          
                case 1:
                    /* Cadastro de Livros */
                    /* Entradas */
                    System.out.println("Qual o nome do Livro?: ");
                    livro.setTitulo(input.nextLine());
                    livro.setTitulo(input.nextLine());
                    
                    System.out.println("Qual é o autor do Livro?: ");
                    livro.setAutor(input.nextLine());
                    
                    System.out.println("Quantas páginas possuí o livro?: ");
                    livro.setPaginas(input.nextInt());
                    
                    System.out.println("Qual o código ISBN do livro?: ");
                    livro.setIsbn(input.nextLine());
                    livro.setIsbn(input.nextLine());
                    
                    System.out.println("Qual o valor do livro?: ");
                    livro.setValor(input.nextDouble());
                    
                    /* Saídas */
                    
                    System.out.println("\nLivro cadastrado com Sucesso!");
                    
                    System.out.println();
                    LivroDados.add(livro);
                    
                    break;
                 
                case 2:
                    /* Exibir dados dos livros cadastrados */
                    System.out.println("Qual Livro deseja exibir? Livros Disponíveis: " +LivroDados.size());
                    int i = input.nextInt();
                    
                    i -= 1;
                    
                    System.out.println("Nome do Livro: " +LivroDados.get(i).getTitulo());
                    System.out.println("Autor do Livro: " +LivroDados.get(i).getAutor());
                    System.out.println("O livro tem " +LivroDados.get(i).getPaginas() + " páginas");
                    System.out.println("Código ISBN: " +LivroDados.get(i).getIsbn());
                    System.out.println("Valor do Livro: " +LivroDados.get(i).getValor());
                    
                    System.out.println();
                    break;
                
                case 3:
                    /* Editar Livros */
                    
                    /* Verificando se existem livros disponíveis */
                    if(LivroDados.isEmpty()){
                        /* Caso não existam Livros disponíveis */
                        System.out.println("Não existem livros disponíveis para edição, voltando para a página inicial...");
                        System.out.println();
                        break;
                    }
                    else{
                        /* Caso existam Livros disponíveis */
                        System.out.println("Qual Livro deseja Editar? Livros Disponíveis: " +LivroDados.size());
                        i = input.nextInt();
                    
                        i -= 1;
                    
                        int bookCounter;
                        System.out.println("O que deseja editar? digite um dos n°s informados: \n1 - Nome do Livro \n2 - Autor do Livro \n3 - Quantidade de Páginas \n4 - ISBN \n5 - Valor do Livro \n0 - Voltar");
                        bookCounter = input.nextInt();
                    
                        System.out.println();
                        switch(bookCounter){
                            case 0:
                                /* Voltar para o inicio */
                                System.out.println("Retornando a Página Inicial");
                                System.out.println();
                                break;
                            case 1:
                                /* Editando o Nome do Livro */
                                System.out.println("Novo nome do Livro: ");
                                LivroDados.get(i).setTitulo(input.nextLine());
                                LivroDados.get(i).setTitulo(input.nextLine());
                                System.out.println();
                                break;
                            case 2:
                                /* Editando o Nome do autor do Livro */
                                System.out.println("Novo autor do Livro: ");
                                LivroDados.get(i).setAutor(input.nextLine());
                                LivroDados.get(i).setAutor(input.nextLine());
                                System.out.println();
                                break;
                            case 3:
                                /* Editando a quantidade de páginas do Livro */
                                System.out.println("Nova quantidade de páginas do Livro: ");
                                LivroDados.get(i).setPaginas(input.nextInt());
                                break;
                            case 4:
                                /* Editando o código ISBN do Livro */
                                System.out.println("Novo ISBN do Livro: ");
                                LivroDados.get(i).setIsbn(input.nextLine());
                                LivroDados.get(i).setIsbn(input.nextLine());
                                System.out.println();
                                break;
                            case 5:
                                /* Editando o Valor do Livro */
                                System.out.println("Novo valor do Livro: ");
                                LivroDados.get(i).setValor(input.nextDouble());
                                System.out.println();
                                break;
                            default:
                                /* Caso o usuário digite algo fora do pedido */
                                System.out.println("Opção Invalida");
                                System.out.println();
                            }
                        }
                    break;
                default:
                    /* Caso o usuário digite algo fora do pedido */
                    System.out.println("Opção Invalida");
                    break;
                
            }
        }
    }
}