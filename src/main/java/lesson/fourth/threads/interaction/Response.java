package lesson.fourth.threads.interaction;

public class Response implements Runnable {
    ThreadsInteraction interaction;
    String[] response =
            {
                    "Aeroflot 111,  Radar, go ahead",
                    "Aeroflot 111, descend to altitude 6,000 feet"
            };

    public Response(ThreadsInteraction interaction) {
        this.interaction = interaction;
        new Thread(this, "Response").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < response.length; i++) {
            interaction.response(response[i]);
        }
    }
}
