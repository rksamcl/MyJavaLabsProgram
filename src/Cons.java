class Student{
int sid;
String sname;
long phone;
  Student(){
    System.out.println("Student default constructor");
  }
  Student(int id,String sn){
   System.out.println("Student 2-Arg constructor");
   sid=id;
   sname=sn;
  }
  Student(int id,String sn,long ph){
    System.out.println("Student 3-Arg constructor");
  sid=id;
  sname=sn;
  phone=ph;
}
void show(){
System.out.println(sid+"\t"+sname+"\t"+phone);
}
}

class Cons{
public static void main(String args[]){
Student st=new Student();
Student st1=new Student(12,"Raj");
st1.show();
Student st2=new Student(15,"Anup",8147676075L);
st2.show();
}
}