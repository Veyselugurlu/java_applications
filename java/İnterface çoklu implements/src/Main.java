
public class Main {
    public static void main(String[] args){
    Worker worker=new Worker();
    worker.Robot();
    worker.odeme();
    worker.eat();
    System.out.println("*******************");
    OutSourceWorker out=new OutSourceWorker();
    out.work();
    }
}
