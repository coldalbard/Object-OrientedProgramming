package main.java.homework.homework5.task2.model;

public class Contact {
    private String name;
    private String surname;
    private String patronomyc;
    private String phone;
    private String description;

    public Contact(String name, String surname, String patronomyc, String phone, String description) {
        this.name = name;
        this.surname = surname;
        this.patronomyc = patronomyc;
        this.phone = phone;
        this.description = description;
    }

    public Contact() {
    }

    @Override
    public String toString() {
        return "name=\"" + name + '\"' +
                ", surname=\"" + surname + '\"' +
                ", patronomyc=\"" + patronomyc + '\"' +
                ", phone=\"" + phone + '\"' +
                ", description=\"" + description + '\"';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronomyc() {
        return patronomyc;
    }

    public String getPhone() {
        return phone;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronomyc(String patronomyc) {
        this.patronomyc = patronomyc;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void fullSet(String name, String surname, String patronomyc, String phone, String description){
        this.name = name;
        this.surname = surname;
        this.patronomyc = patronomyc;
        this.phone = phone;
        this.description = description;
    }
}
