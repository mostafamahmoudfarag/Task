package com.mostafa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mostafa.model.firstlink;
import com.mostafa.model.secondlink;
import com.mostafa.model.thirdlink;

public class Connect {

	Connection conn=null;
	public Connect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123456");
				
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		
	}

	
	public List<firstlink> getdapertements_that_have_employees() throws SQLException {
		
		List<firstlink> list=new ArrayList<>();
		PreparedStatement stmt=conn.prepareStatement("select dept.id,dept.name,count(emp.deptid) as 'number of employee' "
				+ " from dept  inner join emp on dept.id=emp.deptid\r\n" + 
				"group by emp.deptid\r\n" +"");
		ResultSet r=stmt.executeQuery();
		while(r.next())
		{
          list.add(new firstlink(r.getInt(1),r.getString(2),r.getInt(3)));
		}
		return list;
	}
	public List<secondlink> getalldetails() throws SQLException{
		List<secondlink> list=new ArrayList<>();
		PreparedStatement stmt=conn.prepareStatement("select emp.id,emp.name,dept.name as 'departement name'\r\n" + 
				"from emp,dept\r\n" + 
				" where emp.deptid=dept.id");
		ResultSet r=stmt.executeQuery();
		while(r.next())
		{
          list.add(new secondlink(r.getInt(1),r.getString(2),r.getString(3)));
		}
		return list;
		
	}
	
public List<thirdlink> get_numberOfemployee_alldepartement() throws SQLException {
		
		List<thirdlink> list=new ArrayList<>();
		PreparedStatement stmt=conn.prepareStatement("select dept.id,dept.name,count(emp.deptid) as 'number of employee'  from dept  left join emp on dept.id=emp.deptid\r\n" + 
				"group by emp.deptid");
		ResultSet r=stmt.executeQuery();
		while(r.next())
		{
          list.add(new thirdlink(r.getInt(1),r.getString(2),r.getInt(3)));
		}
		return list;
	}
	
}
