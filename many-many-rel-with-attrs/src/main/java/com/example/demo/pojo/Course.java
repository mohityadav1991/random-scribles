package com.example.demo.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Course {

    @Id
    @GeneratedValue
    private Long id;

    private String courseName;
    private String instructorName;

    @OneToMany(mappedBy = "primaryKey.course",
            cascade = CascadeType.ALL)
    private Set<StudentCourse> studentList;
}
