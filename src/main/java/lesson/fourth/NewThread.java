package lesson.fourth;

class NewThread extends Thread
{
    @Override
    public void run()	//Этот метод будет выполнен в побочном потоке
    {
        System.out.println("Привет из побочного потока!");
    }

    public static void main(String[] args)
    {
        NewThread mSecondThread = new NewThread();	//Создание потока
        mSecondThread.start();					//Запуск потока

        System.out.println("Главный поток завершён...");
    }
}