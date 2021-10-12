package com.codeclan.example.filesHomework.repository;

import com.codeclan.example.filesHomework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
