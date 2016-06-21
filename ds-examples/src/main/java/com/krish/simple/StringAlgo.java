package com.krish.simple;

public class StringAlgo {

	public static void main(String[] args){
		String s = "KAVAKA";
		char[] c = s.toCharArray();
		char[] t = new char[c.length];
		for(int i = c.length -1,j=0 ;i>=0;i--,j++){
			t[j] = c[i];
		}
		String s1 = new String(t);
		System.out.println(s1);
	}
}
