
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Goal</title>
</head>
<body>

<form:form commandName="goal">
    <table>
        <tr>
            <td>Enter Minutes</td>
            <td><form:input path="minutes"/></td>
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
