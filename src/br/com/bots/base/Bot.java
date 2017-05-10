package br.com.bots.base;

public abstract class Bot {
	
	protected int interval = 1000; // Default loop of 1 second
	protected boolean isAlive;
	
	protected abstract void loop();
	
	
	public void start(){
		isAlive = true;

		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(isAlive){
					delay(interval);
					loop();
				}
			}
		}).start();
	}
	
	public void stop(){
		isAlive = false;
	}
	
	public void setInterval(int interval){
		this.interval = interval;
	}
	
	public int getInterval(){
		return interval;
	}
	
	private void delay(int interval) {
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
