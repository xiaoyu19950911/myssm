<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table align='center' border='1' cellspacing='0'>
		    
		<tr>
			        
			<td>id</td>         
			<td>姓名</td> 
			<td>性别</td>  
			<td>年龄</td>  
			<td>电话</td>  
			<td>住址</td>      
		</tr>
		    
		<c:forEach items="${list}" var="c" varStatus="st">
        <tr>
				            
				<td>${c.id}</td>             
				<td>${c.name}</td>
				<td>${c.sex}</td>
				<td>${c.age}</td>
				<td>${c.tel}</td>
				<td>${c.adr}</td>                         
			</tr>
    </c:forEach>
	</table>
</body>
</html>