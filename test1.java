// public class test1 {
//     public static void main(String[] args){
//         int[] arr={25 ,34, 37, 14, 48 ,19 ,8 ,27, 28, 47};
//         long count=0;
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]>arr[j]){
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }


//push zeroes to end
// import java.util.Scanner;
// public class test1{
//     public static void main(String[] args){
//         Scanner sr=new Scanner(System.in);
//         int n=sr.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sr.nextInt();

//         }
//         int j=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]!=0){
//                 // int temp=arr[j];
//                 arr[j]=arr[i];
//                 arr[i]=0;
//                 j++;
//             }
//         }
//          for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" "); 

//         }
//     }
// }

//reversing an array
// import java.util.Scanner;
// public class test1{
//     public static void main(String[] args){
//         Scanner sr =new Scanner(System.in);
//         int n=sr.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sr.nextInt();
//         }
//         for(int i=0;i<=n/2;i++){
//             int temp=arr[i];
//             arr[i]=arr[n-i-1];
//             arr[n-i-1]=temp;
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

//array rotation
// import java.util.Scanner;
// public class test1{

//     public static void rev(int[]arr,int l,int r){
//         r--;
//     while(l<r){
//         int temp=arr[l];
//         arr[l]=arr[r];
//         arr[r]=temp;
//         l++;
//         r--;
//     }
// }
// public static void main(String[] args){
//     Scanner sr =new Scanner(System.in);
//     System.out.println("Length of Array: ");
//     int len=sr.nextInt();
//     int[] arr=new int[len];
//     for(int i=0;i<len;i++){
//         arr[i]=sr.nextInt();
//     }
//     int n=sr.nextInt();
//     rev(arr,0,len);
//     rev(arr,0,n);
//     rev(arr,n,len);
//     for(int i=0;i<len;i++){
//         System.out.print(arr[i]+" ");
//     }
// }
//     }


//strings
// public class test1{
//     public static void main(String[] args){
//         String s1="sam and ",s2="rishu",s3;
//         s3=s1.concat(s2);
//         int n=s1.length();
//         // System.out.println(s3);
//         // System.out.println(s1.equals(s2));
//         // System.out.println(s3.length());
//         // System.out.println(s2.compareTo(s1));
//         // System.out.println(s1.charAt(6));
//         // System.out.println(s2.contains("shu"));
//         // String substr=s2.substring(0, 5);
//         // String substr1=s1.substring(3);
//         // System.out.println(substr);
//         // System.out.println(substr1);
//         for(int i=0;i<n;i++){
//             System.out.print(s1.charAt(n-1-i));
//         }
//     }
// }




//PALINDROME
// public class test1{
//     public static void main(String[] args){
//         String s ="SAM";
//         int n=s.length();
//         boolean isPalindrome=true;
//         for(int i=0;i<n/2;i++){
//             if(s.charAt(i)!=s.charAt(n-i-1)){
//                 isPalindrome=false;
//                 break;
//             }
//         }
//         if(isPalindrome){
//             System.out.println("PALINDROME");
//         }
//         else{
//             System.out.println("NOT A PALINDROME");
//         }
//     }
// }


// Substrings of a string
// import java.util.Scanner;
// public class test1{
//     public static void main(String[] args){
//         Scanner sr=new Scanner(System.in);
//         String str=sr.next();
//         int n=str.length();
//         for(int i=0;i<n;i++){
//             System.out.print(str.charAt(i)+" ");
//             for(int j=i+1;j<n;j++){
//                 System.out.print(str.substring(i,j+1)+" ");
//             }
//             System.out.println();
//         }
//     }
// }



// public class test1{
//     public static void main(String[] args){
//         String str="samruddhi";
//         String nstr=str.substring(0,3);
//         System.out.println(nstr);
//     }
// }

// public class test1{
//     public static void main(String[] args){
//         StringBuffer str=new StringBuffer("abc");
//         str.append("efg");
//         str.setCharAt(3,'Z');
//         System.out.println(str);
//     }
// }

