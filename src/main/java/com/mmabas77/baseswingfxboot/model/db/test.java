package com.mmabas77.baseswingfxboot.model.db;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class test {
    @Id
    int id;
}
