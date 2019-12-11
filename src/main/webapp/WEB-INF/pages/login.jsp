<!DOCTYPE html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/HandleBack.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/registrationStyle.css">

    <title>Sign up</title>
  </head>

  <body onbeforeunload="HandleBackFunctionality()">
    <form action="login/process" method="post">
      <p title="Login form">Sign up</p>
      <div class="group">
        <label for="">Login</label>
        <input name="login" />
      </div>

      <div class="group">
        <label for="">Password</label>
        <input name="password" type="password" />
        <div class="error">${error_login_placeholder}</div>
      </div>


      <div class="group">
        <center><button>Confirm</button></center>
      </div>
    </form>

    <form action="registration" method="get">
      <div>
        <center><button class="reg_button">registration</button></center>
      </div>
    </form>

  </body>
</html>
