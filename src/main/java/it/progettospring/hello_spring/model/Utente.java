package it.progettospring.hello_spring.model;

public class Utente {

    private String name;

    private String surname;

    private int age;

    private String email;

    private String personalCode;

    public Utente(String name, String surname, int age, String email, String personalCode) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.personalCode = personalCode;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    @Override
    public String toString() {
        return "Utente [name=" + name + ", surname=" + surname + ", age=" + age + ", email=" + email + ", personalCode="
                + personalCode + "]";
    }

}
