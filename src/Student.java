public class Student {
    int id;
    String name;
    int a;
    int b;
    int c;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    Student(){

    }
    Student(int a , int b){
        this.a = a;
        this.b = b;
    }
    Student(int a , int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void sum2(){
        System.out.println(a+b+c);
    }

    void sum(){
        System.out.println(a+b);
    }

   /* Student(int a, String b){
        id = a;
        name = b;
    }*/
    void print(){
        System.out.println(id);
        System.out.println(name);
    }
    void s(){
        System.out.println("hello  world");
    }
}
