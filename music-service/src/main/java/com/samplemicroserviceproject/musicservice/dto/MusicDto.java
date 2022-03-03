package com.samplemicroserviceproject.musicservice.dto;

import lombok.Data;

@Data
public class MusicDto {

    private String title;

    private String albumTitle;

    private String author;


    public static final class Builder {
        private String title;
        private String albumTitle;
        private String author;

        private Builder() {
        }

        public static Builder aBuilder() {
            return new Builder();
        }

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder withAlbumTitle(String albumTitle) {
            this.albumTitle = albumTitle;
            return this;
        }

        public Builder withAuthor(String author) {
            this.author = author;
            return this;
        }

        public MusicDto build() {
            MusicDto musicDto = new MusicDto();
            musicDto.setTitle(title);
            musicDto.setAlbumTitle(albumTitle);
            musicDto.setAuthor(author);
            return musicDto;
        }
    }
}
