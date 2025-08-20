package tap;

// import java.util.Scanner;
// public class tap {
//    public static int count(int n){
//          int count = 0;
//         while(n>0){
//             n=n/10;
//             count++;
//         }
//         return count;
//    }
//    int amst = 0;
//    int last = 0;
//    void amstrong(int n){
//        int remp =n;
//        int count =count(n);
//     while(n>0){
//             last=n%10;
//             amst = amst + (int)Math.pow(last,count);
//             n=n/10;
//         }
//         if(amst==remp){
//                System.out.println("Amstrong number");
//            }
//            else{
//                System.out.println("Not amstrong number");
//            }
// }  
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         tap a = new tap();
//         a.amstrong(n);
       
//     }
// }
// import java.util.Scanner;
// public class tap {

//     public static void main(String[] args) {
        
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the Number:");
//    int n = sc.nextInt();
//    int [] arr = new int [n];
//    for(int i = 0;i<arr.length;i++){
//     arr[i]=sc.nextInt();
//    }
//    for(int i = 0;i<arr.length;i++){
//     System.out.println(arr[i]);
//    }
//     }
// }

// import java.util.Scanner;

// public class tap{
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Number");
//         int n = sc.nextInt();
//         int [] a = new int[n];
//         int sum = 0;
//         for(int i =0;i<a.length;i++){
//             sum = a[i]+n;
//             System.out.println(sum);
//         }
//     }
// }



// import java.util.Scanner;
// public class tap{
//     int count(int n){
//         int count = 0;
//         for(int i = 0;i<n;i++){
//             count++;
//         }
//         return count;
//     }

 





//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int [] arr= new int [n];
//         for(int i = 0;i<arr.length;i++){
//             arr[i]= sc.nextInt();
//         }
//        tap a =  new tap();
//        a.count(n);

//     }
// }

// import java.util.Scanner;
// public class Main {
//     static void occrlar(int [] arr){
//         int max =Integer.MIN_VALUE;
//         int count = 0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max  = arr[i];
//                 count =1;
//             }
//             else if(arr[i]==max) {
//                 count++;
//             }
//         }
//     System.out.println(count);
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int N = sc.nextInt();
// int [] arr = new int[N];
// // implement your logic hereint[] arr= new int[N];
//     for(int i=0;i<arr.length;i++){  
//         arr[i] = sc.nextInt();
//     }
//     occrlar(arr);
//     }
// }

// import java.util.Scanner;
// public class Main {
//     static int occrlar(int [] arr){
//         int max =Integer.MIN_VALUE;
//         int min =Integer.MAX_VALUE;
//         int sum = 0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 min =max ;
//                 max  = arr[i];
//             }
//             else if(arr[i]>min) {
//                 min = arr[i];
//             }
//             sum = min+max;
//         }
//     return sum;
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int N = sc.nextInt();
// int [] arr = new int[N];
// // implement your logic hereint[] arr= new int[N];
//     for(int i=0;i<arr.length;i++){  
//         arr[i] = sc.nextInt();
//     }
//    int res = occrlar(arr);
//    System.out.println(res);
//     }
// }

// class Animal{
// 	void bread(){
// 		System.out.println("The Breade of Animal");
// 	}
// 	void eat() {
// 		System.out.println("It can Eat");
// 	}
// 	void sleep() {
// 		System.out.println("It can sleep");
// 	}
// }
// class Lion extends Animal {
// 	@Override
// 	void eat() {
// 		System.out.println("It eats animals");
// 	}
// 	void huntingType() {
// 		System.out.println("It Hunts");
// 	}
	
// }
// class Horse extends Animal {
// 	@Override
// 	void eat() {
// 		System.out.println("It eats Grass");
// 	}
// 	void huntingType() {
// 		System.out.println("It Never Hunts");
// 	}
// }
// class Monkey extends Animal {
// 	@Override
// 	void eat() {
// 		System.out.println("It eats Fruits and Vegitables");
// 	}
// 	void huntingType() {
// 		System.out.println("It Never Hunts");
// 	}
// }


// public class Main{
// 	public static void main(String[] args) {
// 		Lion l= new Lion();
// 		Horse h= new Horse();
// 		Monkey m= new Monkey();
		
