package ru.usatu.students.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.Objects;

@Entity
@Table(name="students")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

    @Id
    @Column(name ="id")
    @XmlElement(name="id")
    private int id;
    @Column(name ="name")
    @XmlElement(name="name")
    private String name;

    public Student() {}

    public Student (int id, String name) {
        this.id=id;
        this.name=name;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id=id; }
    public String getName() {return name;}
    public void setName(String name) {this.name=name;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {return Objects.hash(id);}

}
