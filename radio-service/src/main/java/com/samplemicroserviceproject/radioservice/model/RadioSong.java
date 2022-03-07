package com.samplemicroserviceproject.radioservice.model;

public class RadioSong {
    private String title;
    private String albumTitle;
    private String author;
    private String description;

    public RadioSong() {
    }

    public RadioSong(String title, String albumTitle, String author, String description) {
        this.title = title;
        this.albumTitle = albumTitle;
        this.author = author;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
