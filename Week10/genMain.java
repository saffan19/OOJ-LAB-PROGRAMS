class A<T,Y>{
    T x;
    Y w;
    A(T x,Y w)
    {
        this.x=x;
        this.w=w;
    }
    void disp(){
        System.out.println("Variable1 value: "+x);
        System.out.println("Variable1 type :"+x.getClass().getName());
        System.out.println("Variable2 value: "+w);
        System.out.println("Variable2 type :"+w.getClass().getName());        
    }
}
public class genMain{
    public static void main(String args[])
    {
        A<Integer,String> obj1= new A<Integer,String>(10,"ABCD");
        obj1.disp();
        A<Boolean,String> obj2= new A<Boolean,String>(true,"MNOP");
        obj2.disp();


    }
}