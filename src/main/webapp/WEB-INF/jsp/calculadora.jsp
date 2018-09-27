<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Calculadora</h1>
	<h2>O dia da semana em que voce nasceu</h2>

	<form:form id="frmCalc" action="" method="post" modelAttribute="calculadora">
		<div>
			<form:label path="diaNascimento"> Introduza o dia em que nasceu: </form:label>
			<form:input path="diaNascimento" />
		</div>
		<div>
			<form:label path="mesNascimento"> Introduza o mes em que nasceu:</form:label>
			<form:input path="mesNascimento"/>
		</div>
		<div>
			<form:label path="anoNascimento"> Introduza o ano em que nasceu: </form:label>
			<form:input path="anoNascimento"/>
		</div>
		
		<form:button>Calcular</form:button>
		</form:form>
		<%=(request.getAttribute("obj") != null) ? request.getAttribute("obj"):"" %>
</body>
</html>