
package com.mycompany.cadastro.livros;

public class Livro {
    
    /* Declaração dos Atributos */
    
    private String titulo;
    private String autor;
    private int paginas;
    private String isbn;
    private double valor;
    
    /* Métodos Get and Set */
    
    /* Titulo */
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    /* Autor */
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    /* Páginas */
    public int getPaginas(){
        return paginas;
    }
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }
    
    /* ISBN */
    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    
    /* Valor */
    public Double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
}
