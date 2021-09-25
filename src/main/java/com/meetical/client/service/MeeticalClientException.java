package com.meetical.client.service;

public class MeeticalClientException extends Exception {

	private static final long serialVersionUID = 1L;

	public MeeticalClientException() {
		super();
	}

	public MeeticalClientException(Exception e) {
		super(e);
	}

	public MeeticalClientException(String message) {
		super(message);
	}

	public MeeticalClientException(Throwable cause) {
		super(cause);
	}


}
