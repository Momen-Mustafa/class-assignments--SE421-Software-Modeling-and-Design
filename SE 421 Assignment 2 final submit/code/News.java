// this is a new class for the point 3.b Observer 
import java.util.ArrayList;
import java.util.List;

public class News{
	private List<User> listeners = new ArrayList<>();
	public void addObserver(User s){
		listeners.add(s);
	}

	public void removeObserver(User s){
		listeners.remove(s);
	}
	public void post(String msg){

		//notify the s1
		for(User s: listeners){
			s.newsPosted(msg); //send the event
		}
	}
}