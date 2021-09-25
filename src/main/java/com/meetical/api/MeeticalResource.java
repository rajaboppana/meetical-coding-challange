package com.meetical.api;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meetical.api.transfer.MeeticalAPIErrorTransfer;
import com.meetical.api.transfer.MeeticalResponseTransfer;
import com.meetical.model.MeeticalObject;
import com.meetical.service.MeeticalException;
import com.meetical.service.MeeticalService;

@RestController
public class MeeticalResource {

	private static final String V1 = "v1";
	private static final String MEETICAL = "meetical";

	private MeeticalService meeticalService;

	public MeeticalResource(MeeticalService meeticalService) {
		this.meeticalService = meeticalService;
	}

	@PostMapping(value = "/" + V1 + "/" + MEETICAL + "/" + "{user}")
	public MeeticalResponseTransfer getMeetings(@PathVariable("user") String user) {

		List<MeeticalObject> meeticalObjectList;
		try {
			meeticalObjectList = meeticalService.getMeetings("anna");

			MeeticalResponseTransfer meeticalResponseTransfer = new MeeticalResponseTransfer();
			meeticalResponseTransfer.setMeeticalObject(meeticalObjectList);
			return meeticalResponseTransfer;

		} catch (MeeticalException e) {
			MeeticalResponseTransfer meeticalResponseTransfer = new MeeticalResponseTransfer();

			MeeticalAPIErrorTransfer meeticalAPIErrorTransfer = new MeeticalAPIErrorTransfer();
			meeticalAPIErrorTransfer.setErrorMessage(e.getMessage());

			meeticalResponseTransfer.setMeeticalErrorTransfer(meeticalAPIErrorTransfer);

			return meeticalResponseTransfer;
		}

	}
}
