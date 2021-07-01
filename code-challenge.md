# Meetical code challenge
## We are going to build a simplified meeting management app 

We will read data from both google or microsoft sources and display it to the user.

To simulate the google and microsoft apis we have 2 json files google-event-data.json and microsoft-event-data.json
In this scenario we are going to have two users "Anna" and "John", Anna uses Google Calendar and John Microsoft.

### Create a web app which shows the following information to end users
As meeting leader I want to see all my meetings from my calendar and be able to take notes for them so I can keep track of any decisions taken during my meetings.

**Acceptance criteria**
1. List all meetings with summary, start date (e.g. "May 5, 2021"), start time (e.g. "16:00"), number of attendees 
2. Allow storing meeting notes as text for any of the events
3. Allow to configure a time zone (an application property would be sufficient) and display date and time in the configured time zone
4. Show min and max start date, and total count of the entire collection of meetings
5. Order meetings by start datetime

**Bonus points**
1. Highlight today's meetings
2. Allow to filter the list of events by attendee email. For example via an input field or dropdown.
3. Show a list of all attendees, and a count for each to show in how many meetings they appear
4. Only show events with 1 or more attendees
5. Group recurring events
6. Specify any additional features you want as acceptance criteria
7. Implement the additional features you specified :)

### Technical information
- The Frontend should use the "Meetical API" format for representing events see meetical-property.json
  - For the challenge only startDateTime, summary, attendeelist.email are required   
- The App does not need to implement Authentication, but should provide the option to switch between the two users / different input json's for demonstration purposes.
- To generate another data set for testing purposes you can use
  the Google OAuth playground and Microsoft Graph explorer.
- If you encounter questions and inaccurate details in the acceptance criteria, always focus on the overall user story. For blockers reach out to us to clarify them.  


