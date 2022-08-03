package com.mypackage.prerak;

import junit.framework.TestCase;
//import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class secondtest extends TestCase {

	public static void main(String[] args) {
		
		
		Pattern p=Pattern.compile(".ak");
		Matcher m=p.matcher(".oak");
		System.out.println(m.matches());
		m=p.matcher("fsok");
		System.out.println(m.matches());
		m=p.matcher(".dfok");
		System.out.println(m.matches());		
	    
		
	   
		
	}
}
