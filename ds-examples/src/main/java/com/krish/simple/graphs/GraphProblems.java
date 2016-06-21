package com.krish.simple.graphs;

public class GraphProblems {

	
	
	public static void main(String args[]){
		
		  Graph theGraph = new Graph(5);
	      theGraph.addVertex('A');    // 0  (start for dfs)
	      theGraph.addVertex('B');    // 1
	      theGraph.addVertex('C');    // 2
	      theGraph.addVertex('D');    // 3
	      theGraph.addVertex('E');    // 4

	      theGraph.addEdge(0, 1);     // AB
	      theGraph.addEdge(1, 2);     // BC
	      theGraph.addEdge(0, 3);     // AD
	      theGraph.addEdge(3, 4);     // DE
	      
	      theGraph.displayMatrix();
	      
	      System.out.println();
	      System.out.print("Visits: ");
	      theGraph.dfs();             // depth-first search
	      
	}
	
}
