//simple print statement of hello world
/*class pratice{
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}*/
//simple program using method
/*class box{
    public static void main(String args[]){
        box1 ob = new box1();
        ob.height=10;
        ob.width=20;
        ob.depth=30;
        ob.volume();

    }
}
class box1{
    double height;
    double width;
    double depth;
    void volume(){
        System.out.println("volume: "+height*width*depth);
    }
}*/

// class A{
//     void display( String S){
//         System.out.println("class " + S + " method is been called");
//     }
// }
// class pratice{
//     public static void main (String[] args) {
//         A ob = new A();
//         ob.display("A");
//     }
// }

// class A{
//     private String Name;

//     void display(String name){
//         this.Name = name;
//         System.out.println("My name is : " + this.Name);
//     }
// }
// class pratice{
//     public static void main(String[] args) {
//         A ob = new A();
//         ob.display("Tejasai");
//     }
// }

// class A{
//     static int i = 20;
//     void display(){
//         System.out.println(A.i);
//     }
// }

// class pratice{
//     public static void main(String[] args) {
//         A ob = new A();
//         ob.display();
//     }
// }

// class A{
//     double a;
//     double b;
//     double c;
//     A(double i,double j,double k){
//         a = i;
//         b = j;
//         c = k;
//         System.out.println("The sum of three number are: ");
//     }
//     double display(){
//         return a+b+c;
//     }
// }
// class pratice{
//     public static void main(String[] args) {
//         A ob = new A(10,20,10);
//         double v = ob.display();
//         System.out.println("Sum : "+ v);
//     }
// }

// class A{
//     double a;
//     double b;
//     double c;
//     A(){
//         a = 10;
//         b = 20;
//         c = 30;
//     }
//     double display(){
//         return a+b+c;
//     }
// }
// class pratice{
//     public static void main(String[] args) {
//         A ob = new A();
//         double v = ob.display();
//         System.out.println("Sum : "+ v);
//     }
// }

// class pratice{
    
//     public static void main(String[] args) {
//         String S = "tejasai";
//         int I = 18;
//         char c = 'A';
//         boolean b = true;
//         double d = 12.0;
//         System.out.println("String : "+ S );
//         System.out.println("Int : "+ I );
//         System.out.println("Char : "+ c );
//         System.out.println("Boolean : "+ b );
//         System.out.println("double : "+ d );
//     }
// }

// class pratice{
//     public static void main(String[] args) {
//         int i = 10;
//         int j = 11;
//         if(i<j){
//             System.out.println("i is lesser then j");
//         }
//         else if(i>j){
//             System.out.println("i is greater then j");
//         }
//         else {
//             System.out.println("both i and j are the same");
//         }
//     }
// }


// import java.util.Scanner;
// class pratice{
//     public static void main(String[] args) {
//         Scanner ob = new Scanner(System.in);

//         System.out.println("enter the number between 1-3: ");
//         int i = ob.nextInt();
//         ob.close();

//         switch (i) {
//             case 1:
//                 System.out.println("u have written number one(1)");
//                 break;
//             case 2:
//                 System.out.println("u have written number two(2)");
//                 break;
//             case 3:
//                 System.out.println("u have written number three(3)");
//                 break;
//             default:
//             System.out.println("pick the number between only 1-3");
//                 break;
//         }
//     }
// }

// public class pratice {
//     public static void main(String[] args) {
//         Integer i = 10;
//         int j = i;
//         System.out.println("boxing : " + i + "\n" + "unboxing : " + j);
//     }
// }

// class pratice{
//     public static void main(String[] args) {
//         for(int i=1 ; i <= 5 ; i++){
//             System.out.println(i);
//         }
//     }
// }

// class pratice{
//     public static void main(String[] args) {
//         int i = 0;
//         while (i <= 5) {
//             i ++;
//             System.out.println(i);
//         }
//     }
// }

// class pratice{
//     public static void main(String[] args) {
//         int i = 0;
//         do{
//             i ++;
//             System.out.println(i);
//         }while(i <= 5);
//     }
// }

// class pratice{
//     public static void main(String[] args) {
//         String s = "xyz";
//         s = null;
//         System.gc();
//         System.out.println("garbage collector");
//     }
//     protected void finalize(){
//         System.out.println("finalize() method is called");
//     }
// }

// class a{
//     private String Name;

//     public void setname(String name){
//         this.Name = name;
//     }

//     public String getName(){
//         return this.Name;
//     }
// }

// class pratice{
//     public static void main(String[] args) {
//         a ob = new a();
//         ob.setname("xzy");
//         System.out.println("Your name : " + ob.getName());
//     }
// }

// class pratice{
//     public static void main(String[] args) {
//         for(int i = 0 ; i <= 5 ; i++){
//             if(i==3){
//                 continue;
//             }
//         System.out.println(i);
//         }
//     }
// }

