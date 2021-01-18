<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メイン画面</title>
</head>
<body>
 <s:form action="whatYouSee">
<h1> こんにちは, <s:property value="id" /> 現在時刻:<s:property value="date" /></h1>
<s:radio list="#{0:'youtube', 1:'niconico'}" name="val" value="0"></s:radio>
<s:submit value="見る"></s:submit>
 </s:form>
</body>
</html>