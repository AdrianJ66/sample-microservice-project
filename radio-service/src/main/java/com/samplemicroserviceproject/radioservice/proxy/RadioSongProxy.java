package com.samplemicroserviceproject.radioservice.proxy;

import com.samplemicroserviceproject.radioservice.model.RadioSong;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="music-service")
public interface RadioSongProxy {

    @GetMapping("/music/song/{name}")
    public RadioSong retrieveExchangeValue(
            @PathVariable String name);
}