// 		l.bread();
// 		l.eat();
// 		l.sleep();
// 		l.huntingType();
// 		System.out.println("------------------------------------------------------");
// 		h.bread();
// 		h.eat();
// 		h.sleep();
// 		h.huntingType();
		
// 		System.out.println("------------------------------------------------------");
// 		m.bread();
// 		m.eat();
// 		m.sleep();
// 		m.huntingType();
// 	}
// }


// ------------------------------------Associator--------------------------------

// class Brain{
// 	private float weight;
// 	private float BPM;
	
// 	Brain(float weight, float BPM ){
// 		this.weight = weight;
// 		this.BPM = BPM;
// 	}
// 	public float getWeight() {
// 		return weight;
// 	}
// 	public float getBPM() {
// 		return BPM;
// 	}
// }

// class Heart{
// 	private float weight;
// 	private String colour;
	
// 	public Heart(float weight, String colour) {
// 		this.weight = weight;
// 		this.colour = colour;
// 	}
	
// 	public float getWeight() {
// 		return weight;
// 	}
// 	public String getColour() {
// 		return colour;
// 	}
// }

// class Bike{
// 	private String Brand;
// 	private float Mileage;
// 	public Bike(String Brand, float Mileage) {
// 		this.Brand = Brand;
// 		this.Mileage = Mileage;
// 	}
// 	public String getBrand() {
// 		return Brand;
// 	}
// 	public float getMileage() {
// 		return Mileage;
// 	}	
// }

// class Book{
// 	private String Name;
// 	private String Author;
// 	public Book(String Name, String Author) {
// 		super();
// 		this.Name = Name;
// 		this.Author = Author;
// 	}
	
// 	public String getName() {
// 		return Name;
// 	}
// 	public String getAuthor() {
// 		return Author;
// 	}
// }


// class Human{
// 	Brain b= new Brain(1.4f,72);
// 	Heart ha = new Heart(0.5f,"Red");
	
// 	public void bike(Bike b){
// 		System.out.println(b.getBrand());
// 		System.out.println(b.getMileage());
// 	}
	
// 	public void book(Book bo) {
// 		System.out.println(bo.getName());
// 		System.out.println(bo.getAuthor());
// 	}
// }

// public class Main{
// 	public static void main(String[] args) {
// 		Human h = new Human ();
// 		Bike b = new Bike("GT",10.5f);
// 		Book bo = new Book("Java","James Gosling");
// 		System.out.println(h.b.getWeight());
// 		System.out.println(h.b.getBPM());
// 		System.out.println(h.ha.getWeight());
// 		System.out.println(h.ha.getColour());
		
// 		h.bike(b);
// 		h.book(bo);
// 		h=null;
// 		System.out.println(h.b.getWeight());
// 		System.out.println(h.b.getBPM());
// 		System.out.println(h.ha.getWeight());
// 		System.out.println(h.ha.getColour());
		
// 		System.out.println(b.getMileage());

// 	}
// }


// class Calculator{
// 	void add() {
// 		System.out.println(1);
// 	}
// 	void add(int a,int b) {
// 		System.out.println(a+b);
// 	}
// 	void add(int a,double b) {
// 		System.out.println(a+b);
// 	}
// 	void add(double a,double b) {
// 		System.out.println(a+b);
// 	}
// 	void add(int a,int b , int c) {
// 		System.out.println(a+b);
// 	}
// }


// public class Main{
// 	public static void main(String[] args) {
// 		Calculator calc = new Calculator();
// 		calc.add();
// 		calc.add(1,2);
// 		calc.add(1,2.2);
// 		calc.add(4.6,2.2);
// 		calc.add(6,2,4);
// 	}
// }


// public class Main{
// 	public static void main(String[] args) {
// 		System.out.println(1);
// 		main(1, 5);
// 		main(1.6, 7);
// 	}
// 	public static void main(int a,int b) {
// 		System.out.println(2);
// 	}
// 	public static void main(double a, int b) {
// 		System.out.println(3);
// 	}
// }

// public class Main{
// 	public static void main(String []  args){
// 		String s = "RajaRamMohanRoy";
// 		System.out.println(s.substring(7));
// 		System.out.println(s.substring(0,3));
// 	}
// }


