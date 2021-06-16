/**
 * 
 */
package com.onebill.Spring.JAXBXML;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.onebill.Spring.bean.EmployeeInfoBean;

/**
 * @author rathesh
 *
 */
public class EmployeeMarshelling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeInfoBean infoBean = new EmployeeInfoBean();
		
		infoBean.setName("Rathesh");

		try {
			// Step 1
			JAXBContext context = JAXBContext.newInstance(EmployeeInfoBean.class);
			// Step 2
			Marshaller m = context.createMarshaller();
			// Step 3
			m.setProperty(m.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(infoBean, System.out);
			m.marshal(infoBean, new File("employee.xml"));

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
