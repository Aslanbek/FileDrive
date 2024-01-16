package kz.fd.FileDrive.services;

import kz.fd.FileDrive.entities.FileItemEntity;
import kz.fd.FileDrive.models.FileItemModel;

import java.util.ArrayList;

public interface FileItemService {

    Iterable<FileItemEntity> getAll() throws Exception;

    ArrayList<FileItemModel> getAllm() throws Exception;
}