// class Calculator{
// 	void add(int a,byte b){
// 		System.out.println("int byte");
// 	}
// 	void add(int a,char b){
// 		System.out.println("int char");
// 	}
// }

// public class Main{
// 	public static void main(String [] args){
// 		Calculator calc = new Calculator();
// 		calc.add('a','b');
// 	}
// }

// ------------------------------------ambigious error ------------------------------------------------
// class Calculator{
// 	void add(char a,int b){
// 		System.out.println("char int");
// 	}
// 	void add(int a,char b){
// 		System.out.println("int char");
// 	}
// }

// public class Main{
// 	public static void main(String [] args){
// 		Calculator calc = new Calculator();
// 		calc.add('a','b');
// 	}
// }


//class Demo{
//// 	public void add (){
//// 		int a = 1;
//// 		int b = 5;
//// 		System.out.println(a+b);
//// 	}
//// }
//
//	// public void sub (int n){
//		
//	// }
//	public int mul(){
//		int  a = 5;
//		int b = 5;
//		return a*b;
//	}
//
//
//}
//
//
//public class Main{
//	public static void main(String[] args) {
//		Demo a= new Demo();
//		System.out.println(a.mul());
//	}
//}

// import java.util.Scanner;

// public class Main{
// 	public static void main(String[] args) {
// 		Scanner sc = null;
// 		try {
// 			sc= new Scanner(System.in);
// 			System.out.println("Enter the number 1st");
// 			int n = sc.nextInt();
// 			System.out.println("Enter the number 2nd");
// 			int m = sc.nextInt();
// 			System.out.println("Enter the total");
// 			int a = n/m;
// 			System.out.println(a);
// 		}

// 		catch (ArithmeticException a){
// 			System.out.println("ArithmeticException is affected");
// 		}
// 		catch(Exception e) {
// 			System.out.println("give valid divisor");
// 		}
// 		sc.close();
// 	}
// }

// public class Main{
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the number 1st");
// 		int n = sc.nextInt();
// 		System.out.println("Enter the number 2nd");
// 		int m = sc.nextInt();
// 		System.out.println("Enter th total");
// 		int a = n/m;
// 		System.out.println(a);
// 		sc.close();
// 	}
// }


// public class Main{
// 	public static void main(String[] args) {
// 		disp();
// 	}

// 	void disp(){
// 		disp();
// 	}
// }

// ------------------------------Multi-threading using extends in inheritance------------------------------------

// import java.util.Scanner;
// class Adding extends Thread{
// 	@Override
// 	public void run() {
// 		System.out.println("Addition process is starting");
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the first number:");
// 		int a = sc.nextInt();
// 		System.out.println("Enter the Second number:");
// 		int b = sc.nextInt();
// 		int c = a+b;
// 		System.out.println(c);
// 		System.out.println("Addition process is Completed");
// 	}
// }

// class PrintChar extends Thread{
// 	@Override
// 	public void run() {
// 		System.out.println("printing character process is starting");
// 		for(int i = 65 ; i < 70 ; i++) {
// 			System.out.println((char)(i));
// 			try {
// 				Thread.sleep(2000);
// 			} catch (Exception e) {}
// 		}
// 		System.out.println("printing character process is Completed");
		
// 	}
// }

// class PrintNum extends Thread{
// 	@Override
// 	public void run() {
// 		System.out.println("printing number process is Started");
// 		for(int i = 1 ; i < 6 ; i++) {
// 			System.out.println(i);
// 			try {
// 				Thread.sleep(2000);
// 			} catch (Exception e) {}
// 		}
// 		System.out.println("printing number process is Completed");
// 	}
// }

// public class Main{
// 	public static void main(String[] args) {
// 		Adding a = new Adding();
// 		PrintChar pc = new PrintChar();
// 		PrintNum pn = new PrintNum();
		
// 		a.start();
// 		pc.start();
// 		pn.start();
		
// 	}
// }

//---------------------------Multi-threading using Implements in interfaces------------------------------------

// import java.util.Scanner;

// class Adding implements Runnable{
// 	@Override
// 	public void run() {
// 		System.out.println("Addition process is starting");
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the first number:");
// 		int a = sc.nextInt();
// 		System.out.println("Enter the Second number:");
// 		int b = sc.nextInt();
// 		int c = a+b;
// 		System.out.println(c);
// 		System.out.println("Addition process is Completed");
// 	}
// }

