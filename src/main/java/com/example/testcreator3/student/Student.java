package com.example.testcreator3.student;

import javax.persistence.*;

@Entity
@NamedQueries(
        @NamedQuery(name = "Student.update", query = "UPDATE Student s set " +
                "s.firstName = ?1, s.lastName =?2, s.email = ?3 where s.ID_Student = ?4")
)
@Table(name = "tblSTUDENT")
public class Student {
    private Long ID_Student;
    private String firstName;
    private String lastName;
    private String email;

    public Student() {
    }

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public void setID_Student(Long id_student) {
        this.ID_Student = id_student;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getID_Student() {
        return ID_Student;
    }

    @Column (name = "firstname")
    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column (name = "lastname")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column (name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
