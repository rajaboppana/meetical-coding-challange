
package com.meetical.client.model.google;

import java.util.List;

import lombok.Data;

@Data
public class MeeticalGoogle {

	public String kind;
	public String etag;
	public String summary;
	public String updated;
	public String timeZone;
	public String accessRole;
	public List<DefaultReminder> defaultReminders;
	public String nextPageToken;
	public List<Item> items;

}
