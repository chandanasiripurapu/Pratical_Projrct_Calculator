package accessmodifier;

public class AccessSpecifier2 {
	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		PrivateAccessSpecifier obj = new PrivateAccessSpecifier(); 
        //trying to access private method of another class 
        obj.display();

	}

}
