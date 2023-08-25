package com.dl.two;


          public class Employe 
{
		int id;
          String name;

        public Employe() 
        {
         }
        
          public Employe(int id, String name)  
        {
			super();
			this.id = id;
			this.name = name;
		}

         @Override
         public String toString()
         {
        return "Employee [id=" + id + ", name=" + name + "]";
         }
}
        
			
			

