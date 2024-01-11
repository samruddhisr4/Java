// class test{
//     public static void main(String[] args){
//         System.out.print("Hello World!");
//     }
// }
/*
class test{
    public static void main (String [] args){
        System.out.println("hello world!");
        System.out.println("I am Samruddhi");
    }
}
*/
//data types
// class test{
//     public static void main(String []args){
//         int a=10;
//         short b=12;
//         byte c=23;
//         long d=678;

//         double e=10.34;
//         float f=12.3f;

//         char g='e';
//         boolean h=true;
//     }
// }

//input

// import java.util.Scanner;

// public class test{
//     public static void main(String [] args){
//         int a,b;
//         float c,d;
//         double e,f;
//         String g,h;
//         Scanner i=new Scanner(System.in);

        //int
        // a=i.nextInt();
        // b=i.nextInt();
        // System.out.print(a+b);
        

        //float
        // c=i.nextFloat();
        // d=i.nextFloat();
        // System.out.print(c+d);


        //double
        // e=i.nextDouble();
        // f=i.nextDouble();
        // System.out.print(e+f);


        //word
        // g=i.next();
        // h=i.next();
        //char
        // char j=g.charAt(3);
        // System.out.print(j);


        //line
        // g=i.next();
        // System.out.print(g);
        // System.out.print(g);
        // System.out.print(g);




    

//     }
// }

//si-int o/p

// import java.util.Scanner;

// public class test{
//     public static void main(String [] args){
//         Scanner g=new Scanner(System.in);
//         int p,t;
//         float r,si;
//         p=g.nextInt();
//         r=g.nextFloat();
//         t=g.nextInt();
//         si=(p*r*t)/100;
//         System.out.print((int)si);

//     }
// }

// public class test{
//     public static void main(String[] args){
//         char ch='a';
//         ch=(char)(ch+1);
//         int i;
//         i=ch;
//         System.out.println(i);
//         System.out.println(ch);
//     }
// }

// import java.util.Scanner;
// public class test
// {
// 	public static void main(String[] args) {
// 		Scanner i=new Scanner(System.in);
// 		int F1,F2,product;
// 		F1=i.nextInt();
// 		F2=i.nextInt();
// 		product=F1*F2;
// 		System.out.println(product);

	
// 	}
// }


//even or not
// import java.util.Scanner;
// public class test{
//     public static void main(String [] args){
//         Scanner i=new Scanner(System.in);
//         int a=i.nextInt();
//         if(a%2==0){
//             System.out.println("Number is even");
//         }
//         else{
//             System.out.println("Number is odd");
//         }
//     }
// }





// import java.util.Scanner;
// public class test
// {
// 	public static void main(String[] args) {
// 		Scanner i=new Scanner (System.in);
// 		int a=i.nextInt();
// 		if(a%5==0){
// 			System.out.println("Multiple of 5");
// 		}
// 		else{
// 			System.out.print("Not a multiple of 5");
// 		}
		 
// 	}
// }

// public class Solution {
    
//     public static void main(String[] args) {
//         // Write your code here
//         Scanner=new Scanner(System.in){
//             char a=i.next().charAt(0);
//             if(Character.isUpperCase(a)){
//                 System.out.println("1");
//             }
//             else if(Character.isLowerCase(a)){
//                 System.out.println("0");
//             }
//             else{
//                 System.out.println("-1");
//             }
//         }
//     }
// }


// import java.util.Scanner;
// public class Solution {
//     public static void main(String[] args) {
//         // Write your code here
//         Scanner=new Scanner(System.in){
//             char ch=i.next().charAt(0);
//             if(ch>='A' && ch<='Z')){
//                 System.out.println("1");
//             }
//             else if(ch>='a' &&ch<='z'){
//                 System.out.println("0");
//             }
//             else{
//                 System.out.println("-1");
//             }
//         }
//     }
// }

// import java.util.Scanner;
// public class test{
//     public static void main(String[] args){
//         Scanner i = new Scanner(System.in);
//         int n=i.nextInt();
//         int div=2;
//         boolean isPrime=true;
//         while(div<n){
//             if(n%div==0){
//                 isPrime=false;   
//             }
//             div=div+1;
//         }
//         if (!isPrime){
//             System.out.println("Not prime");
//         }
//         else{
//             System.out.println("Prime");

//         }
//     }
// }

