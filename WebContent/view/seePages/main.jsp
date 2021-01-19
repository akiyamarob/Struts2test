<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メイン画面</title>
</head>
<s:actionerror />
<body>
 <s:form action="whatYouSee">
<h1> こんにちは, <s:property value="id" /> 現在時刻:<s:property value="date" /></h1>
<div><s:radio list="#{0:'youtube', 1:'niconico',2:'その他(URL入力)'}" name="val"  ></s:radio>
<s:textfield name="url" errorPosition="false" disabled="true"/>
<s:submit value="見る"></s:submit></div>
 </s:form>
 <script type="text/javascript">
 function getElm (name){
	 elm = document.getElementsByName(name)[2]
	 return elm
 }
 function acv(){
	 if(getElm("val").value == "2"){
		 document.getElementsByName("url")[0].disabled = false
	 }
 }
 getElm("val").addEventListener("click",acv)

 </script>
</body>
</html>