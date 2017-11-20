package testcorehome;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import corehome.CoreHome;

public class TestCoreHome {
	
	private String resuname;
	private String expuname = "Mandar";
	
	@Test
	public void testUserName(){
		
		CoreHome ch = new CoreHome();
		resuname = ch.displayUser(1);
		assertEquals(expuname,resuname);
	}

}
