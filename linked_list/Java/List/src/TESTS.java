
public class TESTS {
	
	
	PERSON  [] p = {new PERSON("Ignacio"),
					new PERSON("Maverick"),
					new PERSON("Kevin"),
					new PERSON("Adonis"),
					new PERSON("Analepsis")
	};
	
	public void AddToEnd() {
		LIST l = new LIST();
		for(int i = 0; i<p.length; i++) {
			l.AddEnd(p[i]);
		}
		l.printInfos();
	}
	
	public void AddToStart() {
		LIST l = new LIST();
		for(int i = 0; i<p.length; i++) {
			l.AddFirst(p[i]);
		}
		l.printInfos();
	}
	
	public void DeleteFromStart() {
		LIST l = new LIST();
		for(int i = 0; i<p.length; i++) {
			l.AddEnd(p[i]);
		}
		for(int i = 0; i<p.length; i++) {
			if(l.DelFirst() == p[i]) {
				System.out.println(String.format("Test %2d == success", i));
			}
			else {
				System.out.println(String.format("Test %2d == failed", i));
			}
		}
	}
	
	public void DeleteFromEnd() {
		LIST l = new LIST();
		for(int i = 0; i<p.length; i++) {
			l.AddFirst(p[i]);
		}
		for(int i = 0; i<p.length; i++) {
			if(l.DelLast() == p[i]) {
				System.out.println(String.format("Test %2d == success", i));
			}
			else {
				System.out.println(String.format("Test %2d == failed", i));
			}
		}
	}
	
	public void length() {
		LIST l = new LIST();
		for(int i = 0; i<p.length; i++) {
			System.out.println(l.getLength() == i);
			l.AddEnd(p[i]);
		}
		
	}
	
	public void AddBefore() {
		LIST l = new LIST();
		l.AddEnd(p[0]);
		for(int i = 1; i<p.length; i++) {
			l.AddBefore(p[i], p[i-1]);
		}
		
		for(int i = 0; i<p.length; i++) {
			INTERFACE last = l.DelLast();
			System.out.println(last == p[i]);
		}
	}
	
	public void AddSorted() {
		LIST l = new LIST();
		for(int i = 0; i<p.length; i++) {
			l.AddSorted(p[i]);
		}
		l.printInfos();
	}
	
}
