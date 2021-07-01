package com.meetical.challenge.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.model.Event;
import com.meetical.challenge.google.pojo.GoogleJsonObject;
import com.meetical.challenge.service.MeeticalGoogleEventsImpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        MeeticalGoogleEventsImpl meeticalGoogleEvents = new MeeticalGoogleEventsImpl();
        meeticalGoogleEvents.getMeetings("anna");

    }
}
