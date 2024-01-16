package kz.fd.FileDrive.models;

import kz.fd.FileDrive.entities.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BaseModel {
    private Long id;

    public BaseModel() {
    }

    public static BaseModel toModel(BaseEntity entity) {
        BaseModel model = new BaseModel();
        model.setId(entity.getId());
        return model;
    }
}
