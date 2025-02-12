package br.com.threads;

public class ThreadByRunnable implements Runnable {

	
	@Override
	public void run() {

		System.out.println("Implementando uma interface runnable");
		
	}
	
	public static void main (String[] args) {
		
		ThreadByRunnable br1 = new ThreadByRunnable();
		
		Thread th = new Thread(br1);
		th.start();
				
	}

	
}
