package no.hvl.dat110.ac.rest;

public class AccessCode {

	private int[] accesscode = {1,2}; // default access code
	
	public AccessCode() {
		
	}

	public int[] getAccesscode() {
		return accesscode;
	}

	public void setAccesscode(int[] accesscode) {
		this.accesscode = accesscode;
	}

	public void setAccesscode(String param){
		int[] arr = new int[2];
		String[] splitted = param.replaceAll("\\[", "")
				.replaceAll("]", "")
				.split(",");
		arr[0] = Integer.parseInt(splitted[0]);
		arr[1] = Integer.parseInt(splitted[1]);
		this.accesscode = arr;
	}
	
	

}
