package com.samplemicroserviceproject.musicservice.services;

import com.samplemicroserviceproject.musicservice.model.Album;
import com.samplemicroserviceproject.musicservice.model.Song;
import com.samplemicroserviceproject.musicservice.repositories.AlbumRepository;
import com.samplemicroserviceproject.musicservice.repositories.SongRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MusicService {

    private final SongRepository songRepository;

    private final AlbumRepository albumRepository;

    public MusicService(SongRepository songRepository, AlbumRepository albumRepository) {
        this.songRepository = songRepository;
        this.albumRepository = albumRepository;
    }

    public Song getSong(Long id) {
        return songRepository.getById(id);
    }

    public Song getSongInfoByTitle(String song) {
        Song foundSong = songRepository.findByTitle(song);
        return foundSong != null ?
                foundSong :
                new Song(1L, "Your song could be here", new Album(2L, "Your shower hits", "You"));
    }

    public Album getAlbumForSong(Long songId) {
        Song song = songRepository.getById(songId);
        return song.getAlbum();
    }

    public Album getAlbum(Long id) {
        return albumRepository.getById(id);
    }
}
