package tasks.home;


class AnotherClass{
  void  name(){
    System.out.println("default");
  }
  protected void method (){
     System.out.println("protected");
  }
  public void method1 (){
     System.out.println("public");
  }
}

class Main {
public static void main (String [] args){
AnotherClass  obj=new AnotherClass();
obj.name();
obj.method();
obj.method1();

}
  
}