import java.util.*;
import java.lang.Math.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        
        double basic_salary;
        double total_salary;
        double hra,da,allow,pf;
        String s;
        Scanner sc=new Scanner(System.in);
        basic_salary=sc.nextInt();
        s=sc.next();
        char grade=s.charAt(0);
        if(basic_salary>=0 && basic_salary<=7500000 && grade>=65 && grade<=90)
        {
            hra=basic_salary*20/100;
            da=basic_salary*50/100;
            if(grade==65)
               {
                  allow=1700; 
               }
            else if(grade==66)
            {
                allow=1500;
            }
            else
            {
                allow=1300;
            }
            pf=basic_salary*11/100;
            
            total_salary=basic_salary+hra+da+allow-pf;
          System.out.println(Math.round(total_salary));
           
           
           
            
            
        }
	}
}
