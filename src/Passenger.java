public class Passenger {
    private int arrivalTime;
    private int timeWaiting;
    private int timeToCheckIn;
    private String boardingGroup;
    private boolean checkedIn;

    public Passenger(int arrivalTime, String boardingGroup, int timeToCheckIn) {
        this.arrivalTime = arrivalTime;
        this.boardingGroup = boardingGroup;
        this.timeToCheckIn = timeToCheckIn;
        this.timeWaiting = 0;
        this.checkedIn = false;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getTimeWaiting() {
        return timeWaiting;
    }

    public void setTimeWaiting(int timeWaiting) {
        this.timeWaiting = timeWaiting;
    }

    public String getBoardingGroup() {
        return boardingGroup;
    }

    public void setBoardingGroup(String boardingGroup) {
        this.boardingGroup = boardingGroup;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public int getTimeToCheckIn() {
        return timeToCheckIn;
    }

    public void setTimeToCheckIn(int timeToCheckIn) {
        this.timeToCheckIn = timeToCheckIn;
    }
}
