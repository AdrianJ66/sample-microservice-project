package com.samplemicroserviceproject.musicservice.controllers;

import com.samplemicroserviceproject.musicservice.converters.SongToDtoConverter;
import com.samplemicroserviceproject.musicservice.dto.MusicDto;
import com.samplemicroserviceproject.musicservice.model.Song;
import com.samplemicroserviceproject.musicservice.services.MusicService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicController {

    private final MusicService musicService;

    private final SongToDtoConverter songToDtoConverter;

    public MusicController(MusicService musicService, SongToDtoConverter songToDtoConverter) {
        this.musicService = musicService;
        this.songToDtoConverter = songToDtoConverter;
    }

    @GetMapping("/music-service/song/{id}")
    public MusicDto getSongInfo(@PathVariable Long id) {
        Song song = musicService.getSong(id);
        return songToDtoConverter.convert(song);
    }
}
