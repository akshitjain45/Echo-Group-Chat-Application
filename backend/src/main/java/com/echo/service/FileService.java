package com.echo.service;

import com.echo.entity.FileEntity;
import com.echo.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileService {

    @Autowired
    private FileRepository fileRepository;

    public FileEntity save(FileEntity f) {
        return fileRepository.save(f);
    }

    public FileEntity findByFkMessageId(int id) {
        return fileRepository.findByMessageId(id);
    }

    public String findFileUrlByMessageId(int id) {
        return  fileRepository.findFileUrlByMessageId(id);
    }
}
