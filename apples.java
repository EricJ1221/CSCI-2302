

class apples{
   public static void main(String[] args) {
      int bucky[] = {3, 4, 5, 6, 7};
      change(bucky);
      
      for(int y:bucky)
         System.out.println(bucky.length);
   }

   public static void change(int x[]){
      for(int counter=0; counter<x.length; counter++)
         x[counter]+=5;
   
   }

}//just changes the numbers of the array doesn't dynamically increase the size
