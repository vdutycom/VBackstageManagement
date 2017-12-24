package com.vduty.vbackstage;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vduty.vbackstage.utils.RandomUtils;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		
		
		
	
		
	}
	
	@Test
	public void randomTest()
	{
		System.out.println("randomTest");
		
	    
		int[] aint = {1,2,3,5,6,7,8,9,0}; 
		
		/*System.out.println("根据数字生成一个定长的字符串，长度不够前面补0:"
				+ toFixdLengthString(123, 10));
		int[] in = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("每次生成的len位数都不相同:" + getNotSimple(in, 3));*/
				
		
		System.out.println(RandomUtils.toFixdLengthString(RandomUtils.getNotSimple(  aint,8), 8) );
	}

}
