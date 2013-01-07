package org.marinespecies;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import junit.framework.Assert;
import org.junit.Test;
 
public class TestApp3 {
 
	@Test
	public void test() {
		AphiaServiceService aphiaService = new AphiaServiceServiceLocator();		
		//String aphiaName="";
		try {
			AphiaServiceInterface aphiaPort = aphiaService.getAphiaServicePort();
			double a = System.nanoTime ();
			//aphiaName = aphiaPort.getAphiaNameByID(2);
			Assert.assertEquals(aphiaPort.getAphiaNameByID(2), "Animalia");
			Assert.assertEquals(aphiaPort.getAphiaID("Animalia", true),2);
			Assert.assertEquals(aphiaPort.getAphiaNameByID(1),"Biota");
			Assert.assertEquals(aphiaPort.getAphiaID("Animalia", true),2);
			
			double b = System.nanoTime ();
			System.out.println((b-a)/1000000000);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(aphiaName);
		//Assert.assertEquals(aphiaName, "Animalia");
 
	}
 
}
