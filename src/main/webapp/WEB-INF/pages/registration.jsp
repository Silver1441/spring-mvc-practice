<!DOCTYPE html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/check-login-availability.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/check-password.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/registrationStyle.css">

    <title>Registration</title>
  </head>

  <body>
    <form:form action="registration" method="post" modelAttribute="registrationForm">
      <p title="Registration form">
        Registration
      </p>

      <div class="group">
        <label title="Login">Login*</label>
        <form:input path="login" id="check_login" title="Login" />
        <form:errors path="login" cssClass="error" />
        <div class="login_taken_error_message"> </div>
      </div>

      <div class="group">
        <label title="Password">Password*</label>
        <form:input path="password" id="check_password" type="password" title="Password" />
        <form:errors path="password" cssClass="error" />
        <div class="password_error_message"> </div>
      </div>

      <div class="group">
        <label title="Password">Password Confirmation*</label>
        <form:input path="passwordConfirmation" type="password" title="Password" />
        <form:errors path="passwordConfirmation" cssClass="error" />
      </div>

      <div class="group">
        <label title="Name">Name*</label>
        <form:input path="name" title="Name" />
        <form:errors path="name" cssClass="error" />
      </div>

      <div class="group">
        <label title="Patronymic">Patronymic</label>
        <form:input path="patronymic" title="Patronymic" />
        <form:errors path="patronymic" cssClass="error" />
      </div>

      <div class="group">
        <label title="Surname">Surname*</label>
        <form:input path="surname" title="Surname" />
        <form:errors path="surname" cssClass="error" />
      </div>

      <div class="group">
              <label title="Appointment">Appointment*</label>
              <form:select path="appointment" cssClass="select_tab">
                <form:options items="${appointmentList}" cssClass="select_options" />
              </form:select>
      </div>

      <div class="group">
        <center><button>Confirm</button></center>
      </div>
    </form:form>

  </body>
</html>
