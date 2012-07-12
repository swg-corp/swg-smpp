package com.swg.smpp;

/**
 * Class dasar untuk Server SMPP
 * @author satriaprayoga
 *
 */
public abstract class SmppServer implements Runnable{
	
	protected static final int DEFAULT_PORT=9001;
	
	private boolean asynchronous=false;

	private int port;
	
	public SmppServer(int port) {
		this.port=port;
	}
	
	@Override
	public void run() {
		try{
			listen();
		}catch(SmppException e){
			
		}
	}
	
	protected abstract void listen()throws SmppException;
	
	public int getPort() {
		return port;
	}
	
	
	public boolean isAsynchronous() {
		return asynchronous;
	}
	

}
