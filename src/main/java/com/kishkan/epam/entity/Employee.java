package com.kishkan.epam.entity;

public class Employee {
    private int id;
    private String name;
    private String patronymic;
    private String surname;
    private String login;
    private int password;
    private String appointment;
    private String competenceGrade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public String getCompetenceGrade() {
        return competenceGrade;
    }

    public void setCompetenceGrade(String competenceGrade) {
        this.competenceGrade = competenceGrade;
    }
}
