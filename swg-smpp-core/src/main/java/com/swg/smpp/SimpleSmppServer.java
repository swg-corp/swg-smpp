/**
 * 
 */
package com.swg.smpp;

/**
 * @author satriaprayoga
 *
 */
public class SimpleSmppServer extends SmppServer {
	
	public SimpleSmppServer() {
		super(DEFAULT_PORT);
	}

	public SimpleSmppServer(int port) {
		super(port);
	}

	@Override
	protected void listen() throws SmppException {
		// TODO Auto-generated method stub
		
	}

}
