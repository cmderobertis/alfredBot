public class TestAlfredQuotes {
  public static void main(String[] args) {
    AlfredQuotes alBot = new AlfredQuotes();

    String testGreeting = alBot.basicGreeting();
    String testGuestGreeting = alBot.guestGreeting("Beth Kane");
    String testGuestTimeGreeting = alBot.guestGreeting("Cameron", "evening");
    String testDateAnnouncement = alBot.dateAnnouncement();
    String alexaTest = alBot.respondBeforeAlexa("Alexa, turn off the lights.");
    String alfredTest = alBot.respondBeforeAlexa("Could you take out the trash, Alfred?");
    String notRelevantTest = alBot.respondBeforeAlexa("Fetch me the Batman.");

    System.out.println(testGreeting);
    System.out.println(testGuestGreeting);
    System.out.println(testGuestTimeGreeting);
    System.out.println(testDateAnnouncement);
    System.out.println(alexaTest);
    System.out.println(alfredTest);
    System.out.println(notRelevantTest);
    System.out.println(alBot.guestGreeting("Mrs. Robinson", alBot.getPeriod()));
  }
}
