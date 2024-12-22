package daytwo;
import java.util.ArrayList;
import java.util.Date;

	public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class Plane {
		    private int maxPassengers;
		    private ArrayList<String> passengers;
		    private Date lastTimeLanded;

		    public Plane(int maxPassengers) {
		        this.maxPassengers = maxPassengers;
		        this.passengers = new ArrayList<>();
		    }

		    public void onboard(String passenger) {
		        if (passengers.size() < maxPassengers) {
		            passengers.add(passenger);
		            System.out.println(passenger + " has boarded the plane.");
		        } else {
		            System.out.println("Cannot board " + passenger + ". Plane is at full capacity.");
		        }
		    }
		    public Date takeOff() {
		        Date currentTime = new Date();
		        System.out.println("Plane has taken off at: " + currentTime);
		        return currentTime;
		    }
		    public void land() {
		        lastTimeLanded = new Date();
		        passengers.clear();
		        System.out.println("Plane has landed at: " + lastTimeLanded);
		        System.out.println("Passengers have disembarked.");
		    }

		    public Date getLastTimeLanded() {
		        return lastTimeLanded;
		    }

		    public ArrayList<String> getPassengers() {
		        return passengers;
		    }

		    public void main(String[] args) {
		        // Create a Plane object with a max capacity of 5 passengers
		        Plane plane = new Plane(5);

		        plane.onboard("Alice");
		        plane.onboard("Bob");
		        plane.onboard("Charlie");

		        plane.takeOff();

		        plane.land();

		        System.out.println("Last time landed: " + plane.getLastTimeLanded());
		        System.out.println("Current passengers: " + plane.getPassengers());
		    }
		}

	}

}