// import java.util.*;
// public class test1{
//     public static void main(String[]  args){
//         Scanner a=new Scanner(System.in);
//         String str=a.nextLine();
//         int start=0;
//         String ans="";
//         for(int i=0;i<=str.length();i++){
//             if(str.charAt(i)==' '|| i==str.length()){
//                 int end=i-1;
//                 String rev="";
//                 for(int j=start;j<=end;j++){
//                     rev=str.charAt(j)+rev;      
//                 }
//                     ans=ans+rev+" ";
//                     start=i+1;
//             }
//         }
//         System.out.println(ans);
//     }
// }

// import java.util.*;

// public class test1 {
//     public static void main(String[] args) {
//         Scanner a = new Scanner(System.in);
//         String str = a.nextLine();
//         int start = 0;
//         String ans = "";

//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) == ' ' || i == str.length() - 1) {
//                 int end = i;
//                 String rev = "";

//                 for (int j = start; j <= end; j++) {
//                     rev = str.charAt(j) + rev;
//                 }

//                 ans = ans + rev + " ";
//                 start = i + 1;
//             }
//         }

//         System.out.println(ans.trim()); // Trim to remove trailing spaces
//     }
// }

// import java.util.Scanner;
// public class test1{
//     Student s1=new Student
// }
// class Student{
//     String name;
//     final private int roll_num;
//     static int num_students;
//     double cgpa;
//     Student(String name,int roll_num){
//         this.name=name;
//         this.roll_num=roll_num;
//         num_students++;
//     } 
    
// }

// string recursion
// import java.util.Scanner;
// public class test1{
//     public static String replacechar(String s,char a,char b){
//         if(s.length()==0){
//         return s;
//         }
//     String smallout=replacechar(s.substring(1),a,b);
//     if(s.charAt(0)==a){
//         return b+smallout;
//     }
//     else{
//         return s.charAt(0)+smallout;
//     }
   
//     }


//     public static void main(String[] args){
//     Scanner sr=new Scanner(System.in);
//     String s=sr.nextLine();
//     System.out.println(replacechar(s, 'x', 'y'));

//     }
// }

// import java.util.Scanner;
// public class test1{
//     public static String removeX(String s){
//          if(s.length()==0){
//             return "";
//         }
//         char first_char=s.charAt(0);
//         String smallout=removeX(s.substring(1));
//         return (first_char!='x')? first_char+smallout:smallout;
//     }
//     public static void main(String[] args){
//         Scanner sr=new Scanner(System.in);
//         String s=sr.nextLine();
//         System.out.println(removeX(s));
       
//     }
// }

// import java.util.Scanner;
// public class test1{
//     public static void main(String[] args){
//         Scanner sr=new Scanner(System.in);
//         String s=sr.nextLine();
//         System.out.println(replacepi(s));
//     }

//     public static String replacepi(String s){
//         if(s.length()<=1){
//             return s;
//         }
//         if(s.charAt(0)=='p' && s.charAt(1)=='i'){
//             return "3.14"+replacepi(s.substring(2));
//         }
//         else{
//             return s.charAt(0)+replacepi(s.substring(1));
//         }


//     }
// }

// public class test1{
//     public static void main(String[] args){
//         int[] arr={12,2,56,34,10};
//         int ans=binarySearch(arr, 0, 4, 10);
//         System.out.println(ans);

//     }
//     public static int binarySearch(int[] arr,int si,int ei,int x){
//         if(si>ei){
//             return -1;

//         }
//             int mid=(si+ei)/2;
//             if(arr[mid]==x){
                
//                 return mid;
//             }
            
//             else if(x>arr[mid]){
//                 return binarySearch(arr, mid+1, ei, x);
//             }
//             else {
//                 return binarySearch(arr, si, mid-1, x);
//             }
     
//     }
// }


//MERGE SORT
public class test1{
    public static void main(String[] args){
          
    }
    public static merge_sort(int[] arr)
}