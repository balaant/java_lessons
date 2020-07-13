package lesson.fourth.threads.interaction;

public class ThreadsInteractionDemo {
    public static void main(String[] args) {
        ThreadsInteraction interaction = new ThreadsInteraction();
        Request request = new Request(interaction);
        Response response = new Response(interaction);
    }
}