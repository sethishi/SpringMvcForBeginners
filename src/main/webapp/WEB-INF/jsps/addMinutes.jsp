
<%@ page  contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html"; charset=ISO-8859-1>
    <title>Title</title>
</head>
<body>
<h1>
    Add Minutes Exercised
</h1>

    Language : <a href="?language=en">English</a> | <a href="?language=_es">Spanish</a>
<h2>    </h2>
<form:form commandName="exercise">
    <table>
        <tr>
            <td><spring:message  code="goal.text"/></td>
            <td><form:input path="minutes"/></td>

        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Enter Exercise"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
