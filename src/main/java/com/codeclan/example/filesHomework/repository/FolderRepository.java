package com.codeclan.example.filesHomework.repository;

import com.codeclan.example.filesHomework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
