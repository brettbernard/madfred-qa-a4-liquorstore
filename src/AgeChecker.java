
import javax.swing.JOptionPane;

public class AgeChecker {

	public static void main(String[] args) {
		String firstName = JOptionPane.showInputDialog(null, "What is your first name?");
		String lastName = JOptionPane.showInputDialog(null, "What is your last name?");
		int yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog(null, "What year were you born?"));
		
		String fullName = concatenateNames(firstName,lastName);
		boolean oldEnough = verifyLegalAge(yearOfBirth);
		
		if(oldEnough == true) {
			JOptionPane.showMessageDialog(null, fullName + " , your may proceed with your shopping");
		} else {
			JOptionPane.showMessageDialog(null, fullName + " , you're not old enough. Try disney.com instead!");
		}

	}
	
	public static String concatenateNames(String fn, String ln) {
		String fullName = fn + " " + ln;
		return fullName;
	}
	public static boolean verifyLegalAge(int yob) {
		boolean legalAgeStatus = (2013 - yob) >=19;
		return legalAgeStatus;
	}
}
