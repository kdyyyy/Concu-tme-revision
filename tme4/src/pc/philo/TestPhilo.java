package pc.philo;

public class TestPhilo {

	public static void main (String [] args) {
		final int NB_PHIL = 5;
		Thread [] tPhil = new Thread[NB_PHIL];
		Fork [] tChop = new Fork[NB_PHIL];

		for(int i=0; i<NB_PHIL; i++) {
			 tChop[i]=new Fork();
		}
		
		for(int i=0; i<NB_PHIL; i++) {
			 tPhil[i]= new Thread(new Philosopher(tChop[i], tChop[i+1]));
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Thread t : tPhil) {
			t.start();
		}
		
		
		for(Thread t : tPhil) {
			t.interrupt();
		}
		try {
		for(Thread t : tPhil) {
			t.join();
		}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Fin du programme");

	}
}