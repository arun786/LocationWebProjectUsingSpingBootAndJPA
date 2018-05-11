package com.arun.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Adwiti on 5/10/2018.
 */
@Getter
@Setter
@ToString
@Entity
public class Location {

    @Id
    private int id;
    private String code;
    private String name;
    private String type;
}
