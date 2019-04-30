package Vehicle_package;
import static org.junit.Assert.*;  

import org.junit.*;  
import static org.junit.Assert.assertEquals;  
import org.junit.After;  
import org.junit.AfterClass;  
import org.junit.Before;  
import org.junit.BeforeClass;  
import org.junit.Test;  

public class TestDAO 
{
	@Test
	public void testA()
	{		
		Vehicle v=new Vehicle();
		v.setBranch("B");
		v.setInsurance_expiry("2019-11-03");
		v.setLast_serviced_date("2019-11-10");
		v.setService_due_date("2019-12-15");
		v.setVehicleno("2");
		v.setVehicletype("Abc");
		assertEquals(1, VehicleDAO.SaveVehicleDetails(v));
	}
	@Test
	public void testB()
	{
		User v=new User();
		v.setEmployeeid("1");
		v.setFirstname("subham");
		v.setLastname("pandey");
		v.setAge(23);
		v.setGender("Male");
		v.setPhone(111);
		v.setEmailid("subhampandey1@gmail.com");
		v.setPassword("1");
		v.setBranch("1");
		assertEquals(1,VehicleDAO.SaveDetails(v));
	}
}
