package com.neurogine.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 {
	
	public String stringToUpperCaseAndJoinComma(String[] strArr) {
		
		//using Stream functionality with method reference
		String result = Arrays.stream(strArr).map(String::toUpperCase)
				.collect(Collectors.joining(","));
		System.out.println("Expected Result with Empty String :- { "+result+" }");
		
		
		//implemented using streams, method reference(functional),collectors
		//improvised removing empty strings
		String resultwithNoEmptyString = Arrays.stream(strArr).
				filter(s-> !s.isEmpty())
				.map(String::toUpperCase)
				.collect(Collectors.joining(","));
		
		return resultwithNoEmptyString;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question1 ques1=new Question1();
		String[] str= new String[] {"abc","an","","apple","bcd","","jk"};
		
		System.out.println("Non Empty UpperCase String "
			+ "joined with Comma :- { "+ ques1.stringToUpperCaseAndJoinComma(str)+" }");
				
		//Strings with length more than 2
		List<String> stringList = Arrays.stream(str)
				.filter(st->st.length()>2).toList();
		
		System.out.println("List of Strings with more than 2 characters: " + stringList);

		//No of Strings starting with letter 'a'		
		long stringCountStartsWithA= Arrays.stream(str)
				.filter(s->s.startsWith("a"))
				.count();
		System.out.println("String count starting with 'a' : "+stringCountStartsWithA);
		
		//No of String that are empty
		
		long emptyStringCount= Arrays.stream(str)
				.filter(String::isEmpty)
				.count();
		System.out.println("No of Empty Strings : "+emptyStringCount);
		
	}

} 
