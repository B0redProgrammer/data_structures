
public class LIST {
	LISTELEMENTS first;

	public LIST() {
		first = new ENDINGNODE();
	}
	
	public void AddEnd(INTERFACE val) {
		first = first.AddEnd(val);
	}
	
	public void AddFirst(INTERFACE val) {
		first = new NODE(first, val);
	}
	
	public INTERFACE DelFirst() {
		LISTELEMENTS backup = first;
		first = first.DelFirst();
		return backup.RetVal();
	}
	
	public INTERFACE GetLast() {
		return first.GetLast(null);
	}
	
	public INTERFACE DelLast() {
		//But I don't want to use if statements :'(
		INTERFACE Last = GetLast();
		
		first.DelLast();
		
		return Last;
	}
	
	public int getLength() {
		return first.getLength();
	}
	
	public void printInfos() {
		first.printInfos();
	}
	
	public void AddBefore(INTERFACE val, INTERFACE comp) {
		first = first.AddBefore(val, comp);
	}
	
	public void AddSorted(INTERFACE val) {
		first = first.AddSorted(val);
	}
}
