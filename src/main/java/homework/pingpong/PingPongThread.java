package homework.pingpong;

public class PingPongThread extends Thread{
    PingPongThread(String name){
        this.setName(name);
    }

    @Override
    public void run() {
        Ball ball = Ball.getBall();
        while(ball.isInGame()){
            kickBall(ball);
        }
    }

    private void kickBall(Ball ball) {
        if(!ball.getSide().equals(getName())){
            ball.kick(getName());
        }
    }
}
