package com.Projects;
import java.io.IOException;
import java.util.*;


public class CodeChefApplication {

	public static void main(String[] args) throws IOException {
	
	   Scanner sc = new Scanner(System.in);
		String uid = sc.next();
		CodeChefManager dataManager = new CodeChefManager();
		try {
		dataManager.setuserId(uid);
		}catch(Exception e)
		{
			System.out.println(e);
			return ;
		}
		System.out.println("UserNAme : " +dataManager.getuserName());
		System.out.println("Current Rating : "+dataManager.getuserCurrentrating());
		
		System.out.println("fully solved problems count : "+dataManager.fullySolvedcount());
		List<String> solvedProblems = dataManager.getProblemsolved();
		System.out.println("fully solved problems : ");
		for(String s  : solvedProblems)
		{
			System.out.println(s);
		}
		System.out.println("partially solved problems count : "+dataManager.partialSolvedcount());
		
		
	
		
	}

}