// class PrintChar implements Runnable{
// 	@Override
// 	public void run() {
// 		System.out.println("printing character process is starting");
// 		for(int i = 65 ; i < 70 ; i++) {
// 			System.out.println((char)(i));
// 			try {
// 				Thread.sleep(2000);
// 			} catch (Exception e) {}
// 		}
// 		System.out.println("printing character process is Completed");
		
// 	}
// }

// class PrintNum implements Runnable{
// 	@Override
// 	public void run() {
// 		System.out.println("printing number process is Started");
// 		for(int i = 1 ; i < 6 ; i++) {
// 			System.out.println(i);
// 			try {
// 				Thread.sleep(2000);
// 			} catch (Exception e) {}
// 		}
// 		System.out.println("printing number process is Completed");
// 	}
// }

// public class Main{
// 	public static void main(String[] args) {
// 		Adding a = new Adding();
// 		PrintChar pc = new PrintChar();
// 		PrintNum pn = new PrintNum();
		
// 		Thread t1 = new Thread(a);
// 		Thread t2 = new Thread(pc);
// 		Thread t3 = new Thread(pn);
		
// 		t1.start();
// 		t2.start();
// 		t3.start();
// 	}
// }

// ---------------------------------------------Inheritance  Basic example-------------------------------------------------

// class Parent{
// 	String color = "Black";
// 	float height = 5.6f;
// 	String lang = "Tamil";
	
// 	void speak() {
// 		System.out.println("Speaking tamil language");
// 	}
// 	void drink() {
// 		System.out.println("He never drunk");
// 	}
// 	void play() {
// 		System.out.println("He play Cricket");
// 	}
// }

// class Child extends Parent{
	
// }

// public class Main{
// 	public static void main(String[] args) {
// 		Child c = new Child();
// 		System.out.println(c.color);
// 		System.out.println(c.height);
// 		System.out.println(c.lang);
		
// 		c.speak();
// 		c.drink();
// 		c.play();
// 	}
// }

//--------------------------------------Example of Inheritance with Constructor chaining--------------------------------------------- 

// 	class Test1{
// 	int a ;
// 	int b ;
	
// 	Test1(){
// 		// super();
// 		a= 204;
// 		b= 335;
// 	}
	
// 	Test1(int a,int b){
// 		this.a=a;
// 		this.b=b;
// 	}
// }

// class Test2 extends Test1{
// 	int x;
// 	int y;
	
// 	Test2(){
// 		// super();
// 		x = 965;
// 		y = 416;
// 	}
	
// 	Test2(int x,int y){
// 		this.x = x;
// 		this.y = y;
// 	}
	
// 	void disp() {
// 		System.out.println(a);
// 		System.out.println(b);
// 		System.out.println(x);
// 		System.out.println(y);
// 	}
// }

// public class Main{
// 	public static void main(String[] args) {
// 		Test2 t = new Test2();
// 		t.disp();
// 	}
// }

// -------------------------------Example of Inheritance with Constructor chaining and super and this keyword with parameter constructer-------------------------------

// class Test1{
// 	int a ;
// 	int b ;
	
// 	Test1(){
// 		this(100,200 );
// 		a= 204;
// 		b= 335;
// 	}
	
// 	Test1(int a,int b){
// 		// super();
// 		this.a=a;
// 		this.b=b;
// 	}
// }

// class Test2 extends Test1{
// 	int x;
// 	int y;
	
// 	Test2(){
// 		this(9,99);
// 		x = 965;
// 		y = 416;
// 	}
	
// 	Test2(int x,int y){
// 		// super();
// 		this.x = x;
// 		this.y = y;
// 	}
	
// 	void disp() {
// 		System.out.println(a);
// 		System.out.println(b);
// 		System.out.println(x);
// 		System.out.println(y);
// 	}
// }

// public class Main{
// 	public static void main(String[] args) {
// 		Test2 t = new Test2();
// 		t.disp();
// 	}
// }

// class Operations extends Thread{
// 	@Override
// 	public void run() {
// 		Thread t = currentThread();
// 		String name = t.getName();
		
