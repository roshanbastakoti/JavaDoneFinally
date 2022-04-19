public class thiskeyword1 {
  
    
      
         String name;
         int age;
      

        public thiskeyword1(String name, int age)
        {
            
            this.name = name;
            this.age = age;
        }
      
        public void show()
        {
            System.out.println("Name = " + this.name);
            System.out.println("Age = " + this.age);
        }
      
        public static void main(String[] args)
        {
            thiskeyword1 T = new thiskeyword1("Roshan", 21);
            T.show();
        }
    }
    

