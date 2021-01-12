<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page</title>
</head>
<body>
<script type="text/javascript">
setTimeout("redirect()", 5);
function redirect(){
    location.href=' <s:property value="val" />';
}
</script>
</body>
</html>