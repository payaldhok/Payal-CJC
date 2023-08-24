package constructor;

public class MainCompanyManager {

	public static void main(String[] args) {
		Company company=new Company("payal","pune",100000,78654435566l);
		Company company1=new Company("snehal","nagpur",200000,78655736637l);
		Manager manager=new Manager(101,"payal","it",10000000,9876654435566l);
		Manager manager2=new Manager(102,"payal","it",400000,78654435566l);
          System.out.println(company.name+"  "+company.loacation+"   "+company.turnOver+"   "+company.mobNo);
          System.out.println(manager.id+"  "+manager.name+"   "   +manager.department+"   "+manager.mobNo);

}
}