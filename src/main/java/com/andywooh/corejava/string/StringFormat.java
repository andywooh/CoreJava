package com.andywooh.corejava.string;

import java.text.MessageFormat;
import org.junit.Test;

/**
 * 其中MessageFormat.format()对{}敏感，若字符串中包含{}则需考虑String.format()
 * @author wuuuxjia
 */
public class StringFormat {
	
	@Test
	public void test(){
		stringFormat();
		messageFormat();
	}
	
	public void stringFormat() {
		String json  = String.format("Hello, %s, you are %d years old", "Jack", 12);
		System.out.println(json);
	}
	
	public void messageFormat() {
		String json2 = MessageFormat.format("Bye, {0}, my luckky number is {1}", "Rose", 7);
		System.out.println(json2);
	}

}
