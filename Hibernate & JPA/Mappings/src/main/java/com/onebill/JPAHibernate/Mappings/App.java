package com.onebill.JPAHibernate.Mappings;

import java.util.Scanner;

import com.onebill.JPAHibernate.ManyToMany.ManyToMany;
import com.onebill.JPAHibernate.ManyToOne.ManyToOne;
import com.onebill.JPAHibernate.OnetoMany.OneToMany;
import com.onebill.JPAHibernate.OnetoOne.OneToOne;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        	Scanner input = new Scanner(System.in);
        	System.out.println("Enter Your Choice\t 1.One to One\n 2.One to Many\n 3.Many to One\n 4.Many to Many\n");
        	int choice = input.nextInt();
        	
        	switch(choice) {
        	case 1:
        		OneToOne.main(args);
        		break;
        	case 2:
        		OneToMany.main(args);
        		break;
        	case 3:
        		ManyToOne.main(args);
        		break;
        	case 4:
        		ManyToMany.main(args);
        		break;
        	default:
        		System.out.println("Invalid Choice");
        	}
        	
        	input.close();
    }
}
