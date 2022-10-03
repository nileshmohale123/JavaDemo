package com.yash.springfirstapp7;
/**
 * @author nilesh.mohale
 *
 */
public class BinaryEquant {
public String findBinaryEquant(int num) {
		
		int temp=num,rem;
		String binary="";
		rem=temp%2;
		binary+=Integer.toBinaryString(num);
		return binary;
	}
}
