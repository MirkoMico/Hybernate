package co.DevelHopeHelloWorld.Hybernate.Entities;

import jakarta.persistence.*;
import jdk.jfr.Threshold;

@Table
@Entity
public class SchoolClass {
         @Id
         @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
         @Column(nullable = false)
        private String title;
         @Column(nullable = false)
        private String description;

    public SchoolClass() {
    }

    public SchoolClass(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


