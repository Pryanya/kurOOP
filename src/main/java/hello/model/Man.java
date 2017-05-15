package hello.model;
import javax.persistence.*;
/**
 * Created by Надежда on 11.05.2017.
 */
    @Entity
    @Table(name="Man")

    public class Man {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Integer id;

    @Column(name="N_man")
    private int N_man;
    private String name;
    private String surname;
    private String patronymic;
    private String gender;
    private String city;
    private Integer age;


    public Integer getId() {
        return id;

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getN_man() {
        return N_man;
    }

    public void setN_man(int N_man) {
        this.N_man = N_man;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAge() {
        return age;

    }

    public void setAge(Integer age) {
        this.age = age;
    }

}

