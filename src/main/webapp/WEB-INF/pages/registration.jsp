<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Registration</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/registrationStyle.css">
  </head>

  <body>
    <form:form action="addEmployee" method="post" modelAttribute="Employee">
      <p title="Registration form">Registration</p>
      <div class="group">
        <label for="">Login*</label>
        <input type="text">
      </div>

      <div class="group">
        <label for="">Password*</label>
        <input type="password">
      </div>

      <div class="group">
        <label for="">Password Confirmation*</label>
        <input type="password">
      </div>

      <div class="group">
        <label for="">Name*</label>
        <input type="text">
      </div>

      <div class="group">
        <label for="">Patronymic</label>
        <input type="text">
      </div>

      <div class="group">
        <label for="">Surname*</label>
        <input type="text">
      </div>

      <div class="group">
        <center><button>Confirm</button></center>
      </div>
    </form>

  </body>
</html>
