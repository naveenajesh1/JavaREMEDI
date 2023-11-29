class multiplicationtable{
	void multiplicationtable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(i+"X"+num+"="+i*num);
			}
		}
	}
class MyThread1 extends Thread{
	multiplicationtable t=new multiplicationtable();
	MyThread1(multiplicationtable t){
		this.t=t;
	}
	public void run(){
		t.multiplicationtable(5);
	}
	
	
}

public class ThreadDemo {
public static void main(String[]args) {
multiplicationtable m=new multiplicationtable();
MyThread1 t=new MyThread1(m);
t.start();
	
}
}
