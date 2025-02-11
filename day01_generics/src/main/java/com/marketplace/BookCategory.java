package com.marketplace;

// Class representing the Book category
public class BookCategory {
    private String genre;

    public BookCategory(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "BookCategory{genre='" + genre + "'}";
    }
}
