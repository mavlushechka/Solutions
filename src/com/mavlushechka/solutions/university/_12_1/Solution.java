public class Solution {
	
	public static void main(String[] args) {
		int[][] dimensions = {
			{ 1, 2, 3 },
			{ 1, 5 },
			{ 1, 4, 9 }
		};
		Graph graph = new Graph(dimensions);
		System.out.println(graph.getMin());
	}
}

class Graph {
	
	private final int[][] dimensions;

	private int min;

	Graph(int[][] dimensions) {
		this.dimensions = dimensions;
		setMin();
	}

	public int getMin() {
		return min;
	}

	private void setMin() {
		int min = Integer.MAX_VALUE;
		for (int[] perDimensions : dimensions) {
			if (min > perDimensions.length) {
				min = perDimensions.length;
			}
		}
		this.min = min;
	}
}
