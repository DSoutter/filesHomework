package com.codeclan.example.filesHomework.components;

import com.codeclan.example.filesHomework.models.File;
import com.codeclan.example.filesHomework.models.Folder;
import com.codeclan.example.filesHomework.models.User;
import com.codeclan.example.filesHomework.repository.FileRepository;
import com.codeclan.example.filesHomework.repository.FolderRepository;
import com.codeclan.example.filesHomework.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {}


    public void run(ApplicationArguments args) {
        User user1 = new User("Duncan");
        User user2 = new User("Gordon");
        userRepository.save(user1);
        userRepository.save(user2);

        Folder folder1 = new Folder("Finance", user1);
        Folder folder2 = new Folder("Work", user1);
        Folder folder3 = new Folder("Finance", user2);
        Folder folder4 = new Folder("Work", user2);
        folderRepository.save(folder1);
        folderRepository.save(folder2);
        folderRepository.save(folder3);
        folderRepository.save(folder4);

        File file1 = new File("Bank", "txt",10, folder1);
        File file2 = new File("Mortgage", "pdf",20, folder1);
        File file3 = new File("WFH", "txt",5,folder2);
        File file4 = new File("Office", "pdf",20, folder2);
        File file5 = new File("Bank", "txt",100, folder3);
        File file6 = new File("Mortgage", "pdf",200, folder3);
        File file7 = new File("WFH", "txt",50,folder4);
        File file8 = new File("Office", "pdf",200, folder4);
        fileRepository.save(file1);
        fileRepository.save(file2);
        fileRepository.save(file3);
        fileRepository.save(file4);
        fileRepository.save(file5);
        fileRepository.save(file6);
        fileRepository.save(file7);
        fileRepository.save(file8);
    }
}
