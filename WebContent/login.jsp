<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
 <s:form action="login">
 <h1>ID</h1>
 	<s:textfield name="id" errorPosition="false" />
 <h2>pass</h2>
 	 <s:password name="pass" errorPosition="false" />
 	 <s:submit value="送信"></s:submit>

 </s:form>
</body>
</html>