package com.PAT.PAT.Model;

import javax.persistence.*;

/**
 * Created by expert on 1/2/19.
 */
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column

    String name;



}
