package com.onebill.training.day6;
class ErrorMsg{
	final int INDEXERR = 0;
	final int OUTERR = 1;
	final int INNERR = 2;
	final int DISKRR = 3;
	
	String[] errorMessage = {"Index Error","Output Error","Input Error","Disk Error"};
	String getErrorMessage(int i) {
		if(i>=0 && i<errorMessage.length) {
			return errorMessage[i];
		}
		return "Invalid Code";
	}
}

public class FinalVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ErrorMsg er1= new ErrorMsg();
		System.out.println(er1.getErrorMessage(er1.INDEXERR));

	}

}
