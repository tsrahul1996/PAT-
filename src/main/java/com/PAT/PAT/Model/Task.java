package com.PAT.PAT.Model;

import javax.persistence.*;

/**
 * Created by expert on 3/2/19.
 */
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="Task_id")
    private int id;

    @Column
    String name;

}
