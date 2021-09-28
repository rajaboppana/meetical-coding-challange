package com.meetical.client.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.meetical.client.model.google.MeeticalGoogle;
import com.meetical.model.MeeticalObject;

public class MeeticalClientServiceTransformerTest {

	@Test
	public void testTransform() throws Exception {
		// given
		MeeticalGoogle meeticalGoogleObject = getMeeticalGoogleObject();

		// when
		List<MeeticalObject> result = MeeticalClientServiceTransformer.transform(meeticalGoogleObject);

		// then
		assertThat(result).isNotNull();
		assertThat(result.size()).isEqualTo(12);
	}

	private MeeticalGoogle getMeeticalGoogleObject() throws Exception {
		File file = new File(getClass().getResource("test2.json").getFile());
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(file, MeeticalGoogle.class);
	}
}
