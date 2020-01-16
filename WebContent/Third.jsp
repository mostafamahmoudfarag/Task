<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
     <%@ page import="com.mostafa.dao.Connect,com.mostafa.model.thirdlink,java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<table border="1" width=400>
<caption>number of employees in each departement</caption>
<tr>
<th>deptid</th>
<th>deptname</th>
<th>count</th>
</tr>
<%
Connect conn=new Connect();
List<thirdlink> l=conn.get_numberOfemployee_alldepartement();
for(int i=0;i<l.size();i++)
{
	out.println("<tr>");
	out.println("<td>");
	out.println(l.get(i).getDeptid());
	out.println("</td>");
	out.println("<td>");
	out.println(l.get(i).getName());
	out.println("</td>");
	out.println("<td>");
	out.println(l.get(i).getCount());
	out.println("</td>");
	out.println("</tr>");
}


%>
 </table>

</body>
</html>