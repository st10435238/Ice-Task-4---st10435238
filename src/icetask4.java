import javax.swing.*;

public class icetask4 {
	
	public static void main(String[] args) {
		
		// General Remarks:
		
		// Notice that CAPITALIZATION of letters/characters is IMPORTANT when comparing String variables
		// You may enhance the logic so that *case* is ignored, if you so desire.
		// You may also enhance the logic to check whether a password contains alphanumeric characters, if you so desire.
		// Example usage of all relevant/necessary JOptionPane dialog box types are demonstrated throughout the instructions ...
		
		// Study the given project and fill in the missing code parts where indicated ...
		
		// Correct Credentials
		String correctUserName = "VICTOR";
		String correctPassword = "12345"; // Uncomment this line to use in your code
		
		// Below are the JOptionPane Objects that will be inserted into a Dialog Box
		JTextField userName  = new JTextField();
		JPasswordField userPassword = new JPasswordField();
		
		// Below is an array containing the above Objects
		// Don't mind the fact that it's an array, nothing particularly interesting about this!
		Object[] fields = {
			    "Username:", userName,
			    "Password:", userPassword
			};
		
		// Below we create a Dialog Box and attach the above Objects to it and assign the result to a variable of integer type
		int result = JOptionPane.showConfirmDialog(null, fields, "Enter User Credentials", JOptionPane.OK_CANCEL_OPTION);
		
		 System.out.println(result); // Use this to check the result in the console when clicking OK/CANCEL on the ConfirmDialog Window
		
		// Check if user clicked OK
		if (result == JOptionPane.OK_OPTION) {
			
			System.out.println("JOptionPane.OK_OPTION = " + JOptionPane.OK_OPTION);
			
			// Example usage of .getText() method to retrieve the String variable from the userName JTextField
			String name = userName.getText();
			System.out.println(name); // To display the name in the console
			
			// Compare user input values to correct Credentials
			// Compare userName to correctUserName
			if (name.equals(correctUserName)) { // Notice the use of `.equals()` and NOT `==` for comparing String type variables
				
				// Some code here ...
				// Get the password String from the userPassword JOptionPane Object - similar to userName.getText()
				String password = new String(userPassword.getPassword());
				// Before granting access to the user, it remains to check whether password entered satisfies the following criteria:
				
				// 1) The password is between 5 and 7 characters in length
				// 2) The password matches with the (hard-coded) correctPassword
				
				if (password.length() >= 5 && password.length() <= 7 && password.equals(correctPassword)) {
					// For example, show a message dialog box that informs the user "Access Granted"
					JOptionPane.showMessageDialog(null, "Access granted!");
				} else {
					// Handle the situation in which it is the case that the user entered the incorrect name
					JOptionPane.showMessageDialog(null, "Access denied, incorrect password or password lenth!", "ERROR ", JOptionPane.ERROR_MESSAGE);
				}
					} else {
					JOptionPane.showMessageDialog(null, "Access denied, incorrect username", "ERROR ", JOptionPane.ERROR_MESSAGE );
					}
			

			// The below line is for you to see in the console what happens if the user name is correct/incorrect
			System.out.println("name.equals(correctUserName) = " + name.equals(correctUserName));
			
		} else if (result == JOptionPane.CANCEL_OPTION) {
			System.out.println("JOptionPane.CANCEL_OPTION = " + JOptionPane.CANCEL_OPTION);
			// Handle the situation in which it is the case that the user clicked "Cancel"
			// For example, show a message dialog box that informs the user that "Cancel" was chosen
			JOptionPane.showMessageDialog(null, "You pressed cancel", "Infomation", JOptionPane.INFORMATION_MESSAGE);			
		}
	}
}

