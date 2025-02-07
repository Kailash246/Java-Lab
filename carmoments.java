interface Car{
    //public abstract void start();//abstract method
    void start();//interface method
    void moving();
    void stop();
}
class Car1 implements Car{ //implement interface class
    public void start(){ //normal method
        System.out.println("car is starting");
    }
    public void moving(){ //normal method
        System.out.println("car is moving");
    }
    public void stop(){ //normal method
        System.out.println("car is stop");
    }
}
class Interfaces{
    public static void main(String args[]){
        Car1 obj=new Car1();
        obj.start();
        obj.moving();
        obj.stop();
    }
}