package com.wipro.doconnect.exception;

/**
*
*@author Anuj
*/

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class NotFound extends RuntimeException {

	public NotFound(String string) {
		// TODO Auto-generated constructor stub
	}
	public NotFound() {
		// TODO Auto-generated constructor stub
	}
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String errorMsg;

}
