// programe to extend Thread class for multi threading
class Loader extends Thread {
    public void run() {
        System.out.println("Hello");
    }
}

class MyClass {
    public static void main(String[ ] args) {
        Loader obj = new Loader();
      
      for(int i=0;i<3;i++){
         obj.start(); 
      }  
        // obj.start();
    }
}
