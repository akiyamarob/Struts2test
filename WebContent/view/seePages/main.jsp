<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メイン画面</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

</head>
<body>
 <s:form action="whatYouSee">
<h1> こんにちは, <s:property value="id" /> 現在時刻:<s:property value="date" /></h1>
<s:actionerror />
<div><s:radio list="#{0:'youtube', 1:'niconico',2:'その他(URL入力)'}" name="val"  ></s:radio>
<s:textfield name="url" errorPosition="false" disabled="true"/>
<s:submit value="見る" cssClass="btn btn-primary"></s:submit></div>

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
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</body>
</html>