//break in cpp==return in java
// import java.util.Scanner;
// public class test{
//     public static void main(String[] args){
//         Scanner i=new Scanner(System.in);
//         int n=i.nextInt();
//         int div=2;
//         while(div<n){
//             if(n%div==0){
//                 System.out.print("Composite");
//                 return;
//             }
//             else{
//                 System.out.print("Prime");
//                 return;
//             }
//         }
//     }
// }


// import java.util.Scanner;

// public class test {
	
// 	public static void main(String[] args) {
// 		// Write your code here
// 		Scanner i=new Scanner(System.in);
// 		int salary ,a=0;
// 		char grade;
// 		salary=i.nextInt();
// 		grade=i.next().charAt(0);
// 		if(grade=='A'){
// 			a=1700;
// 			double ts=((salary*160/100)+a);
// 	    System.out.println((int)ts);
// 		}
// 		else if(grade=='B'){
// 			a=1500;
// 			double ts=((salary*160/100)+a);
// 	    System.out.println((int)ts);
// 		}
// 		else{
// 			a=1300;
// 			double ts=((salary*160/100)+a);
// 	    System.out.println((int)ts);
// 		}
// 	}
		
// }


// import java.util.Scanner;
// public class test {
	
// 	public static void main(String[] args) {
// 		// Write your code here
// 		Scanner i=new Scanner(System.in);
// 		int n=i.nextInt();
// 		int i=1;
// 		while( i<11){
// 			System.out.println(i*n);
// 			i=i+1;
// 		}


// 	}
// }

// import java.util.Scanner;
// public class test {
    
//     public static void main(String[] args) {
//         // Write your code here
//         Scanner i=new Scanner(System.in);
//             int x=i.nextInt();
//             int n=i.nextInt();
//             int k=0,prod=1;
//             if(n==0){
//                 System.out.print(1);
                
//             }
//             else if(x==0){
//                 System.out.print(0);
//             }
//             else {
//                 while(k<n){
//                 prod=prod*x;
//                 k=k+1;
//             }
//             System.out.println(prod);
//             }
            
//     }
// }

// import java.util.Scanner;
// public class test {
    
//     public static void main(String[] args) {
//         // Write your code here
//         Scanner i=new Scanner(System.in);
//         int n=i.nextInt();
//         int div=2;
//         int count=0;
//         while(div<n){
//             if(n%div==0){
//                 System.out.print(div+" ");
//                 count+=1;
//             }
//             div+=1;
            
        
//         if(count==1&& (div==n )){
//             System.out.print(div);
//             System.out.print(-1);
//         }
//         }
//     }
// }

// import java.util.*;
// class Main{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt();
//         int count=0;
//         for(int i=1;i<=x;i++){
//             if(x%i==0){
//                 System.out.println("Factor: "+i);
//                 count++;
//             }
//         }
//         if(count==2){
//             System.out.println("-1");
//         }
//     }
// }

// incorrect
// import java.util.*;
// public class test{
//     public static void main(String args[]){

//         Scanner i=new Scanner(System.in);
//         int n=i.nextInt();// Input taken
        
//         // Checking if the number is prime or not
//         int div=2;
//         boolean isPrime=true;  // Assuming the number to be a prime number
//         int count=0;

//         while(div<n){
//             if(n%div==0){   // If the number is divisible by div, it a not a prime, hence we break the loop
//                 isPrime=false;  // else we continue till the condition does not hold true
//                 return;
//             }
//             div++;
//         }

//         // If the number is prime we print -1 or else we print it factors
//         if(isPrime==false){
//             for(int j=2;j<n;j++){
//             if(n%j==0){
//                 System.out.print(j+" ");
//                 return;
//             }
//         }
//         }
//         else
//             System.out.print(-1);
//     }
// }

// * sqaure
// import java.util.*;
// public class test{
//     public static void main(String[] args){
//         Scanner i=new Scanner(System.in);
//         int n=i.nextInt();
//         int a=0;
//         while(a<n){
//             int j=0;
//             while(j<n){
//             System.out.print("* ");
//             j++;
//             }
//             System.out.println();
//             a++;
//         }
//     }
// }

// 1 1 1 1
// 2 2 2 2
// 3 3 3 3
// 4 4 4 4
// import java.util.*;
// public class test{
//     public static void main(String [] args){
//         Scanner a=new Scanner(System.in);
//             int n=a.nextInt();
//             int i=1;
//             while(i<=n){
//                 int j=1;
//                 while(j<=n){
//                     System.out.print(i+" ");
//                     j++;
//                 }
//                 i++;
//                 System.out.println();
//             }
        
//     }
// }


// 1 2 3 4
// 1 2 3 4
// 1 2 3 4
// 1 2 3 4

