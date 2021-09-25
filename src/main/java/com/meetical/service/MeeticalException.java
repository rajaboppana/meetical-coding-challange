package com.meetical.service;

public class MeeticalException extends Exception {

	private static final long serialVersionUID = 1L;

	public MeeticalException() {
		super();
	}

	public MeeticalException(Exception e) {
		super(e);
	}

	public MeeticalException(String message) {
		super(message);
	}

	public MeeticalException(Throwable cause) {
		super(cause);
	}


}
