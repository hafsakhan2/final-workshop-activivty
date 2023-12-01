import java.util.ArrayList;
import java.util.List;

public class StandupMeeting {
    private String time;
    private List<String> participants;

    public StandupMeeting(String time) {
        this.time = time;
        this.participants = new ArrayList<>();
    }

    public void addParticipant(String participant) {
        participants.add(participant);
    }

    public void scheduleMeeting() {
        System.out.println("Standup meeting scheduled at " + time);
        System.out.println("Participants: ");
        for (String participant : participants) {
            System.out.println(participant);
        }
    }
}
