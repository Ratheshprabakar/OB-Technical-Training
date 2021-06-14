package com.onebill.Spring.Mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onebill.Spring.Mobile.bean.Mobile;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("allConfig.xml");
    	Mobile bean = (Mobile) applicationContext.getBean("mobile");
    	bean.getCharger().setPercentage(50);
    	System.out.println(bean.getCharger().getPercentage());
    	System.out.println("Using The Phone Until the phone dies");
    	bean.use();
    	System.out.println("Charging the Phone again");
    	bean.getCharger().charging();    
    }
}
