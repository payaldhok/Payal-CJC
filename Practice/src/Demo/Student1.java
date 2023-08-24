package Demo;

public class Student1 {

		 public void display(){
			 
		 }
	    	public static void main(String args[]){  
	    		//Student.change(); //-----------------1st location
	   		    Student1 s1 = new Student1(111,"Karan");  
			s1.display();  
			//Student.change();//-----------------2nd location
	    		Student1 s2 = new Student1(222,"Aryan"); 
			s2.display();   
	    		Student1 s3 = new Student1(333,"Sonoo"); 
	    		s3.display();  
	    	}  
	}

	

