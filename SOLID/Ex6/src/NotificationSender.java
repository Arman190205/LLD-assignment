public abstract class NotificationSender {
    protected final AuditLog audit;
    protected final NotificationValidator validator;
    protected NotificationSender(AuditLog audit,NotificationValidator v) { this.audit = audit;this.validator = v;}
    public void send(Notification n) {
        validator.validate(n);
        dosend(n);
    }
    protected abstract void dosend(Notification n);
}