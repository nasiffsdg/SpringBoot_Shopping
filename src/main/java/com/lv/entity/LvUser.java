package com.lv.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (LvUser)实体类
 *
 * @author makejava
 * @since 2022-06-12 00:46:32
 */
@AllArgsConstructor
@NoArgsConstructor
public class LvUser implements Serializable {
    private static final long serialVersionUID = -53049478138248057L;

    private Integer id;

    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

