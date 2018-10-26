<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Request Form</title>
</head>
<body>
<form:form action="storeraiserequest.do" modelAttribute="requestObj" method="POST">
<%-- Employee Id:<form:input path="requestId"/> --%>
Asset Name :<form:input path="assetName"/>
Quantity   :<form:input path="quantity"/>
Status     :<form:input path="status"/>
Open Date  :<form:input path="openDate"/>
Close Date :<form:input path="closeDate"/>
<input type="submit" value="Request"/>
</form:form>
</body>
</html>
