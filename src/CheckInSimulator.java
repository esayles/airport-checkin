import java.util.ArrayList;
import java.util.Collections;

public class CheckInSimulator {
    ArrayList<Passenger> passengers;

    public static void main(String[] args)
    {
        CheckInSimulator simulator = new CheckInSimulator(200, 120, 2, 6);
        simulator.run();
    }

    public CheckInSimulator(int numPax, int duration, int coachTime, int firstTime)
    {
        passengers = new ArrayList<>(numPax);
        ArrayList<Integer> times = new ArrayList<>(numPax);
        for (int i = 0; i < numPax; i++) {
            times.set(i, (int) (Math.random() * duration));
        }
        Collections.sort(times);
        for (int p = 0; p < numPax; p++) {
            if (Math.random() > 0.2)
                passengers.add(new Passenger(times.get(p), "coach", coachTime));
            else
                passengers.add(new Passenger(times.get(p), "first", firstTime));
        }
    }

    public void run()
    {

    }


}
