package com.krish.simple.graphs;

public class Vertex {

	private char label;
	private boolean isVisited;
	public Vertex(char label){
		this.label = label;
	}
	public void setVisited(boolean isVisited){
		this.isVisited = isVisited;
	}
	public char getLabel(){
		return this.label;
	}
	public boolean isVisited(){
		return isVisited;
	}
	
}
