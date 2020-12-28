class printString extends Thread{
    String s;
    int time;
    printString(String st,int t)
    {
        this.s=st;
        this.time=t;
    }
    public void run(){
        while(true)
        {

            try{
                
                Thread.sleep(time);
                System.out.println(s); 
            }
            catch(InterruptedException e){
                e.printStackTrace();
                
            }
        }
    }
}
public class threadsMain
{
    public static void main(String args[])
    {
        printString pb=new printString("BMS College of Engineering",10000);
        printString pc=new printString("CSE",2000);
        pb.start();
        pc.start();

    }
}