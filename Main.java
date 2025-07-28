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


class Calculator{
	void add(int a,byte b){
		System.out.println("int byte");
	}
	void add(int a,char b){
		System.out.println("int char");
	}
}

public class Main{
	public static void main(String [] args){
		Calculator calc = new Calculator();
		calc.add('a','b');
	}
}
