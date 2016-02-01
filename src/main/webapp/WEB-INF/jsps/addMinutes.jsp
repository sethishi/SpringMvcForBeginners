
<%@ page  contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html"; charset=ISO-8859-1>
    <title>Title</title>

    <script type="text/javascript" src="jquery-1.12.0.js"> </script>
    <script type="text/javascript">




        $(document).ready(
                function(){
                    $.getJSON("http://localhost:8080/activities.json",
                    function(data){
                        var html = '<option value=""> --- Please select one --- </option>';
                        var len = data.length;
                        for(var i=0;i<len ; i++){
                            html += '<option value"' + data[i] + '">'
                                + data[i] + '</option>';
                        }
                        html += '</option>';

                        $('#activities'.html(html))
                    });
                });


    </script>
</head>
<body>
<h1>
    Add Minutes Exercised
</h1>

    Language : <a href="?language=en">English</a> | <a href="?language=_es">Spanish</a>

<form:form commandName="exercise">
    <table>
        <tr>
            <td>Current Locale : ${pageContext.response.locale}</td>
        </tr>
        <tr>
            <td><spring:message  code="goal.text"/></td>
            <td><form:input path="minutes"/></td>
            <td><form:select id="activities" path="activity"> </form:select> </td>

        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="Enter Exercise"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
<h2>Our Goal is set to : ${goal.minutes}</h2>
</html>