// import java.util.*;
// public class test{
//     public static void main(String[] args){
//         Scanner a=new Scanner(System.in);
//             int n=a.nextInt();
//             int i=0;
//             while(i<n){
//                 int j=1;
//                 while(j<=n){
//                     System.out.print(j+" ");
//                     j++;
//                 }
//                 System.out.println();
//                 i++;
//             }
        
//     }
// }


// import java.util.*;
// public class test{
//     public static void main(String[] args){
//         Scanner a=new Scanner(System.in);
//             int n=a.nextInt();
//             int i=0;
//             while(i<n){
//                 int j=1;
//                 while(j<=n){
//                     System.out.print(n-j+1+" ");
//                     j++;
//                 }
//                 System.out.println();
//                 i++;
//             }
        
//     }
// }

// 1
// 1 2
// 1 2 3
// 1 2 3 4

// import java.util.Scanner;
// public class test{
//     public static void main(String[] args){
//         Scanner a=new Scanner(System.in);
//             int n=a.nextInt();
//             int i=1;
//             while(i<=n){
//                 int j=1;
//                 while(j<=i){
//                     System.out.print(j);
//                     j++;
//                 }
//                 System.out.println();
//                 i++;
//             }
        
//     }
// }


// 1
// 2 3 
// 4 5 6
// 7 8 9 10

// import java.util.Scanner;
// public class test{
//     public static void main(String[] args){
//         Scanner a=new Scanner(System.in);
//         int n=a.nextInt();
//         int i=1,c=1;
//         while(i<=n){
//             int j=0;
//             while(j<i){
//                 System.out.print(c+" ");
//                 c++;
//                 j++;
//             }
//             System.out.println();
//             i++;
//         }
//     }
// }

// 1
// 2 3
// 3 4 5
// 5 6 7 8
// import java.util.Scanner;
// public class test{
//     public static void main(String[] args){
//         Scanner a=new Scanner(System.in);
//             int n=a.nextInt();
//             int i=0;
//             while(i<=n){
//                 int j=1;
//                 int p=i;
//                 while(j<=i){
//                     System.out.print(p);
//                     p++;
//                     j++;
//                 }
//                 System.out.println();
//                 i++;
//             }
        
//     }
// }



// ABCD
// ABCD
// ABCD
// ABCD
// import java.util.Scanner;
// public class test{
//     public static void main(String []args){
//         Scanner a=new Scanner(System.in);
//             int n=a.nextInt();
//             int i=0;
//             while(i<n){
//                 int j=1;
//                 while(j<=n){
//                     System.out.print((char)('A'+j-1));
//                     j++;
//                 }
//                 i++;
//                 System.out.println();
//             }
        
//     }
// }




// ABCD
// BCDE
// CDEF
// DEFG
// import java.util.Scanner;
// public class test{
//     public static void main(String[] args){
//         Scanner a=new Scanner(System.in);
//         int n=a.nextInt();
//         int i=0;
//         while(i<n){
//             int j=0;
//             while(j<n){
//                 int p=j;
//                 char jth=(char)('A'+p+i);
//                 System.out.print(jth);
//                 p++;
//                 j++;
//             }
//             System.out.println();
//             i++;
//         }
//     }
// }





// *****
// ****
// ***
// **
// *
// import java.util.*;
// public class test{
//     public static void main(String[] args){
//         Scanner a=new Scanner(System.in);
//         int n=a.nextInt();
//         int i=0;
//         while(i<n){
//             int j=n-i;
//             while(j>0){
//                 System.out.print("*");
//                 j--;
//             }
//             System.out.println();
//             i++;
//         }
//     }
// }

//     *
//    **
//   ***
//  **** 
// *****
// import java.util.Scanner;
// public class test{
//     public static void main(String[] args){
//         Scanner a=new Scanner(System.in);
//             int n=a.nextInt();
//             int i=0;
//             while(i<n){
//                 int j= n-i-1;
//                 int p=i+1;
//                 while(j>0){
//                     System.out.print(" ");
//                     j--;
//                 }
//                 while(p>0){

//                     System.out.print("*");
//                     p--;
//                 }
//                 System.out.println();
//                 i++;
//             }
        
//     }
// }



//    1
//   12
//  123
// 1234
// import java.util.Scanner;
// public class test{


// 	public static void main(String[] args) {
		
