import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        
        return "Hello, " + name + ". Lovely to see you.";
    }

    public String guestGreeting(String name, String dayPeriod) {
        
        return "Good " + dayPeriod + ", " + name + ". Lovely to see you.";
    }

    public String guestGreeting() {
        Date date = new Date();
        String dayPeriod;
        if (date.getHours()<12) {
            dayPeriod = "morning";
        }
        else if (date.getHours()<17) {
            dayPeriod = "afternoon";
        }
        else {
            dayPeriod = "evening";
        }
        return "Good " + dayPeriod +  ". Lovely to see you.";
    }

    
    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date + ".";
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") != -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
         }
         if (conversation.indexOf("Alfred") != -1) {
            return "At your service. As you wish, naturally.";
         }
        return "Right. And with that I shall retire.";
    }
        
}

