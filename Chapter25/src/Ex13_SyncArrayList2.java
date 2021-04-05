import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex13_SyncArrayList2
{
	public static List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) throws InterruptedException
	{
		for (int i=0; i<10; i++)
			list.add(i);
		System.out.println(list);
		
		Runnable task = () -> { 
			//list 객체를 사용할때 객체에 동기화  Lock를 설정
			synchronized(list) {
				ListIterator<Integer> itr = list.listIterator();
				
				while (itr.hasNext())
					itr.set(itr.next() + 1);
			}
			
		};
		ExecutorService pool = Executors.newFixedThreadPool(5);
		pool.submit(task); 
		pool.submit(task); 
		pool.submit(task); 
		pool.submit(task);
		pool.submit(task); 
		
		pool.shutdown();
        pool.awaitTermination(100, TimeUnit.SECONDS);
		
		System.out.println(list);
	}
}