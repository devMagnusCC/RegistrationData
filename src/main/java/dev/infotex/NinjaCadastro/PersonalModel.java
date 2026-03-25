package dev.infotex.NinjaCadastro;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_PERSONAL_DATABASE")
public class PersonalModel {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String email;
    int age;

    public PersonalModel(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public PersonalModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
