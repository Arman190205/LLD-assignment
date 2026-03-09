public class EmailValidator implements NotificationValidator{
    @Override
    public void validate(Notification n) {
        String body = n.body;
        if (body.length() > 40) body = body.substring(0, 40);
    }
    
}
