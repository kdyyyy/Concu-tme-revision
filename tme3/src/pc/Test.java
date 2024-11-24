/**
 * 
 */
package pc;

/**
 * 
 */
public class Test {

	public static void main(String[] args) {
		
		
	}
	
	public void runConcurrentTest(IList<String> list, int N, int M) {
		List<Thread> threads = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			threads.add(new Thread ( ()-> {
				for
			}))
		}
	}

	
	private static class Worker implements Runnable{
		private int nbElem;
		private IList<String> list;
		
		public Worker(int m, IList<String> l) {
			nbElem=m;
			list=l;
		}
		public void run() {
			for(int i =0; i<m; i++) {
				
			}
		}
	}
	
}
