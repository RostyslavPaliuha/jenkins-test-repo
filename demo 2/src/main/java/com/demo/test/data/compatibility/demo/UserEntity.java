package com.demo.test.data.compatibility.demo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
@Data
@Document(collection = "user")
public class UserEntity {

    @MongoId
    private String id;

    private String name;

}
