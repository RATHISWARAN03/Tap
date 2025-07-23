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

class Animal{
	void bread(){
		System.out.println("The Breade of Animal");
	}
	void eat() {
		System.out.println("It can Eat");
	}
	void sleep() {
		System.out.println("It can sleep");
	}
}
class Lion extends Animal {
	@Override
	void eat() {
		System.out.println("It eats animals");
	}
	void huntingType() {
		System.out.println("It Hunts");
	}
	
}
class Horse extends Animal {
	@Override
	void eat() {
		System.out.println("It eats Grass");
	}
	void huntingType() {
		System.out.println("It Never Hunts");
	}
}
class Monkey extends Animal {
	@Override
	void eat() {
		System.out.println("It eats Fruits and Vegitables");
	}
	void huntingType() {
		System.out.println("It Never Hunts");
	}
}


public class Main{
	public static void main(String[] args) {
		Lion l= new Lion();
		Horse h= new Horse();
		Monkey m= new Monkey();
		
		l.bread();
		l.eat();
		l.sleep();
		l.huntingType();
		System.out.println("------------------------------------------------------");
		h.bread();
		h.eat();
		h.sleep();
		h.huntingType();
		
		System.out.println("------------------------------------------------------");
		m.bread();
		m.eat();
		m.sleep();
		m.huntingType();
	}
}
