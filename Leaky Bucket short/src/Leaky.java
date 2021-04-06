import java.util.*;
class Leaky extends Thread{
	public static void main(String[] args) {
		queue q= new queue();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the No of packets to be sent");
		int n=in.nextInt();
		q.insert(n);
		q.delete();
		in.close();	
	}
}
class queue {
	int q[],r=0,i,ele;
	Scanner in = new Scanner(System.in);
	void insert(int n) {
		q=new int[10];
		for(i=0;i<n;i++) {
			System.out.print("Enter the "+(i+1)+" element ");
			ele=in.nextInt();
			if(r+1>10) {
				System.out.println("Queue is Full\n Lost Packet "+ele);
				break;
			}
			else {
				r++;
				q[i]=ele;
			}
		}	
	}
	void delete() {
		if(r==0)
			System.out.println("Queue is empty");
		else {
			for(i=0;i<r;i++)
			{
				try {
					Thread.sleep(1000);
				}
				catch(Exception e) {}
				System.out.println("Leaked Packet "+q[i]);
			}
		}
	}
}
	