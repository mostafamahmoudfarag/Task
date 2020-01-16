package com.mostafa.model;

public class thirdlink {
	private int deptid;
	private String  name;
	private int count;
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public thirdlink(int deptid, String name, int count) {
		super();
		this.deptid = deptid;
		this.name = name;
		this.count = count;
	}
	@Override
	public String toString() {
		return "firstlink [deptid=" + deptid + ", name=" + name + ", count=" + count + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
