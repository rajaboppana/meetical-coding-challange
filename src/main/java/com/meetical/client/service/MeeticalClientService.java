package com.meetical.client.service;

import java.util.List;

import com.meetical.model.MeeticalObject;

public interface MeeticalClientService {

	public List<MeeticalObject> getMeetings(String user) throws MeeticalClientException;

}
