<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
   <%@ page import="com.mostafa.dao.Connect,com.mostafa.model.secondlink,java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="400"> 
<caption>employee detail</caption>
<tr>
<th>id</th>
<th>emptname</th>
<th>dept</th>
</tr>
<%
Connect conn=new Connect();
List<secondlink> l=conn.getalldetails();

for(int i=0;i<l.size();i++)
{
	out.println("<tr>");
	out.println("<td>");
	out.println(l.get(i).getId());
	out.println("</td>");
	out.println("<td>");
	out.println(l.get(i).getName());
	out.println("</td>");
	out.println("<td>");
	out.println(l.get(i).getDepartement_name());
	out.println("</td>");
	out.println("</tr>");
}


%>
 </table>

</body>
</html>