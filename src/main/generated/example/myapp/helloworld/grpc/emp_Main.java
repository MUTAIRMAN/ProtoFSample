package example.myapp.helloworld.grpc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import example.myapp.helloworld.grpc.employee.Builder;

public class emp_Main {

	static employee AddEmp(String a,String b) {

		employee.Builder emp=employee.newBuilder();
		emp.setId(a);
		emp.setName(b);
		
		
		
		return emp.build();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee.Builder emp=employee.newBuilder();
	
		System.out.println(emp_Main.AddEmp("1", "muthu"));
		
	}	

}
