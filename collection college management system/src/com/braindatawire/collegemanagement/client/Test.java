package com.braindatawire.collegemanagement.client;

import java.util.Scanner;

import com.braindatawire.collegemanagement.servicelmpl.Karvenagar;

public class Test {
public static void main(String[] args) {
	int ch;
	Karvenagar k=new Karvenagar();
	Scanner sc =new Scanner(System.in);
	do {
	System.out.println("....select option....\n"+"1. Add course\n"
	+"2. view course\n"+"3. Add faculty\n"+"4. view faculty\n"+"5. Add batch\n"
	+"6. view batch\n"+"7. Add student\n "+"8. view student");
  ch=sc.nextInt();
	switch(ch)
	{
	case 1:
		k.addCourse();
		break;
	case 2:
		k.viewCourse();
		break;
	case 3:
		k.addFaculty();
		break;
	case 4:
		k.viewFaculty();
		break;
	case 5:
		k.addBatch();
		break;
	case 6:
		k.viewBatch();
		break;
	case 7:
		k.addStudent();
		break;
	case 8:
		k.viewStudent();
		break;
	case 0:
		System.exit(0);
		default:
			System.out.println("invalid choice");
	}}
	while(ch!=0);
	
}
	
}
