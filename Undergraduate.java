/******************************************************

name: Eric Oliver

name of file: HW7

**Description: This program contains my child class, Undergraduate, it contains an overloaded constructor and a few methods to set variables and print to a string.

*******************************************************/

class Undergraduate extends Student{
   private String sClass;
   
   Undergraduate(String studentName, String studentMajor, String studentClass){
      super(studentName, studentMajor);
      this.sClass = studentClass;
   }
   public void setStudentClass(String studentClass){
      this.sClass = studentClass;
   } 
   public String getStudentClass(){
      return sClass;
   }
   public String toString(){ 
      return super.toString() + "\nThe students classification is " + this.sClass;
   }
 
}