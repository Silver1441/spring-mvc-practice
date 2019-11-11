<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Sign up</title>
  </head>

  <body>
    <form action="login/process" method="post">
      <p title="Login form">Sign up</p>
      <div class="group">
        <label for="">Login</label>
        <input name="login" />
      </div>

      <div class="group">
        <label for="">Password</label>
        <input name="password" type="password" />
      </div>


      <div class="group">
        <center><button>Confirm</button></center>
      </div>
    </form>

  </body>
</html>
