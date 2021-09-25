package com.meetical.api.transfer;

import java.util.List;

import com.meetical.model.MeeticalObject;

import lombok.Data;

@Data
public class MeeticalResponseTransfer {
	
	private List<MeeticalObject> meeticalObject;
	private MeeticalAPIErrorTransfer meeticalErrorTransfer;

}