// 		/* Your class should be named Solution.
// 	 	* Read input as specified in the question.
// 	 	* Print output as specified in the question.
// 		*/	
// 		Scanner a=new Scanner(System.in);
// 		int n=a.nextInt();
// 		int  i=1;
// 		while(i<=n){
// 			int spaces=n-i;
// 			int p=1;
// 			while(spaces>0){
// 				System.out.print(" ");
// 				spaces--;
// 			}
// 			while(p<=i){
// 				System.out.print(p);
// 				p++;
// 			}
// 			System.out.println();
// 			i++;

// 		}

		
// 	}

// }



//    1
//   121
//  12321
// 1234321
// import java.util.Scanner;
// public class test{
//     public static void main(String[] args){
//         Scanner a=new Scanner(System.in);
//             int n=a.nextInt();
//             int  i=0;
//             while(i<n){
//                 int spaces=1;
//                 int  p=1;
//                 int q=i;
//                 while(spaces<n-i){
//                     System.out.print(" ");
//                     spaces++;
//                 }
//                 while(p<=i+1){
//                     System.out.print(p);
//                     p++;
//                 }
//                 while(q>0){
//                     System.out.print(q);
//                     q--;
//                 }
//                 System.out.println();
//                 i++;
//             }
        
//     }
// }


// import java.util.Scanner;
// public class test {


// 	public static void main(String[] args) {
		
// 		/* Your class should be named Solution.
// 	 	* Read input as specified in the question.
// 	 	* Print output as specified in the question.
// 		*/
// 		Scanner a=new Scanner(System.in);
// 		int n=a.nextInt();
// 		int i=1;
// 		while(i<=n){
//             int spaces=n-i;
//             int p=1;
// 			while(spaces>0){
// 				System.out.print(" ");
// 				spaces--;
// 			}
// 			while(p<=2*i-1){
// 				System.out.print("*");
// 				p++;
// 			}
// 			System.out.println();
// 			i++;

// 		}
		
// 	}

// }




//     1
//    232
//   34543
//  4567654
// import java.util.Scanner;

// public class test {

// 	public static void main(String[] args) {
// 		/* Your class should be named Solution.
// 	 	* Read input as specified in the question.
// 	 	* Print output as specified in the question.
// 		*/
// 		Scanner a=new Scanner(System.in);
// 		int n=a.nextInt();
// 		int i=1;
// 		while(i<=n){
// 			int spaces=n-i;
// 			int p=i;
//             int c=1;
// 			int j=1;
//             int d=2;
//             int q=2*i-2;
// 			while(spaces>=0){
// 				System.out.print(" ");
// 				spaces--;
// 			}
// 			while(j<=i){
// 				System.out.print(p);
// 				p++;
// 				j++;
// 			}
//             while(c<i){
//                 System.out.print(q);
//                 q--;
//                 c++;
//             }
// 			System.out.println();
// 			i++;
// 		}
// 	}
// }


// import java.util.Scanner;

// public class test {

//     public static void main(String[] args) {
//         Scanner a=new Scanner(System.in);
//         int n=a.nextInt();
//         int i=0;
//         int j=0;
//         int c=(n+1)/2;
//         while(i<c){
//             int spaces=n-i-1;
//             int stars=1;
//             while(spaces>=0){
//                 System.out.print(" ");
//                 spaces--;
//             }
//             while(stars<=2*i-1){
//                 System.out.print("*");
//                 stars++;
//             }
//             System.out.println();
//             i++;

//         }
//         while(j<=c-1){
//             int space=j+1;
//             int star=2*(c-j)-1;
//             while(space>0){
//                 System.out.print(" ");
//                 space--;
//             }
//             while(star>0){
//                 System.out.print("*");
//                 star--;
//             }
//             j++;
//             System.out.println();
//         }
//     }
// }



// import java.util.Scanner;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner a=new Scanner(System.in);
//         int n=a.nextInt();
//         int i=1;
//         int j=0;
//         int c=(n+1)/2;
//         while(i<=c){
//             int spaces=c-i;
//             int stars=1;
//             while(spaces>=0){
//                 System.out.print(" ");
//                 spaces--;
//             }
//             while(stars<=2*i-1){
//                 System.out.print("*");
//                 stars++;
//             }
//             System.out.println();
//             i++;

//         }
//         while(j<c-1){
//             int space=j+1;
//             int star=2*(c-j)-1;
//             while(space>0){
//                 System.out.print(" ");
//                 space--;
//             }
//             while(star>0){
//                 System.out.print("*");
//                 star--;
//             }
//             j++;
//             System.out.println();
//         }
//     }
// }



