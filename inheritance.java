class Dog{
    String name;
    int age;
    Dog(String n,int a){
        name=n;
        age=a;
        // or use this keyword
        //Dog(String name,int age){
        //this.name=name;
        //this.age=age;
    }
    void display(){
        System.out.println("dog name is " + name);
        System.out.println("dog age is " + age);
    }

}
class inheritance{
    public static void main(String[] args) {
     Dog obj=new Dog("tommy",5);
     System.out.println(obj.name + " " + obj.age);
    obj.display();  
         
      

     
    }
}