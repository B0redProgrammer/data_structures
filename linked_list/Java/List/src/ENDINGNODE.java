
public class ENDINGNODE extends LISTELEMENTS {
	
	public ENDINGNODE() {
		super();
	}

	public LISTELEMENTS AddEnd(INTERFACE val) {
		return new NODE(this, val);
	}
	
	public int getLength() {
		return 0;
	}
	
	public INTERFACE RetVal() {
		return null;
	}
	
	public LISTELEMENTS DelFirst() {
		return this;
	}
	
	public INTERFACE GetLast(INTERFACE I) {
		return I;
	}
	
	public LISTELEMENTS DelLast() {
		return null;
	}
	
	public LISTELEMENTS AddBefore(INTERFACE val, INTERFACE comp) {
		return this;
	}
	
	public void printInfos() {	}
	
	public LISTELEMENTS AddSorted(INTERFACE val) {
		return new NODE(this, val);
	}
	
}
