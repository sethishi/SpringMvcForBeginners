
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Goal</title>
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

<form:form commandName="goal">
    <form:errors path="*" cssClass="errorBlock" element="div"></form:errors>
    <table>
        <tr>
            <td>Enter Minutes</td>
            <td><form:input path="minutes"/></td>
            <td><form:errors path="minutes" cssClass="error"/></td>
        </tr>
        <tr>
            <td colspan="4">
                <input type="submit" value="Enter Goal"/>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
