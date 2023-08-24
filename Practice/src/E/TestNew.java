package E;
import A.*;
import B.*;
import c.*;
import D.*;

public class TestNew extends Employee {

	public static void main(String[] args) {
		Data data=new Data();
		System.out.println("student id"+data.getId() );
		System.out.println("student name"+data.getName());
		System.out.println("student location"+data.getLocation());
		
		
	}

}
