package Graph;

import java.util.ArrayList;

/*
 *  Graph : Network of Nodes    
 *  Nodes = Vertices
 *  Connection = Edges  => Undirected/Bidirected, Directed, 
 *  Weight = can represent Time/Distance
 * 
 *  Graph => Directed and Undirected graph 
 *  
 * Storing Graph 
 * 1. Adjacency List : Array of ArrayList of Edge type, Edge is having Source and Destination  
 * 2. Adjacency Matrix
 * 3. Edge List
 * 4. 2D Matrix 
 * 
 */

/*  
    0 -> {0,2}
    1 -> {1,2}, {1,3}
    2 -> {2,0}, {2,1}, {1,3}
    3 -> {3,1}, {3,2}
*/

public class GraphAdjListDemo1 {
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    } 
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();       // making Empty Array list
        }

        graph[0].add(new Edge(0, 2));
        
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    public static void main(String[] args) {
        
        // To represent Undirected unweighted Graph  = Adjacency List
        int N = 4;
        ArrayList<Edge> graph[] = new ArrayList[N]; 

        // for (ArrayList<Edge> e : graph) {
        //     System.out.println(e);              // Array will be initailized with null values of ArrayList by deafult
        // }

        createGraph(graph);

        for(int i=0; i<graph[2].size(); i++){
            Edge edge = graph[2].get(i);
            System.out.println("2->"+edge.dest);
        }
    }
}
