
public class EmailSender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String fromEmail = "137483ada09988";
		final String password = "5f4bce8e72b79";
		final String toEmail = "weto.jc@gmail.com";
		
		System.out.println("Iniciando");
		EmailConfig config = new EmailConfig();
		config.sendEmail(fromEmail, password, toEmail, "Subject", "Email Body");
	}
}
