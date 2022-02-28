/*Write a program in Java to define a class Number with appropriate data 
members and member functions to input n number of integers 
and swap the biggest and smallest elements. Use member 
functions read (), swap () and display ().*/


import java.util.*;
 class number {
     int[] arr;
     void read(int n){
         Scanner sc=new Scanner(System.in);
         arr=new int[n];
         System.out.println("enter integers");
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         sc.close();
     }
     void swap(){
        int big=arr[0];
        int bigpos=0;
        int small=arr[0];
        int smallpos=0;
        int temp;
       for(int i=1;i<arr.length;i++)
       {
           if(arr[i]>big)
           {
               big=arr[i];
               bigpos=i;
           }
           if(arr[i]<small){
               small=arr[i];
               smallpos=i;

           }
        }
           temp=arr[bigpos];
           arr[bigpos]=arr[smallpos];
           arr[smallpos]=temp;
       
     }
      void display(){
          for(int i=0;i<arr.length;i++)
          {
              System.out.print(arr[i]+" ");
          }
          
      }
      public static void main(String[] args) {
          number obj=new number();
          Scanner sc=new Scanner(System.in);
          System.out.println("enter number of integers ");
          int n1=sc.nextInt();
          obj.read(n1);
          System.out.println("before swap");
          obj.display();
          obj.swap();
          System.out.println("\n after swap");
          obj.display();
          sc.close();
      }
}