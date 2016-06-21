package com.krish.simple.graphs;

import java.util.Stack;

public class Graph {

	private int MAX_VERTS = 20;
	private Vertex[] vertexList;
	private int adjMatrix[][];
	private int nVerts;
	private Stack stack;
	
	public Graph(int verts){
		nVerts = 0;
		vertexList = new Vertex[verts];
		adjMatrix = new int[verts][verts];
		this.stack = new Stack();
	}
	public void addVertex(char label){
		vertexList[nVerts++] = new Vertex(label);
	}
	public void addEdge(int start, int end){
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}
	public void displayVertex(int v){
			System.out.print(vertexList[v].getLabel());
	}
	public int getAdjUnvisitedVertex(int v){
		for(int j=0; j<nVerts; j++){
			if(adjMatrix[v][j] == 1 && vertexList[j].isVisited() == false){
				return j;
			}
		}
		return -1;
	}

	public void displayMatrix(){
		for(int row = 0 ; row<adjMatrix.length; row++){
			System.out.println("");
			for(int col =0; col<adjMatrix[row].length; col++){
				System.out.print(adjMatrix[row][col]);
			}
		}
	}
	
	public void dfs(){
		vertexList[0].setVisited(true);
		displayVertex(0);
		stack.push(0);
		while(!stack.isEmpty()){
			Integer k = (Integer)stack.peek();
			int v = getAdjUnvisitedVertex( k );
			if( v == -1){
				stack.pop();
			}else{
				vertexList[v].setVisited(true);
				displayVertex(v);
				stack.push(v);
			}
		}
		for(int j=0; j<nVerts; j++)          // reset flags
	         vertexList[j].setVisited(false);
	}
	
	
}
