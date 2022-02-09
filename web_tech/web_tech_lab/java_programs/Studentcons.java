class Studentcons{
    int id;
    String name;
    int age;
    int bran;
   	 Studentcons(int i,String n) //constructor1
    	{
    	 id = i;
   	 name = n;
   	 }
   	 Studentcons(int i,String n,int a) //constructor2
   	 {
   	 id = i;
   	 name = n;
    	age=a;
    	 }
       Studentcons(int i,String n,int a, int branch) //constructor2
   	 {
   	 id = i;
   	 name = n;
    	age=a;
   bran=branch;
    	 }
    void display() //method
    {
      System.out.println(id+" "+name+" "+age);
     }
 
    public static void main(String args[]){
    Studentcons s1 = new Studentcons(111,"Karan");
  
    Studentcons s2 = new Studentcons(222,"Aryan",25);
    s1.display();
    s2.display();
   }
}
