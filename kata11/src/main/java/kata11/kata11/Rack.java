package kata11.kata11;

public class Rack {
	
	int[] rack = new int[]{};

	
public int[] addBalls(int ball[])
	
	{
		if (ball.length > 0 && ball.length < 60)
		{
			SortingMachine.bubbleSort(ball);
		}
		
		return ball;
	}
}
