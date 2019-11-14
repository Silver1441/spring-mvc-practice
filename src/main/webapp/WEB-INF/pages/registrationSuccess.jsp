<!DOCTYPE html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/registrationStyle.css">

        <title>Registration Success</title>
    </head>
    <body>
        <form:form action="proceed" method="get" >
            <p title="Registration success">
                Registration success!
            </p>

            <div class="info_text">
                <h1>Account have been registered!</h1>
            </div>

            <div class="group">
                <center><button>log in</button></center>
            </div>
        </form:form>
    </body>
</html>