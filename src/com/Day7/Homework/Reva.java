//Constructor Overloading

package com.Day7.Homework;

public class Reva 
{
	
	private String BranchName;
	private String BlockName;
	
	
	public Reva() {
		BranchName=null;
		BlockName=null;
		
	}

	
	
	public Reva(String branchName) {
		BranchName = branchName;
	}



	public Reva(String branchName, String blockName) {
		super();
		BranchName = branchName;
		BlockName = blockName;
	}


	@Override
	public String toString() {
		return "Reva [BranchName=" + BranchName + ", BlockName=" + BlockName + "]";
	}


}
