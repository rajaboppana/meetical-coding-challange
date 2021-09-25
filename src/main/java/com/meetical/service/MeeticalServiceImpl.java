package com.meetical.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.meetical.client.service.MeeticalClientException;
import com.meetical.client.service.MeeticalClientService;
import com.meetical.model.MeeticalObject;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MeeticalServiceImpl implements MeeticalService {

	private MeeticalClientService meeticalClientService;

    public MeeticalServiceImpl(MeeticalClientService meeticalClientService) {
		this.meeticalClientService = meeticalClientService;
	}

	@Override
    public List<MeeticalObject> getMeetings(String user) throws MeeticalException {

    	List<MeeticalObject> meeticalObjects;
		try {
			meeticalObjects = meeticalClientService.getMeetings(user);

			if(meeticalObjects == null) {
				throw new MeeticalException();
			}
		} catch (MeeticalClientException e) {
			log.error("", e);
			throw new MeeticalException(e);
		}

		return meeticalObjects;
    }

}
