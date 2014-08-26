package com.patterns.DAOPattern;

public class Developer {
    private String favoriteLanguage;
    private int id;
    private String name;

    public Developer(String favoriteLanguage, int id, String name) {
        this.favoriteLanguage = favoriteLanguage;
        this.id = id;
        this.name = name;
    }

    public String getFavoriteLanguage() {

        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
