import java.util.Random;import java.util.Scanner;import java.util.ArrayList;import java.util.Date;
class Math{
    public static void main(String args[]){
     Math[] mymath = new Math[10];
     for (int i=0; i<mymath.length;i++){
        mymath[i]=new Math();
     }
}
}
class random{
   public static void main(String[] args) {
      Random rr=new Random();
      System.out.println("display random num 50 from 0 to 100");
      for (int i=0;i<=5;i++){
        System.out.println("the random no ange under 0 to 100 : " +  rr.nextInt(100));
      }
      

   }
}

class twodarray{
   int a[][]=new int[3][3];
   public void getData(){
      Scanner sc=new Scanner(System.in);
      int i,j;

      for(i=0;i<3;i++){
         for (j=0;j<3;j++){
            System.out.println("enter no;");
            a[i][j]=sc.nextInt();
         }
      }


   }
   public void putdata(){
      int i,j;
      for(i=0;i<3;i++){
         for(j=0;+j<3;j++){
            System.out.println(a[i][j] +"------");
         }
         System.out.println();
      }
   }
   public static void main(String args[]){
   
       twodarray h=new twodarray();
      
    h.getData();
      h.putdata();

   }
}
class loan{
   double amount;
   public loan(double amount){
      this.amount=amount;
   }
   public String toString(){
      return "amount"+ amount;
   }

}
class circle{
   double radius;
   public circle(double radius){
      this.radius=radius;
   }
   public String toString(){
     return "radius"+radius;
   }
}
class test{
   public static void main(String[] args) {
      ArrayList <Object> mixed= new ArrayList<Object>();
      mixed.add(new loan(400.0));
      mixed.add(new Date());
      mixed.add(new circle(3.4));
      for(Object i: mixed ){
         System.out.println(i);
      }

   }
}
class date1{
   public static void main(String[] args) {
      Date date=new Date();
      System.out.println(System.currentTimeMillis()/1000/3600/24/365);
   }
}