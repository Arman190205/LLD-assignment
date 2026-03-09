public class EmailSender extends NotificationSender {
    public EmailSender(AuditLog audit) { super(audit, new EmailValidator()); }

    @Override
    public void dosend(Notification n) {
        String body = n.body;
        System.out.println("EMAIL -> to=" + n.email + " subject=" + n.subject + " body=" + body);
        audit.add("email sent");
    }
}