package kz.fd.FileDrive.services.impl;

import kz.fd.FileDrive.entities.FileItemEntity;
import kz.fd.FileDrive.models.FileItemModel;
import kz.fd.FileDrive.repo.FileItemRepo;
import kz.fd.FileDrive.services.FileItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FileItemServiceImpl implements FileItemService {
    @Autowired
    private FileItemRepo fileItemRepo;

    public FileItemServiceImpl() {

    }

    @Override
    public Iterable<FileItemEntity> getAll() throws Exception {
        return fileItemRepo.findAll();
    }

    @Override
    public ArrayList<FileItemModel> getAllm() throws Exception {
        Iterable<FileItemEntity> fileItemEntities = fileItemRepo.findAll();
        ArrayList<FileItemModel> list = new ArrayList<>();
        for (FileItemEntity entity : fileItemEntities)
            list.add(FileItemModel.toModel(entity));
        return list;
    }
}
