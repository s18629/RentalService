package com.example.RentalService.Model;



public class MovieModel {

    private Integer id;
    private String genre;
    private String name;
    private Boolean isAvailable;

    public MovieModel(){
    }

    public Integer getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    
}
