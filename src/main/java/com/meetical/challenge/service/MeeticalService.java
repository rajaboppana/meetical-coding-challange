package com.meetical.challenge.service;

import com.meetical.challenge.meetical.pojo.MeeticalObject;

import java.util.List;

public interface MeeticalService {

    public List<MeeticalObject> getMeetings(String user);
}
