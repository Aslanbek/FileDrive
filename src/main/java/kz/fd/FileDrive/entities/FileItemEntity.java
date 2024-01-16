package kz.fd.FileDrive.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * this is comment for class
 */
@Entity
@Table(name = "fileitem")
@Getter
@Setter
@ToString
public class FileItemEntity extends BaseEntity {
    /**
     * def constructor
     */
    public FileItemEntity() {
    }

    @Column(name = "NAME")
    private String name;
    @Column(name = "PARENT")
    private Long parent;
    @Column(name = "ISFOLDER")
    private boolean isfolder;
    @Column(name = "FILEITEMSTATUS")
    private Long fileitemstatus;
    @Column(name = "LOCKUSER_ID")
    private Long lockuserId;
    @Column(name = "LINKFILEITEM")
    private Long linkfileitem;
    @Column(name = "FILESTORAGE")
    private Long filestorage;
    @Column(name = "FILEPATH")
    private String filepath;
    @Column(name = "FILESIZE")
    private Long filesize;
    @Column(name = "FILELASTMOD")
    private Date filelastmod;
    @Column(name = "USER_ID")
    private Long userId;
    @Column(name = "FILECRC")
    private String filecrc;
    @Column(name = "STATE")
    private Long state;

}