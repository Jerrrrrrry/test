package test;

import org.junit.Test;
import org.mockito.Mockito;

public class TestA {

	@Test
	public void testmethod()
	{
		A a = Mockito.mock(A.class);
		C c = new C();
		c.setName("mocked");
		Mockito.when(a.process()).thenReturn(c);
		
	}
}
