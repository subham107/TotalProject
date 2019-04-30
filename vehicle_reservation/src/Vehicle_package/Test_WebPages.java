package Vehicle_package;

import net.sourceforge.jwebunit.util.TestingEngineRegistry;
import static net.sourceforge.jwebunit.junit.JWebUnit.*;
import org.junit.Before;
import org.junit.Test;

public class Test_WebPages 
{
	@Before
	public void Prepare()
	{
		setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT);
		setBaseUrl("http://localhost:9080/vehicle_reservation");
	}
	
	@Test
	public void testLoginPage()
	{
		beginAt("login.jsp");
		assertTitleEquals("Login page");
		assertLinkPresent("Registration.jsp");
		clickLink("New user register here");
		assertTitleEquals("Admin Registration"); 
	}
}
