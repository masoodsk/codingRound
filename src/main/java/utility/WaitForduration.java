package utility;

public class WaitForduration {
	
	public static void Waitfor(int duration) {

		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
