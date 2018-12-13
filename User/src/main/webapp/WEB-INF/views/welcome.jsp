<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<meta charset="ISO-8859-1">
<link href="<c:url value='/css/style.css'/>" rel="stylesheet"
	type="text/css" /> 
<title>Congratulations</title>
</head>
<body>
	<h1>YOU MADE IT!</h1>

<form:form action="${pageContext.request.contextPath}/login/new.html"
		method="POST" ModelAttribute="user">
Username: <input type ="text" name="UserID"> <br/>
Password: <input type ="text" name="Password"> <br/>

<input type="submit" value ="Submit"/> <br/><br/>
    <input type="reset" value ="Cancel"/> <br/>

</form:form>



</body>
</html>