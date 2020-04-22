package com.syntax.class20;


public class Test  {
public static void main(String[] args) {
	

	Employee obj=new Employee();
obj.company="Apple";
obj.salary=2000;
obj.getPaid();
obj.work();
ScrumMaster obj1=new ScrumMaster();
obj1.ceremonies="Daily meeting";
obj1.attendMeethings();
ProductOwner obj2=new ProductOwner();
obj2.priorizeBacklog();
 ScrumMaster obj3=new ScrumMaster();
 obj3.navigateTeam();
 Developer obj4=new Developer();
 obj4.coding();
 Tester obj5=new Tester();
 obj5.test();
 BA obj6=new BA();
 obj6.workWithRequirements();
}
}
