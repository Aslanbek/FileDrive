package kz.fd.FileDrive.repo;

import kz.fd.FileDrive.entities.FileItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface FileItemRepo extends CrudRepository<FileItemEntity, Long> {
    Iterable<FileItemEntity> findAll();
}
