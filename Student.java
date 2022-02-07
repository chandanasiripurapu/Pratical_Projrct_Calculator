
public class Student {
    //class level variables
	    int eid;
	    String ename;
	    String edept;
	    
	    
	    //default constructor
	    public Student()
	    {
	    	eid=20;
	    	ename="chandana";
	    	edept="cse";
	    }
	    public Student(int eid,String ename,String edept)
	    {
	        this.eid=eid;
	        this.ename=ename;
	        this.edept=edept;
	    }
	    
	    public static void main(String[] args) {
	        
	        //when you create object automatically it calls default constructor
	        //if no default constructor then compiler will create that
	        Student obj=new Student();
	        System.out.println("User 1");
	        System.out.println("Id: "+obj.eid);
	        System.out.println("Name: "+obj.ename);
	        System.out.println("Dept: "+obj.edept);
	        
	        
	        Student obj2= new Student(31,"hemanth","civil");
	        System.out.println("User 2");
	        System.out.println("Id: "+obj2.eid);
	        System.out.println("Name: "+obj2.ename);
	        System.out.println("Dept: "+obj2.edept);
	        
	    }
}
