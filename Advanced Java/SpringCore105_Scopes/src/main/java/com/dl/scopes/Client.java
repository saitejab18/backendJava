package com.dl.scopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
  public static void main(String[] args) {
         ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/scopes/app.xml");
         Honda honda1 = (Honda) context.getBean("id1");
         System.out.println(honda1);
         System.out.println(honda1.hashCode());
         
         Honda honda2 = (Honda) context.getBean("id1");
         System.out.println(honda2);
         System.out.println(honda2.hashCode());
         
         
         ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("com/dl/scopes/app.xml");
         Honda honda3 = (Honda) context.getBean("id2");
         System.out.println(honda3);
         System.out.println(honda3.hashCode());
         
         Honda honda4 = (Honda) context.getBean("id2");
         System.out.println(honda4);
         System.out.println(honda4.hashCode());
         
         context1.close();
         context.close();
         
         
}
}