// 1=1
// 1+2=3
// 1+2+3=6
// 1+2+3+4=10
// import java.util.Scanner;
// public class test {
	
// 	public static void main(String[] args) {
// 		// Write your code here
// 		Scanner a=new Scanner(System.in);
// 		int n=a.nextInt();
// 		int i=1;
// 		while(i<=n){
// 			int j=1;
// 			int sum=1;
// 			while(j<i){
// 				System.out.print(j+"+");
// 				sum=sum+j+1;
//                 j++;
// 			}

//             System.out.println(j+"="+sum);
//             i++;
        
// 		}
// 	}
// }


//ODD SQUARE
// 135
// 351
// 513
// import java.util.Scanner;
// public class test{
//     public static void main(String [] args){
//         Scanner a=new Scanner(System.in);
//         int n=a.nextInt();
//         int i=0;
//         while(i<n){
//             int c=2*(i+1)-1;
//             int j=0;
//             while(j<n){
//                 System.out.print(c);
//                 c=c+2;
//                 j++;
//                 if(c>2*n-1){
//                     c=1;
//                 }
//             }
//             System.out.println();
//             i++;
//         }
//     }
// } 

// import java.util.Scanner;
// import java.lang.Math;
// public class test {
	
// 	public static void main(String[] args) {
// 		// Write your code here
// Scanner i=new Scanner(System.in);
// 		int salary ,a=0;
// 		int ts=0;
// 		char grade;
// 		salary=i.nextInt();
// 		grade=i.next().charAt(0);
// 		if(grade=='A'){
// 			a=1700;
// 		}
// 		else if(grade=='B'){
// 			a=1500;
// 		}
// 		else{
// 			a=1300;
// 		}
// 			 ts=(salary+(salary*59/100)+a);
// 	    	System.out.println(Math.round(ts));
// 	}
// }


// 4567 B
// 8762
// import java.util.Scanner;
// import java.lang.Math;
// public class test {
	
// 	public static void main(String[] args) {
// 		// Write your code here
// Scanner i=new Scanner(System.in);
// 		// int salary;
// 		int a=0;
// 		// int ts=0;
// 		char grade;
// 		int salary=i.nextInt();
// 		grade=i.next().charAt(0);

// 		double hra= .20*salary;
// 		double da= .50* salary;
// 		double pf= .11*salary;
// 		if(grade=='A'){
// 			a=1700;
// 		}
// 		else if(grade=='B'){
// 			a=1500;
// 		}
// 		else{
// 			a=1300;
// 		}
// 			// double ts=(salary+(salary*59/100)+a);
// 			double totalsalary=((salary+hra+da+a)- pf);
// 	    	System.out.println(Math.round(totalsalary));
// 	}
// }

// public class test{
//     public static void main(String[] args){
        // int a=10,b=20;
        // int c=a & b;
        // System.out.println(c);
        // System.out.println(a|b);
        // System.out.println(a^b);
        // public static void main (String[] args) {
            // int a=10,b=20;
            // int c=a&b;
            // System.out.print(c);
            // int d=a|b;
            // System.out.print(d);
            // int e=a^b;
            // System.out.print(e);
            // int f=c+d+e;
            // System.out.print(~f);
    //         int a=10,b=-20;
    // System.out.print(a^b);
    // int a = 42;
    //    int b = ~a; 
    //           System.out.print(a + " " + b);       
    //     }
    // }

    // int a=10,b=20;
    // System.out.println(a+++--b);
    // System.out.println(a--+++b);
    // System.out.println(a++-++b);
    // System.out.println(a+++++b);
//     for(int i = 0; i < 3; i++) {
//         System.out.print(i + " ");
//         }
//     System.out.print(i + " ");

// // }
// for(int i=7;i!=0;i--)
// {
//     System.out.print(i--);
// }
//     }
// }

// import java.util.Scanner;
// public class test {

// 	public static void main(String[] args) {
		
// 		/* Your class should be named Solution.
// 	 	* Read input as specified in the question.
// 	 	* Print output as specified in the question.
// 		*/
// 		Scanner a=new Scanner(System.in);
// 		int n =a.nextInt();
// 		if(n>=2){
// 			System.out.println(2);
// 		}
// 		boolean isPrime=true;
// 		for(int i=3;i<n;i=i+2){
// 			for( int j=2;j<n/2;j=j+2){
// 				if(i%j==0){
// 					isPrime=false;
// 				}
// 			}
		
// 		if(isPrime){
// 			System.out.println(i);
// 		}
// 		}
		
// 	}
// }


