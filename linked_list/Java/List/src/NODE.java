
public class NODE extends LISTELEMENTS {
	LISTELEMENTS next;
	INTERFACE val;
	
	public NODE(LISTELEMENTS next, INTERFACE val) {
		super();
		this.next = next;
		this.val = val;
	}
	
	public LISTELEMENTS AddEnd(INTERFACE val) {
		this.next = this.next.AddEnd(val);
		return this;
	}
	
	public int getLength() {
		return next.getLength() + 1;
	}
	
	public INTERFACE RetVal() {
		return val;
	}
	
	public LISTELEMENTS DelFirst() {
		return next;
	}
	
	public INTERFACE GetLast(INTERFACE I) {
		return next.GetLast(val);
	}
	
	public LISTELEMENTS DelLast() {
		LISTELEMENTS Last = next.DelLast();
		if(Last == null) {
			return next;
		}
		else {
			next = Last;
			return this;
		}
	}
	
	public LISTELEMENTS AddBefore(INTERFACE val, INTERFACE comp) {
		if(comp == this.val) {
			val.printInfo();
			return new NODE(this, val);
		}
		else {
			System.out.println(1);
			next = next.AddBefore(val, comp);
			return this;
		}
	}
	
	public LISTELEMENTS AddSorted(INTERFACE val) {
		if(val.getInfo().codePointAt(0) <  this.val.getInfo().codePointAt(0)) {
			return new NODE(this, val);
		}
		else {
			next = next.AddSorted(val);
			return this;
		}
	}
	
	public void printInfos() {
		val.printInfo();
		next.printInfos();
	}
	
}
