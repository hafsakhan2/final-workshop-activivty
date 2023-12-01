public class StandupBot {
    public static void main(String[] args) {
        StandupMeeting meeting = new StandupMeeting("09:00 AM");

        // Add participants
        meeting.addParticipant("Alice");
        meeting.addParticipant("Bob");
        meeting.addParticipant("Charlie");

        // Schedule the meeting
        meeting.scheduleMeeting();
    }
}
