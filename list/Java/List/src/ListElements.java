
abstract class LISTELEMENTS {
	
	LISTELEMENTS() {	}
	
	abstract LISTELEMENTS AddEnd(INTERFACE val);
	abstract void printInfos();
	abstract int getLength();
	abstract INTERFACE RetVal();
	abstract LISTELEMENTS DelFirst();
	abstract INTERFACE GetLast(INTERFACE I);
	abstract LISTELEMENTS DelLast();
	abstract LISTELEMENTS AddBefore(INTERFACE val, INTERFACE comp);
}
