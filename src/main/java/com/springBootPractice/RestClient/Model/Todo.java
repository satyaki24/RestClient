package com.springBootPractice.RestClient.Model;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Todo implements Serializable {
    private Integer id;

    private Boolean completed;

    private String title;

    private Integer userId;
}

