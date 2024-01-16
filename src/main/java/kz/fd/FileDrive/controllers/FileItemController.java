package kz.fd.FileDrive.controllers;

import kz.fd.FileDrive.services.impl.FileItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fileitems")
public class FileItemController {
    @Autowired
    private FileItemServiceImpl fileItemService;

    public FileItemController() {
    }

    @GetMapping
    public ResponseEntity getAll() {
        try {
            return ResponseEntity.ok(fileItemService.getAll());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
