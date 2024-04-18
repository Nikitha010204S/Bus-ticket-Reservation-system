package bus_ticket_reservation_system;

public class Bus {

	private int busNo;
	private boolean Ac;
	private int capacity;
	
    Bus(int no,boolean ac,int cap){
    	this.busNo=no;
    	this.Ac=ac;
    	this.capacity=cap;
    }
   public int getcapacity()
    {
    	return capacity;
    }
  
   public void setcapacity(int cap)
   {
   	capacity=cap;
   }
   
   public int getBusno()
   {
	   return busNo;
   }
   public void setBusno(int no)
   {
	   busNo=no;
   }
   
   public boolean getAc()
   {
	   return Ac;
   }
   
   public void setAc(boolean ac)
   {
	   Ac=ac;
   }
   
   public void displaybusinfo()
   {
	   System.out.println("Bus no:" + busNo + "  " + "Ac:" + Ac + "  "+ "Total capacity:" + capacity);
   }
   
}


