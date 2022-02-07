package pratice;

import java.util.Scanner;

public class ValidationOfEmailId {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int flag=0;
		 String s;
		 String a[]= {"siripurapu@gmail.com","chandana@gmail.com","chandu@gmail.com","hemanth@gmail.com"};
		 System.out.println("enter the email id: ");
		 s=sc.nextLine();
		 for(int i=0;i<4;i++)
		 {
			 if(s.equals(a[i]))
			 {
				 System.out.println("email is validated");
				 break;
			 }
			 else {
				 flag=1;
			 }
			 if(flag==1)
				 System.out.println("email is not validated");
			 
			 
		 }
		 
		 
		 
		 }
		
	}
