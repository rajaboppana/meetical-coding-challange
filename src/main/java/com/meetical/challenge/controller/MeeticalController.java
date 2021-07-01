package com.meetical.challenge.controller;

import com.meetical.challenge.meetical.pojo.MeeticalObject;
import com.meetical.challenge.service.MeeticalService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/meetical/v1")
public class MeeticalController {

    private MeeticalService meeticalService;

    public MeeticalController(MeeticalService meeticalService) {
        this.meeticalService = meeticalService;
    }

    @GetMapping(produces = "application/json")
    @ResponseBody
    public List<MeeticalObject> getMeetings(String user) {

        List<MeeticalObject> meeticalObjectList = meeticalService.getMeetings("anna");

        return meeticalObjectList;
    }
}
