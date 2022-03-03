package com.samplemicroserviceproject.musicservice.services;

import com.samplemicroserviceproject.musicservice.model.Album;
import com.samplemicroserviceproject.musicservice.model.Song;
import com.samplemicroserviceproject.musicservice.repositories.AlbumRepository;
import com.samplemicroserviceproject.musicservice.repositories.SongRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public Album getAlbumForSong(Long songId) {
        Song song = songRepository.getById(songId);
        return song.getAlbum();
    }

    public Album getAlbum(Long id) {
        return albumRepository.getById(id);
    }
}
