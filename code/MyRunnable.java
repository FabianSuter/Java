class MyRunnable implements Runnable {
    @Overridepublic void run(){
        // Thread code
    }
}
var myThread = new Thread(new MyRunnable());
myThread.start();