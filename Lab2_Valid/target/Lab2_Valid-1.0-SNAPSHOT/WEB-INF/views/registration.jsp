<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

<h1>Registration Form</h1><br />

    <form:form modelAttribute="student" action="registration" method="post">
        <div style="border: 1px solid black">
            <form:errors path="*" cssStyle="color: red;"></form:errors>
        </div>

        <p>
            <label>Id: </label>
            <form:input path="id"></form:input>
            <p><form:errors path="id" cssStyle="color: red;"></form:errors></p>
        </p>

        <p>
            <label>First Name: </label>
            <form:input path="firstName"></form:input>
            <p><form:errors path="firstName" cssStyle="color: red;"></form:errors></p>
        </p>

        <p>
            <label>Last Name: </label>
            <form:input path="lastName"></form:input>
            <p><form:errors path="lastName" cssStyle="color: red;"></form:errors></p>
        </p>

        <p>
            <label>Email: </label>
            <form:input path="email"></form:input>
            <p><form:errors path="email" cssStyle="color: red;"></form:errors></p>
        </p>

        <p>
            <label>Birthday: </label>
            <form:input path="birthday"></form:input>
            <p><form:errors path="birthday" cssStyle="color: red;"></form:errors></p>
        </p>

        <p>
            <label>Phone: </label>
            <form:input path="phone.area" size="3"></form:input>-
            <form:input path="phone.prefix" size="3"></form:input>-
            <form:input path="phone.number" size="4"></form:input>

            <p><form:errors path="phone" cssStyle="color: red;"></form:errors></p>
        </p>

        <p>
            <input id="reset" type="reset" value="Reset">
            <input id="submit" type="submit" value="Add Student">
        </p>
    </form:form>
    
    
    
    
    
    

</body>
</html>