// class clacluater{
//     public static int add (int x, int y){
//         return x+y;
//     }
//     public static int sub (int x, int y){
//         return x-y;
//     }
//     public static int mult (int x, int y){
//         return x*y;
//     }
//     public static int div (int x, int y){
//         return x/y;
//     }
// }
// class result{
//     public static void print(int value){
//         System.out.println("the value is: " + value);
//     }
// }

// class pratice{
//     public static void main(String[] args) {
//         int a = clacluater.add(10, 10);
//         result.print(a);
//         int b = clacluater.sub(10, 10);
//         result.print(b);
//         int c = clacluater.mult(10, 10);
//         result.print(c);
//         int d = clacluater.div(10, 10);
//         result.print(d);
//     }
// }

// class pratice{
//     public static void main(String[] args) {
//         int [] arr = {10,20,30};
//         for( int num : arr){
//             System.out.println(num);
//         }
//     }
// }

// class pratice{
//     public static void main(String[] args) {
//         String S = "Tejasai";
//         String B = " S";
//         System.out.println("Checking if empty : "+ S.isEmpty());
//         System.out.println("Changing to uppercase : "+ S.toUpperCase());
//         System.out.println("Changing to lowercase : "+ S.toLowerCase());
//         System.out.println("Ignore case : "+ S.equalsIgnoreCase(B));
//         System.out.println("Add both string : "+ S.concat(B));
//     }
// }

// class  A{
//     private String Nmae;
//     A(String name){
//         this.Nmae = name;
//     }
//     void display(){
//         System.out.println("Name : "+this.Nmae);
//     }
// }

// class pratice{
//     public static void main(String[] args) {
//         A ob[] = {new A("xyz"),new A("abc"),new A("efg")};
//         for( A name : ob){
//             name.display();
//         }
//     }
// }

// class pratice{
//     public static void main(String[] args) {
//         StringBuffer S = new StringBuffer("oriented language");
//         System.out.println("original string : "+ S);
//         System.out.println("length : "+ S.length());
//         System.out.println("capacity : "+ S.capacity());
//         String T = "object ";
//         S.insert(0, T);
//         System.out.println("modified String : "+ S);
//     }
// }

// class A{
//     void show(){
//         System.out.println("show area");
//     }
// }
// class B extends A{
//     void show(int r){
//         System.out.println(3.14*r*r);
//     }
// }
// class pratice{
//     public static void main(String[] args) {
//         B ob = new B();
//         ob.show(5);
//     }
// }

// class a{
//     void print(){
//         System.out.println("A class is called");
//     }
// }
// class b extends a{
//     void print(){
//         System.out.println("B class is called");
//     }
// }
// class c extends b{
//     void print(){
//         System.out.println("C class is called");
//     }
// }

// class pratice{
//     public static void main(String[] args) {
//         b ob = new b();
//         ob.print();
//     }
// }

// class a{
//     void print(){
//         System.out.println("A class is called");
//     }
// }
// class b extends a{
//     void print(){
//         System.out.println("B class is called");
//     }
// }
// class c extends a{
//     void print(){
//         System.out.println("C class is called");
//     }
// }

// class pratice{
//     public static void main(String[] args) {
//         c ob = new c();
//         ob.print();
//     }
// }

// abstract class shape{
//     abstract void draw();
// }

// class circle extends shape{
//     void draw(){
//         System.out.println("Drawing circle");
//     }
// }

// class pratice{
//     public static void main(String[] args) {
//         shape ob = new circle();
//         ob.draw();
//     }
// }

// class a{
//     void show(int i){
//         System.out.println(i);
//     }
//     void show(String s){
//         System.out.println(s);
//     }
// }

// class pratice{
//     public static void main(String[] args) {
//         a ob = new a();
//         ob.show(9);
//         ob.show("xyz");
//     }
// }

// class a{
//     void show(){
//         System.out.println("class a");
//     }
// }
// class b extends a{
//     void show(){
//         System.out.println("class b");
//     }
// }

// class pratice{
//     public static void main(String[] args) {
//         a ob = new a();
//         ob.show();
//     }
// }

// abstract class a{
//     abstract void sound();
// }
// class dog extends a{
//     void sound(){
//         System.out.println("dog barks");
//     }
// }

// class pratice{
//     public static void main(String[] args) {
//         dog ob = new dog();
//         ob.sound();
//     }
// }

// interface a{
//     public void sound();
// }

// class dog implements a{
//     public void sound(){
//         System.out.println("dog barks");
//     }
// }

// class pratice{
//     public static void main(String[] args) {
//         dog ob = new dog();
//         ob.sound();
//     }
// }

enum level{
    low,mid,high
}
class pratice{
    public static void main(String[] args) {
        level ob = level.low;
        System.out.println(ob); 
    }
}