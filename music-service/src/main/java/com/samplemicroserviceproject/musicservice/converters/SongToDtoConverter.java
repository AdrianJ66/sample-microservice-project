package com.samplemicroserviceproject.musicservice.converters;

import com.samplemicroserviceproject.musicservice.dto.MusicDto;
import com.samplemicroserviceproject.musicservice.model.Album;
import com.samplemicroserviceproject.musicservice.model.Song;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Component
public class SongToDtoConverter implements Converter<Song, MusicDto> {

    @Override
    public MusicDto convert(Song song) {
        return MusicDto.Builder.aBuilder()
                .withTitle(song.getTitle())
                .withAuthor(getAuthorForSong(song))
                .withAlbumTitle(getAlbumTitleForSong(song))
                .build();
    }

    private String getAlbumTitleForSong(Song song) {
        Album album = song.getAlbum();
        return album != null ? album.getTitle() : null;
    }

    private String getAuthorForSong(Song song) {
        Album album = song.getAlbum();
        return album != null ? album.getAuthor() : null;
    }
}