// import java.util.Scanner;
// public class test {
	
// 	public static void main(String[] args) {
// 		// Write your code here
// 		Scanner a=new Scanner(System.in);
// 		int n=a.nextInt();
// 		int m=n;
// 		int rev=0;
// 		while(m!=0){
// 			int rem=m%10;
// 			if(rem==0){
// 				m/=10;
// 				continue;
// 			}
// 			else{

// 			rev=rev*10+rem;
// 			m/=10;
// 			}

// 		}
// 		System.out.println(rev);

// 	}
// }



//decimal to binary
// import java.util.Scanner;
// public class test {
	
// 	public static void main(String[] args) {
// 		// Write your code here
// 		Scanner a=new Scanner(System.in);
// 		int n=a.nextInt();
// 			int base=1;
// 			int ans=0;
// 		for(;n!=0;n/=2){
// 			int ld=n%2;
// 			ans=ans+ld*base;
// 			base*=10;
// 		}
// 		System.out.println(ans);
		

// 	}
// }


// import java.util.*;
// public class test{
//     public static void main(String[] args){
//         Scanner a=new Scanner(System.in);
//         while(true){
//             int n=a.nextInt();
//         }
//     }
// }


// import java.util.Scanner;
// public class test {
	
// 	public static void main(String[] args) {
// 		// Write your code here
// 		Scanner a=new Scanner(System.in);
// 		int num=a.nextInt();

// 		int prev=a.nextInt();
// 		boolean isDec=true;
// 		for(int i=1;i<num;i++){

// 		int curr=a.nextInt();
// 		while(isDec){
// 				if(curr>prev){

// 						isDec=false;
// 					// System.out.println("false");
// 					break;
// 				}
// 				else if(curr==prev){
// 					System.out.println("false");
// 					return;
// 				}
// 				else if(curr<prev){
// 					int n=a.nextInt();
// 					prev=curr;
// 					curr=n;
// 				}
// 		}
// 		// System.out.println("true");
// 		while(isDec=false){
// 			if (curr<prev){
// 				System.out.println("false");
// 				return;
// 			}
// 			else if(curr==prev){
// 				System.out.println("false");
// 				return;
// 			}
// 			else if(curr>prev){
// 				int n=a.nextInt();
// 				prev=curr;
// 				curr=n;
				
				
// 			}
// 				System.out.println("true");
// 		}
// 	}
// 	}
		
// }


// import java.util.Scanner;
// public class test {

// 	public static void main(String[] args)  
// 	{
// 	    // Write your code 
// 		Scanner a=new Scanner(System.in);
// 		int n=a.nextInt();
// 		int i=0;
// 		for(;i<n;i++){
// 			int num=a.nextInt();
// 			int space=0;
// 			int star=0;
// 			for(int j=0;j<num;j++){
// 				while(space<=j){
// 				System.out.print(" ");
// 				space++;

// 				}
// 				while(star<=n-j){
// 					System.out.print("*");
// 					star++;
// 				}
// 				System.out.println();

// 			}
// 			System.out.println();
			
// 		}
// 	}
// }

// import java.util.Scanner;
// public class test {

// 	public static void main(String[] args)  
// 	{
// 	    // Write your code 
// 		Scanner i=new Scanner(System.in);
// 		int a=i.nextInt();
// 		int b=i.nextInt();
// 		int max=0,gcd=0;
// 		if(a>b && a%b==0){
// 			System.out.println(b);
// 		}
// 		else if(b>a && b%a==0){
// 			System.out.println(a);
// 		}
// 		if(a>b){
// 			max=a;
// 		}
// 		else {
// 			max=b;
// 		}
// 		for(int j=0;j<max;j++){
// 			if(a%j==0 && b%j==0){
// 				gcd=j;
// 			}
// 		}
// 		System.out.println(gcd);
// 	}
// }


// import java.util.Scanner;
// public class test{
//     public static void main(String [] args){
//         Scanner i=new Scanner(System.in);
//         int n=i.nextInt();
//         int r=i.nextInt();
//         int factr=1;
//         int factnr=1;
//         int factn=1;
//         for(int j=1;j<=n;j++){
//             factn=factn*j;
//         }
//         System.out.println(factn);
//         for(int j=1;j<=r;j++){
//             factr*=j;
//         }
//         System.out.println(factr);
//         for(int j=1;j<=n-r;j++){
//             factnr*=j;
//         }
//         System.out.println(factnr);
//         System.out.println(factn/(factr*factnr));
//     }
// }
// import java.util.Scanner;
// public class test{
//     public static int factorial(int num){
//         int fact=1;
//          for(int j=1;j<=num;j++){
//             fact=fact*j;
//         }
//         return fact;
//     }
//     public static void main(String[] args){
//         Scanner i=new Scanner(System.in);
//         int n=i.nextInt();
//         int r=i.nextInt();
//         int factn=factorial(n);
//         int factr=factorial(r);
//         int factnr=factorial(n-r);
//         int ncr=factn/(factr*factnr);
//         System.out.println(ncr);
//     }
// }


