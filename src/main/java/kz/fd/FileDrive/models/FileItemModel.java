package kz.fd.FileDrive.models;

import kz.fd.FileDrive.entities.FileItemEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class FileItemModel extends BaseModel {
    private String name;
    private Long parent;
    private boolean isFolder;
    private Long fileItemStatus;
    private Long linkFileItem;
    private Long fileStorage;
    private String filePath;
    private Long fileSize;
    private Date fileLastMod;
    private String fileCrc;
    private Long state;

    public FileItemModel() {
    }

    public static FileItemModel toModel(FileItemEntity entity) {
        FileItemModel model = new FileItemModel();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setParent(entity.getParent());
        model.setFolder(entity.isIsfolder());
        model.setFileItemStatus(entity.getFileitemstatus());
        model.setLinkFileItem(entity.getLinkfileitem());
        model.setFileStorage(entity.getFilestorage());
        model.setFilePath(entity.getFilepath());
        model.setFileSize(entity.getFilesize());
        model.setFileLastMod(entity.getFilelastmod());
        model.setFileCrc(entity.getFilecrc());
        model.setState(entity.getState());
        return model;

    }
}