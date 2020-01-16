<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
 <%@ page import="com.mostafa.dao.Connect,com.mostafa.model.firstlink,java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="400"> 
<caption>all departement that have employees</caption>
<tr>
<th>deptid</th>
<th>deptname</th>
<th>count</th>
</tr>
<%
Connect conn=new Connect();
List<firstlink> l=conn.getdapertements_that_have_employees();
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