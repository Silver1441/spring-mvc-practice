package com.kishkan.epam.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegisteredUserDto {
    private static final String REG_NAME_ERROR = "name must be defined";
    private static final String REG_SURNAME_ERROR = "surname must be defined";
    private static final String REG_LOGIN_ERROR = "fill the login field";
    private static final String REG_PASSWORD_ERROR = "password's length must be between 6 and 30 characters";
    private static final String REG_APPOINTMENT_ERROR = "appointment must be selected";

    @NotBlank(message = REG_NAME_ERROR)
    private String name;

    private String patronymic;

    @NotBlank(message = REG_SURNAME_ERROR)
    private String surname;

    @NotBlank(message = REG_LOGIN_ERROR)
    private String login;

    @Size(min = 6, max = 30, message = REG_PASSWORD_ERROR)
    private String password;

    private String passwordConfirmation;

    @NotBlank(message = REG_APPOINTMENT_ERROR)
    private String appointment;

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

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(String passwordConfirmation) {
        this.passwordConfirmation = passwordConfirmation;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }
}
