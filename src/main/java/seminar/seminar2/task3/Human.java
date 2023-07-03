package main.java.seminar.seminar2.task3;

public class Human {
    private Transport currentTransport;
    public void drive(Transport transport){
        currentTransport = transport;
        transport.run();
    }
    public void stop(){
        if (currentTransport != null){
            currentTransport.stop();
            currentTransport = null;
        }
        else {
            System.out.println("Не едем");
        }
    }
}
