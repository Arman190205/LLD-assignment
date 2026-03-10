import com.example.tickets.IncidentTicket;
import com.example.tickets.TicketService;
import java.util.List;

public class TryIt {

    public static void main(String[] args) {

        TicketService service = new TicketService();

        IncidentTicket t = service.createTicket(
                "TCK-1001",
                "reporter@example.com",
                "Payment failing on checkout"
        );

        System.out.println("Created: " + t);

        // Demonstrate post-creation mutation through service
        service.assign(t, "agent@example.com");
        service.escalateToCritical(t);
        System.out.println("\nAfter service mutations: " + t);

        // Demonstrate external mutation via leaked list reference
        List<String> tags = t.getTags();
        tags.add("HACKED_FROM_OUTSIDE");
        System.out.println("\nAfter external tag mutation: " + t);
    }
}