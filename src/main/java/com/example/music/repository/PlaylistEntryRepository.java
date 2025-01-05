package com.example.music.repository;

import com.example.music.entity.PlaylistEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlaylistEntryRepository extends JpaRepository<PlaylistEntry, UUID> {
}
