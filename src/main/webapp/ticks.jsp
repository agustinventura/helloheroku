<%@ page import="es.aguasnegras.helloheroku.*"%>
<html>
	<%
		TickDAO tickDAO = new TickDAO();
		tickDAO.insertTick();
	%>
	<%=tickDAO.getTickCount()%> Ticks
</html>

