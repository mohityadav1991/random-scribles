package com.example.demo.pojo;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String instructorName;

    @OneToMany(mappedBy = "primaryKey.student",
            cascade = CascadeType.ALL)
    private Set<StudentCourse> studentCourses;
}
