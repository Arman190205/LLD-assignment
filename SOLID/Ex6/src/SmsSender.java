public class SmsSender extends NotificationSender {
    public SmsSender(AuditLog audit) { super(audit, new SmsValidator()); }

    @Override
    public void dosend(Notification n) {
        // Ignores subject; base type doesn't clarify expectations (smell)
        System.out.println("SMS -> to=" + n.phone + " body=" + n.body);
        audit.add("sms sent");
    }
}
