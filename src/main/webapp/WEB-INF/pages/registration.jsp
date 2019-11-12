<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Registration</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/WEB-INF/registrationStyle.css">
  </head>

  <body>
    <form:form action="registration" method="post" modelAttribute="registrationForm">
      <p title="Registration form">Registration</p>
      <div class="group">
        <label for="">Login*</label>
        <form:input path="login" />
        <form:errors path="login" cssClass="error" />
      </div>

      <div class="group">
        <label for="">Password*</label>
        <form:input path="password" />
        <form:errors path="password" cssClass="error" />
      </div>

      <div class="group">
        <label for="">Password Confirmation*</label>
        <form:input path="passwordConfirmation" />
        <form:errors path="passwordConfirmation" cssClass="error" />
      </div>

      <div class="group">
        <label for="">Name*</label>
        <form:input path="name" />
        <form:errors path="name" cssClass="error" />
      </div>

      <div class="group">
        <label for="">Patronymic</label>
        <form:input path="patronymic" />
        <form:errors path="patronymic" cssClass="error" />
      </div>

      <div class="group">
        <label for="">Surname*</label>
        <form:input path="surname" />
        <form:errors path="surname" cssClass="error" />
      </div>

      <div class="group">
              <label for="">Appointment*</label>
              <form:select path="appointment" items="${appointmentList}" />
      </div>

      <div class="group">
        <center><button>Confirm</button></center>
      </div>
    </form:form>

  </body>
</html>
