<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: sethishi
  Date: 29/01/2016
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
    <style>
        .error {
            color:#ff0000;
        }
        .errorBlock {
            color: #000fff;
            background-color: antiquewhite;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>
<h1> ${userDetails} </h1>
<h1> </h1>
<form:form commandName="user">
    <form:errors path="*" cssClass="errorBlock" element="div"></form:errors>
    <table>
        <tr>
            <td><spring:message  code="user.name"/></td>
            <td><form:input path="name"/></td>
            <td><form:errors path="name" cssClass="error"/></td>

        </tr>
        <tr>
            <td><spring:message  code="user.email"/></td>
            <td><form:input path="email"/></td>
            <td><form:errors path="email" cssClass="error"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Enter Details"/>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
