package com.kishkan.epam.entity;

public class Employee {
    /**ID is data-based generated*/
    private int id;
    private String name;
    private String patronymic;
    private String surname;
    private String login;
    private String password;
    private String appointment;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    /**Builder:*/
    public static class Builder {
        private Employee employee;

        public Builder() {
            employee = new Employee();
        }

        public Builder name(String name) {
            employee.setName(name);
            return this;
        }

        public Builder patronymic(String patronymic) {
            employee.setPatronymic(patronymic);
            return this;
        }

        public Builder surname(String surname) {
            employee.setSurname(surname);
            return this;
        }

        public Builder login(String login) {
            employee.setLogin(login);
            return this;
        }

        public Builder password(String password) {
            employee.setPassword(password);
            return this;
        }

        public Builder appointment(String appointment) {
            employee.setAppointment(appointment);
            return this;
        }

        public Employee build(){
            return employee;
        }
    }
}
