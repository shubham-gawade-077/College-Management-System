package com.braindatawire.collegemanagement.servicelmpl;

import java.util.*;

import com.braindatawire.collegemanagement.model.Batch;
import com.braindatawire.collegemanagement.model.Course;
import com.braindatawire.collegemanagement.model.Faculty;
import com.braindatawire.collegemanagement.model.Student;
import com.braindatawire.collegemanagement.service.Cjc;

public class Karvenagar implements Cjc {
	Scanner sc =new Scanner(System.in);
List<Course> clist =new ArrayList<>();
@Override
public void addCourse() {
	Course c = new Course();
	// TODO Auto-generated method stub
	System.out.println("enter the course id");
	c.setCid(sc.nextInt());
	System.out.println("enter the course name");
	c.setCname(sc.next());
	clist.add(c);
	
}
@Override
public void viewCourse() {
	// TODO Auto-generated method stub
	Iterator<Course> itr= clist.iterator();
	while(itr.hasNext())
	{
		Course co =itr.next();
		System.out.println(co.getCid());
		System.out.println(co.getCname());
	}
}
List<Faculty> flist=new ArrayList<>();

@Override
public void addFaculty() {
	// TODO Auto-generated method stub
	Faculty f=new Faculty ();
	System.out.println("enter the id");
	f.setFid(sc.nextInt());
	System.out.println("enter the course name");
	f.setFname(sc.next());
	Course c = null;
	f.setCourse(c);
	
	flist.add(f);
}
@Override
public void viewFaculty() {
	// TODO Auto-generated method stub
	Iterator<Faculty> itr= flist.iterator();
	while(itr.hasNext())
	{
		Faculty fa =itr.next();
		System.out.println(fa.getFid());
		System.out.println(fa.getFname());
		System.out.println(fa.getCourse());
	}
}
List<Batch> blist=new ArrayList<>();
@Override
public void addBatch() {
	// TODO Auto-generated method stub
	Batch b =new Batch();
	System.out.println("enter the id");
	b.setBname(sc.next());
	System.out.println("enter the name");
    b.setBname(sc.next());
    Faculty f = null;
	b.setFaculty(f);

}
@Override
public void viewBatch() {
	// TODO Auto-generated method stub
	Iterator<Batch> itr= blist.iterator();
	while(itr.hasNext())
	{
		Batch ba =itr.next();
		System.out.println(ba.getBid());
		System.out.println(ba.getBname());
		System.out.println(ba.getFaculty());
	}
}
List<Student> slist =new ArrayList<>();
@Override
public void addStudent() {
	// TODO Auto-generated method stub
	Student s =new Student();
	System.out.println("enter the id");
	s.setSid(sc.nextInt());
	System.out.println("enter the name");
	s.setSname(sc.next());
	Batch b = null;
	s.setBatch(b);
}
@Override
public void viewStudent() {
	// TODO Auto-generated method stub
	Iterator<Student> itr= slist.iterator();
	while(itr.hasNext())
	{
		Student st =itr.next();
		System.out.println(st.getSid());
		System.out.println(st.getSname());
		System.out.println(st.getBatch());
	}
	
}


}