// import java.util.Scanner;
// public class test{
//     public static int sum(int a,int b){
//         return a+b;
//     }
//     public static void main(String[] args){
//         Scanner i=new Scanner(System.in);
//         int a=i.nextInt();
//         int b=i.nextInt();
//         int s=sum(a,b);
//         System.out.println(s);
//     }
// }

// public class test{
//     public static void main(String[] args){
//         int n=8;
//         int d=0;
//         System.out.println(divide(n,d));
//     }
//     public static int divide(int n,int d){
//         if(d==0){
//             return Integer.MIN_VALUE;
//         }
//         else{
//             return n/d;
//         }
//     }
// }


// public class test{
//     public static void main(String[] args){
//         int[] arr=new int[10];
//         arr[4]=65;
//         arr[7]=32;
//         System.out.println(arr[4]+arr[7]);


//     }
// // }
// import java.util.*;
// public class test{
//     public static void main(String[] args){
//         Scanner a=new Scanner(System.in);
//         int n=a.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=a.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             System.out.println(i+"th term of the array: "+arr[i]);
//         }
//     }
// }

// import java.util.Scanner;
// public class test{
//     public static int[] takeInput(){
//         Scanner a=new Scanner(System.in);
//         int n=a.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             System.out.print("Element at "+i+" position: ");

//             arr[i]=a.nextInt();

//         }
//         return arr;
//     }
//     public static void Output(int[] arr){
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }

//     public static void main(String[] args){
//         int arr[]=takeInput();
//         Output(arr);
//     }

// }

// import java.util.*;
// public class test{
//     public static void main(String[] args){
//         Scanner a=new Scanner(System.in);
//         int t=a.nextInt();
//         for(int i=0;i<t;i++){
//             int[] arr=takeInput();
//             output(arr);
//             int average=avg(arr);
//             System.out.println("Average : "+ average);
//             System.out.println(largest(arr));
//         }
//     }
//     public static int[] takeInput(){
//         Scanner a=new Scanner(System.in);
//         System.out.println("Enter size of array");
//         int n=a.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             System.out.println("Element "+i+" = ");
//             arr[i]=a.nextInt();
//         }
//         return arr;
//     }
//     public static void output(int[] arr){
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             System.out.println(i+"th term of array : "+arr[i]);
//         }
//     }
//     public static int avg(int[] arr){
//         int n=arr.length;
//         int avg=0;
//         for(int i=0;i<n;i++){
//             avg+=arr[i];
//         }
//         return avg/n;
//     }
//     public static int largest(int[] arr){
//         int n=arr.length;
//         int lar=arr[0];
//         for(int i=1;i<n;i++){
//             if(arr[i]>lar){
//                 lar=arr[i];
//             }
//         }
//         return lar;
//     }
// }


// pairs in an array
// import java.util.Scanner;
// public class test{
//     public static int[]  pairs(int[] arr){
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 System.out.print("("+arr[i]+","+arr[j]+")");
//             }
//             System.out.println();
//         }
//         return arr;
//     }
//     public static void main(String [] args){
//         Scanner a=new Scanner(System.in);
//         int n=a.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=a.nextInt();
//         }
//         arr=pairs(arr);
//         System.out.println(arr);
       
//     }
// }


// import java.util.Scanner;

// public class test {
    
//     public static void swapAlternate(int arr[]) {
//         int  n=arr.length;
//         // int lt=0;
//         int count=n/2;
//         for(int i=0;i<n;){
//         while(count>0){

//            int temp=arr[i];
//            arr[i]=arr[i+1];
//            arr[i+1]=temp;
//            i+=2;
//            count--;
//         }
//         }
//     }

    
//     public static void main(String[] args)  {
//         Scanner sr = new Scanner(System.in);
//         int t = sr.nextInt();
//         while(t > 0) 
//         {
//             int n=sr.nextInt();
//             int[] arr=new int[n];
//             for (int i =0 ; i<n;i++)
//             {
//                 arr[i]=sr.nextInt();
//             }
//             swapAlternate(arr);
//             for(int i=0;i<n;i++)
//             {
//                 System.out.print(arr[i]+" ");
//             }
//             System.out.println();
//             t -= 1;
//         }
//     }


