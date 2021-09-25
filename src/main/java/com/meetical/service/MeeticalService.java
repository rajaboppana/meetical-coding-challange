package com.meetical.service;

import java.util.List;

import com.meetical.model.MeeticalObject;

public interface MeeticalService {

    public List<MeeticalObject> getMeetings(String user) throws MeeticalException;
}
