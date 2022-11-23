package com.surya.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList <String> word = new ArrayList<String>();
  word.add("surya kant pandey");
  word.add(" ras bihari pandey");
  word.add(" tribhuwan  pandey");
  word.add("murlidhar  pandey");
  word.add("umashankar pandey");
  
  for(String temp : word) {
	  System.out.println(temp);
  }
  LinkedList<Integer> words1 =  new LinkedList <Integer>();
  words1.add(125);
  words1.add(130);
  words1.add(135);
  words1.add(140);
  
  for(int temp1 : words1) {
	  System.out.println(temp1);
  }
  

	}

}
