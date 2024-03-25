package busReserve;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int no, boolean ac,int cap){
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	
	//accessor method
	public int getBusNo() {
		return busNo;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	//mutator

	public void setCapacity(int cap) {
		capacity=cap;
	}
	
	//set and get method for ac
	
	public boolean isAc() {
		return true;
	}
	
	public void setAc(boolean val) {
		ac=val;
	}
	public void displayBusInfo() {
		System.out.println("Bus No: "+busNo +" Ac : "+ ac + " Capacity : "+capacity);
	}
	

}
