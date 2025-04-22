package Solid;

// ISP & LSP: Interface with just the necessary method

interface NotificationService {
    void sendNotification(User user, String message);
}