// }



// import java.util.Scanner;
// public class test {
    
//     public static void arrange(int[] arr, int n) {
//     	//Your code goes here
//         boolean isOdd=true;
//         if(n%2==0){
//             isOdd=false;
//         }
//         if(isOdd){
//             for(int i=0;i<n/2;i=i+2){
//                 arr[i]=i+1;
//             }
//             arr[n/2]=n;
          
//         }
//         else{
//             for(int i=0;i<n/2;i++){
//                 arr[i]=i+1;
//             }
//                 arr[n/2]=n;
//                 for(int j=n-2 , int l=(n/2)+1 ; j>1 && l<n;j=j-2 , l++){
//                     arr[l]=j;
//                 }
//             }
//         }
    

//     public static void main(String[] args)  {
//         Scanner sr = new Scanner(System.in);
//         int t = sr.nextInt();
//         while(t > 0) 
//         {
//             int n=sr.nextInt();
//             int[] arr=new int[n];
//             for(int k=0;k<n;k++){
//                 arr[i]=a.nextInt();
//             }
//             arrange(arr, n);
//             for(int i=0;i<n;i++)
//             {
//                 System.out.print(arr[i]+" ");
//             }
//             System.out.println();
//             t -= 1;
//         }
//     }

// }


    


// import java.util.Scanner;
// public class test {
//     public static int findUnique(int[] arr){
// 		//Your code goes here
//     int n=arr.length;
//       int unique=0;
//     for(int i=0;i<n;i++){
//     int count=0;
//       for(int j=0;j<n;j++){
//         if(arr[i]==arr[j]){
//           count++;
//         }
      
//     }
//         if(count==1){
//           unique=arr[i];
//         }
//     }
//     return unique;
//     }

//     public static void main(String[] args)  {
//         Scanner sr = new Scanner(System.in);
//         int t = sr.nextInt();
//         while(t > 0) 
//         {
//             int n=sr.nextInt();
//             int[] arr=new int[n];
//             for (int i =0 ; i<n;i++)
//             {
//                 arr[i]=sr.nextInt();
//             }
//             System.out.println( findUnique(arr));
           
//             t -= 1;
//         }
//     }
// }

// public class test{
//     public static void main(String [] args){
//         // int[] arr=new int[6];
//         int n=6;
//         int[] arr={2,1,6,4,5,3};
//         for(int i=0;i<5;i++){
//             int temp=0;
//             if(arr[i]>arr[i+1]){
//                 temp=arr[i];
//                  arr[i]=arr[i+1];
//                  arr[i+1]=temp;
//             }
//         } 
//             for(int j=0;j<6;j++){

//                 System.out.print(arr[j]);
//             }
//     }
// }

//selection sort
// import java.util.Scanner;
// public class test{
//     public static void main(String[] args){
//         Scanner sr=new Scanner(System.in);
//         int[] arr=new int[5];
//         for(int i=0;i<5;i++){
//             arr[i]=sr.nextInt();
//         }
//         for(int i=0;i<5;i++){
//             int min=arr[i];
//             for(int j=i+1;j<5;j++){
//                 if(min>arr[j]){
//                     int temp=min;
//                     min=arr[j];
//                     arr[j]=temp;
//                 }
//             }    
//             arr[i]=min;

//         }
//         for(int i=0;i<5;i++){

//             System.out.print(arr[i]+" ");
//         }
//     }
// }


//bubble sort
// public class test{
//     public static void main(String[] arg){
// int[] arr={5,4,7,2,6};
// int n=5;
// for(int i=0;i<n;i++){
//     for(int j=0;j<n;j++){
//         if(arr[j]>arr[j+1]){
//             int temp=arr[j];
//             arr[j]=arr[j+1];
//             arr[j+1]=temp;
//         }
//     }
// }
// for(int i=0;i<n;i++){
//     System.out.println(arr[i]);
// }
//     }
// }



//insertion sort
// public class test{
//     public static void main(String [] args){
//         int[] arr={56,4,23,75,9,904,41};
//         for(int i=0;i<7;i++){
//             int temp=arr[i];
//             int j=i-1;
//             while(j>=0 && arr[j]>temp){
//                 arr[j+1]=arr[j];
//                 j--;
//             }
//             arr[j+1]=temp;
//         }
//         for(int i=0;i<7;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }