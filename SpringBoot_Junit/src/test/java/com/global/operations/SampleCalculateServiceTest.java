package com.global.operations;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

class SampleCalculateServiceTest {
	
	SampleCalculate c = null;
	SampleCalculateService service = Mockito.mock(SampleCalculateService.class);
	
	@Test
	void testSum() {
		when(service.sum(30, 30)).thenReturn(60);
		assertEquals(60, service.sum(30, 30));
//		fail("Not yet implemented");
	}

}
