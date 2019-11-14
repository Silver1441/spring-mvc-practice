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
        <form:form action="registrationSuccess/proceed" method="get" >
            <p title="Registration completed successfully!">
                Registration success!
            </p>

            <div class="info_text">
                <center><h1>Account have been registered!</h1></center>
            </div>

            <div class="group">
                <center><button>proceed</button></center>
            </div>
        </form:form>
    </body>
</html>