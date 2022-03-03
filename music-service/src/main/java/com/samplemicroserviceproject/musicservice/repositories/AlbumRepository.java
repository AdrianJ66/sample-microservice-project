package com.samplemicroserviceproject.musicservice.repositories;

import com.samplemicroserviceproject.musicservice.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
