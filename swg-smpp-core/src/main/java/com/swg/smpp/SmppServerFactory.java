/**
 * 
 */
package com.swg.smpp;

/**
 * @author satriaprayoga
 *
 */
public interface SmppServerFactory {

	public SmppServer createSmppServer(int port);
}
