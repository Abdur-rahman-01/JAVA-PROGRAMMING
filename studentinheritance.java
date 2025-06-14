class Person {
    String name;
    int age;
Person(String name,int age){
    this.name=name;
    this.age=age;
}
void displayperson(){
    System.out.println("name is " + name);
    System.out.println("age is " + age);
}
}
class Student extends Person{
    int sid;
    String course;
    Student(String name,int age,int sid,String course) // constructor of child class
    

{
 super(name,age); // calling parent class constructor 
 this.sid=sid;
 this.course=course;   
 }
 void displaystudent(){
      
     System.out.println("student id is " + sid);
     System.out.println("course is " + course);
    }
}
class studentinheritance{
    public static void main(String[] args) {
        Student obj=new Student("john",20,101,"java");
        System.out.println(obj.name + " " + obj.age + " " + obj.sid + " " + obj.course);
        obj.displaystudent();
    }
}

 