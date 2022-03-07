package com.samplemicroserviceproject.radioservice.controllers;

import com.samplemicroserviceproject.radioservice.model.RadioSong;
import com.samplemicroserviceproject.radioservice.proxy.RadioSongProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RadioController {

    private RadioSongProxy proxy;

    public RadioController(RadioSongProxy proxy) {
        this.proxy = proxy;
    }

    @GetMapping("/radio/song/{name}")
    public RadioSong calculateCurrencyConversionFeign(
            @PathVariable String name
    ) {

        RadioSong song = proxy.retrieveExchangeValue(name);

        return new RadioSong(song.getTitle(), song.getAlbumTitle(), song.getAuthor(), "Radio baby");

    }
}
