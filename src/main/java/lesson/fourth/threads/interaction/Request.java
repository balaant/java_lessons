package lesson.fourth.threads.interaction;

public class Request implements Runnable {
    ThreadsInteraction interaction;
    String[] request =
            {
                    "Radar, Aeroflot 111",
                    "Request descent, Aeroflot 111",
                    "Descending to altitude 6,000 feet, Aeroflot 111"
            };

    public Request(ThreadsInteraction interaction) {
        this.interaction = interaction;
        new Thread(this, "Request").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < request.length; i++) {
            interaction.request(request[i]);
        }
    }
}