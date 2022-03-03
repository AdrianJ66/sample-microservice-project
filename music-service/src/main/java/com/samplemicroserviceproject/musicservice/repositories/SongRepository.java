package com.samplemicroserviceproject.musicservice.repositories;

import com.samplemicroserviceproject.musicservice.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
