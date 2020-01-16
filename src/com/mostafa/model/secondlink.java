package com.mostafa.model;

public class secondlink {
int id;
String name;
String departement_name;
@Override
public String toString() {
	return "Second [id=" + id + ", name=" + name + ", departement_name=" + departement_name + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartement_name() {
	return departement_name;
}
public secondlink(int id, String name, String departement_name) {
	super();
	this.id = id;
	this.name = name;
	this.departement_name = departement_name;
}
public void setDepartement_name(String departement_name) {
	this.departement_name = departement_name;
}

}
