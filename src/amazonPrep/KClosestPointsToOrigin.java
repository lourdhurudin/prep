package amazonPrep;

import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
	
	    public int[][] kClosest(int[][] points, int k) {
	    	int[][] result = new int[k][2];
	    	PriorityQueue<int[]> heap = new PriorityQueue<int[]>((a,b)->(b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]));
	    	for(int[] point:points) {
	    		heap.add(point);
	    		if(heap.size()>k)
	    			heap.remove();
	    	}
	    	
	    	while(k-->0)
	    		result[k] = heap.remove();
	    		
	        return result;
	    }
	
	    
	    public static void main(String args[]) {
	    	int[][] points = new int[][] {{1,3},{-2,2}};
	    	int k =1;
	    	int[][] result = new KClosestPointsToOrigin().kClosest(points, k);
	    	
	    	for(int[] i:result )
	    		System.out.println( i[0]+","+i[1]);
	    }
}
