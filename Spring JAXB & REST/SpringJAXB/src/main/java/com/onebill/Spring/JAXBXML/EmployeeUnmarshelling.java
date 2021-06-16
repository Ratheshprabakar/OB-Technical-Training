/**
 * 
 */
package com.onebill.Spring.JAXBXML;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.onebill.Spring.bean.EmployeeInfoBean;

/**
 * @author rathesh
 *
 */
public class EmployeeUnmarshelling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//EmployeeInfoBean infoBean = new EmployeeInfoBean();

		try {
			// Step 1
			JAXBContext context = JAXBContext.newInstance(EmployeeInfoBean.class);
			// Step 2
			Unmarshaller  m = context.createUnmarshaller();
			// Step 3

			EmployeeInfoBean bean = (EmployeeInfoBean) m.unmarshal( new File("employee.xml"));

			System.out.println(bean.getName());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
