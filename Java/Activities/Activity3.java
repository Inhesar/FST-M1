package daytwo;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        long seconds = 1000000000;
		
		long mercuryYearSeconds = 7600524;
        long venusYearSeconds = 19414149;
        long earthYearSeconds = 31557600;
        long marsYearSeconds = 59355000;
        long jupiterYearSeconds = 374355659;
        long saturnYearSeconds = 929292360;
        long uranusYearSeconds = 2651370010L;
        long neptuneYearSeconds = 5200418560L;
        
        double mercuryAge = (double) seconds / mercuryYearSeconds;
        double venusAge = (double) seconds / venusYearSeconds;
        double earthAge = (double) seconds / earthYearSeconds;
        double marsAge = (double) seconds / marsYearSeconds;
        double jupiterAge = (double) seconds / jupiterYearSeconds;
        double saturnAge = (double) seconds / saturnYearSeconds;
        double uranusAge = (double) seconds / uranusYearSeconds;
        double neptuneAge = (double) seconds / neptuneYearSeconds;

        System.out.println("Age on Mercury: " + mercuryAge + " years.");
        System.out.println("Age on Venus: " + venusAge + " years.");
        System.out.println("Age on Earth: " + earthAge + " years.");
        System.out.println("Age on Mars: " + marsAge + " years.");
        System.out.println("Age on Jupiter: " + jupiterAge + " years.");
        System.out.println("Age on Saturn: " + saturnAge + " years.");
        System.out.println("Age on Uranus: " + uranusAge + " years.");
        System.out.println("Age on Neptune: " + neptuneAge + " years.");
    }
}


