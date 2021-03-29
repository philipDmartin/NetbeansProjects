/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phili
 */
public class Book {
    
    private String author;
    private String title;
    private int pages;
    
    public Book(String author, String name, int pages) {
        this.author = author;
        this.title = name;
        this.pages = pages;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getName() {
        return title;
    }
    
    public int getPages() {
        return pages;
    }
    
    public String toString() {
         return this.author + ", " + this.title
            + ", " + this.pages + " pages";
    }
}
