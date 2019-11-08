<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Registration</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/registrationStyle.css">
  </head>

  <body>
    <form:form action="registration" method="post" modelAttribute="employeeForm">
      <p title="Registration form">Registration</p>
      <div class="group">
        <label for="">Login*</label>
        <form:input path="login" />
      </div>

      <div class="group">
        <label for="">Password*</label>
        <form:input path="password" />
      </div>

      <div class="group">
        <label for="">Password Confirmation*</label>
        <input type="password">
      </div>

      <div class="group">
        <label for="">Name*</label>
        <form:input path="name" />
      </div>

      <div class="group">
        <label for="">Patronymic</label>
        <form:input path="patronymic" />
      </div>

      <div class="group">
        <label for="">Surname*</label>
        <form:input path="surname" />
      </div>

      <div class="group">
        <center><button>Confirm</button></center>
      </div>
    </form:form>

  </body>
</html>
