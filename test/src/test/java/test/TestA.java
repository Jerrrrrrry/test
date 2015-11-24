package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.testng.Assert;

@RunWith(PowerMockRunner.class)
@PrepareForTest(A.class)
public class TestA {

	@Test
	public void testmethod()
	{
		A a = PowerMockito.mock(A.class);
		C c = new C();
		c.setName("mocked");
		PowerMockito.when(a.process()).thenReturn(c);

        C c1 = a.process();
        Assert.assertEquals(c1.getName(), c.getName());
    }
}
