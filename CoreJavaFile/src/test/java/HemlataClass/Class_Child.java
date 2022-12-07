package HemlataClass;

public class Class_Child extends Class_parents {
	
	 public Class_Child(String a, String b) {
	        super(a, b);
	        this.a=a;
	        
	    }



	   public void Name() {
	        System.out.println("the name is "+this.a);
	        System.out.println("the name is "+super.b);
	    }
	    public static void main(String[] args) {
	    	Class_Child b1=new Class_Child("sagar", "Bilaa");
	        b1.Name();
	       //b1.display("mayank", "ballu");
	       
	        
//	        Class_parents a1=new Class_parents("Mayank", "Ballu");
	        
	        
	    }    
}		
