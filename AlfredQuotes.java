import java.util.Date;
import java.util.Calendar;

/**
 * AlfredQuotes
 */
public class AlfredQuotes {
  Date now = new Date();

  public String basicGreeting() {
    return "Hello, lovely to see you. How are you?";
  }

  public String guestGreeting(String name) {
    return String.format("Hello, %s. Lovely to see you.", name);
  }

  public String guestGreeting(String name, String dayPeriod) {
    return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
  }

  public String getPeriod() {
    Calendar now = Calendar.getInstance();
    int hour = now.get(Calendar.HOUR_OF_DAY);
    if (hour < 12) {
      return "morning";
    }
    if (hour < 17) {
      return "afternoon";
    }
    return "evening";
  }

  public String dateAnnouncement() {
    return "It is currently " + now;
  }

  public String respondBeforeAlexa(String conversation) {
    if (conversation.indexOf("Alexa") != -1) {
      return "Right away, sir. She certainly isn't sophisticated enough for that.";
    }
    if (conversation.indexOf("Alfred") != -1) {
      return "At your service. As you wish, naturally.";
    }
    return "Right. And with that I shall retire.";
  }
}