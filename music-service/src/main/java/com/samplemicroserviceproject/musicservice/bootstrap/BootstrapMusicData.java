package com.samplemicroserviceproject.musicservice.bootstrap;

import com.samplemicroserviceproject.musicservice.model.Album;
import com.samplemicroserviceproject.musicservice.model.Song;
import com.samplemicroserviceproject.musicservice.repositories.AlbumRepository;
import com.samplemicroserviceproject.musicservice.repositories.SongRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Component
public class BootstrapMusicData implements ApplicationListener<ContextRefreshedEvent> {

    private final SongRepository songRepository;

    private final AlbumRepository albumRepository;

    public BootstrapMusicData(SongRepository songRepository, AlbumRepository albumRepository) {
        this.songRepository = songRepository;
        this.albumRepository = albumRepository;
    }

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        log.debug("Loading bootstrap data started");
        loadMusic();
        log.debug("Loading bootstrap data finished");
    }

    private void loadMusic() {
        Album album1 = new Album();
        Album album2 = new Album();

        album1.setAuthor("Mick Jagger");
        album1.setTitle("Blue Album");

        album2.setAuthor("John Lennon");
        album2.setTitle("Black Album");

        albumRepository.save(album1);
        albumRepository.save(album2);

        Song song1 = new Song();
        Song song2 = new Song();
        Song song3 = new Song();

        song1.setTitle("Short Song");
        song1.setAlbum(album1);

        song2.setTitle("Medium Song");
        song2.setAlbum(album2);

        song3.setTitle("Long Song");
        song3.setAlbum(album2);

        songRepository.save(song1);
        songRepository.save(song2);
        songRepository.save(song3);
    }

}
