package co.DevelHopeHelloWorld.Hybernate.Entities;
import jakarta.persistence.*;
import jakarta.persistence.*;
@Entity
@Table
public class Student {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        @Column(nullable = false)
        private String lastName;
        @Column(nullable = false)
        private String firstName;
        @Column(unique = true,nullable = false)
        private String email;

        public Student() {
        }

        public Student(long id, String lastName, String firstName, String email) {
            this.id = id;
            this.lastName = lastName;
            this.firstName = firstName;
            this.email = email;
        }

        public long getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