// 		if(name.equals("add")){
// 			add();
// 		}
// 		else if (name.equals("char")) {
// 			countchar();
// 		}
// 		else{
// 			countnum();
// 		}
// 	}
	
// 	void add() {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the firstr Number");
// 		int a = sc.nextInt();
// 		System.out.println("Enter the Second Number");
// 		int b = sc.nextInt();
// 		System.out.println(a+b);
// 	}
	
// 	void countchar() {
// 		for(int i = 65 ; i < 70 ; i++) {
// 			System.out.println((char)(i));
// 			try {
// 				Thread.sleep(2000);				
// 			}
// 			catch(Exception e) {
				
// 			}
// 		}
// 	}
	
// 	void countnum() {
// 		for(int i =1 ;i < 6 ; i++) {
// 			System.out.println(i);
// 			try {
// 				Thread.sleep(2000);				
// 			}
// 			catch(Exception e) {
				
// 			}
// 		}
// 	}
// }

// public class Main{
// 	public static void main(String[] args) {
// 		Operations o1 = new Operations();
// 		Operations o2 = new Operations();
// 		Operations o3 = new Operations();
		
// 		o1.setName("add");
// 		o2.setName("char");
// 		o3.setName("num");
		
// 		o1.start();
// 		o2.start();
// 		o3.start();
// 	}
// }


// class Operations implements Runnable{
// 	@Override
// 	public void run() {
// 		Thread t = Thread.currentThread();
// 		String name = t.getName();
		
// 		if(name.equals("add")){
// 			add();
// 		}
// 		else if (name.equals("char")) {
// 			countchar();
// 		}
// 		else{
// 			countnum();
// 		}
// 	}
	
// 	void add() {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter the firstr Number");
// 		int a = sc.nextInt();
// 		System.out.println("Enter the Second Number");
// 		int b = sc.nextInt();
// 		System.out.println(a+b);
// 	}
	
// 	void countchar() {
// 		for(int i = 65 ; i < 70 ; i++) {
// 			System.out.println((char)(i));
// 			try {
// 				Thread.sleep(2000);				
// 			}
// 			catch(Exception e) {
				
// 			}
// 		}
// 	}
	
// 	void countnum() {
// 		for(int i =1 ;i < 6 ; i++) {
// 			System.out.println(i);
// 			try {
// 				Thread.sleep(2000);				
// 			}
// 			catch(Exception e) {
				
// 			}
// 		}
// 	}
// }

// public class Main{
// 	public static void main(String[] args) {
// 		Operations o1 = new Operations();
// 		Operations o2 = new Operations();
// 		Operations o3 = new Operations();
		
// 		Thread t1 = new Thread(o1);
// 		Thread t2 = new Thread(o2);
// 		Thread t3 = new Thread(o3);
		
// 		t1.setName("add");
// 		t2.setName("char");
// 		t3.setName("num");
		
// 		t1.start();
// 		t2.start();
// 		t3.start();
		
// 	}
// }

class Captian extends Thread{
	@Override
	public void run() {
		try {
			
			BatingCoach bc = new BatingCoach();
			BowlingCoach bw = new BowlingCoach();
			
			bc.setDaemon(true);
			bw.setDaemon(true);
			
			bc.start();
			bw.start();
			
			
			System.out.println("Enter into Stadium");
			Thread.sleep(2000);
			System.out.println("Analyse the Stadium");
			Thread.sleep(2000);
			System.out.println("Start practic in nets");
			Thread.sleep(2000);
			System.out.println("Practice lot in the nets with diff Balls");
			Thread.sleep(2000);
			System.out.println("pack up the giers he took and come");
			Thread.sleep(2000);
			System.out.println("complete training");
			Thread.sleep(2000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class BatingCoach extends Thread{
	@Override
	public void run() {
		try {
			for( ; ; ) {			
				System.out.println("Batting coach help the caption in every 24/7");
				Thread.sleep(2000);
			}
		}
			catch(Exception e){
				e.printStackTrace();
			}
	}
}

class BowlingCoach extends Thread{
	@Override
	public void run() {
		try {
			for( ; ; ) {
				System.out.println("Bowling coach help the caption in every 24/7");			
				Thread.sleep(2000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
public class Main{
	public static void main(String[] args) {
		Captian c = new Captian();
		
		
		c.start();
	
		
	}
}

