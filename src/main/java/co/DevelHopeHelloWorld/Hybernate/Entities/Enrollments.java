package co.DevelHopeHelloWorld.Hybernate.Entities;

import jakarta.persistence.*;

@Table
@Entity
public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;
    @ManyToOne
    private SchoolClass schoolClass;

}
