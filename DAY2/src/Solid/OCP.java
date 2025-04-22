package Solid;

	
	// OCP: Easily extendable for new types of notifications//
	class EmailNotification implements NotificationService {
	    public void sendNotification(User user, String message) {
	        System.out.println("Sending Email to " + user.getEmail() + ": " + message);
	    }
	}

	class SMSNotification implements NotificationService {
	    public void sendNotification(User user, String message) {
	        System.out.println("Sending SMS to " + user.getPhone() + ": " + message);
	    }
	}

	class NotificationManager {
	    private NotificationService service;

	    public NotificationManager(NotificationService service) {
	        this.service = service;
	    }

	    public void notifyUser(User user, String message) {
	        service.sendNotification(user, message);
	    }
	}

	public class OCP {
	    public static void main(String[] args) {
	        User user = new User("Alice", "alice@example.com"
	        		+ ""
	        		
	        		
	        		
	        		
	        		
	        		, "1234567890");

	        // Can switch services without modifying NotificationManager
	        NotificationService emailService = new EmailNotification();
	        NotificationService smsService = new SMSNotification();

	        NotificationManager manager = new NotificationManager(emailService);
	        manager.notifyUser(user, "Welcome via Email!");

	        manager = new NotificationManager(smsService);
	        manager.notifyUser(user, "Welcome via SMS!");
	    }
	}


