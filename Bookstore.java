import java.io.IOException;
import java.util.ArrayList;

public class Bookstore {
	private String name;
	private String address;
	private double squarefeet;
	private boolean usedbooks = true;
	private boolean open = false;
	private int opentime;
	private int closingtime;
	private ArrayList<String> titles;
	
	public Bookstore(String name, String address, int squarefeet, boolean usedbooks, boolean open, int opentime,
			int closingtime) {
		this.name = name;
		this.address = address;
		this.squarefeet = squarefeet;
		this.usedbooks = usedbooks;
		this.open = open;
		this.opentime = opentime;
		this.closingtime = closingtime;
		
		titles = new ArrayList<String>();
		
	}

	public Bookstore() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSquarefeet() {
		return squarefeet;
	}

	public void setSquarefeet(int squarefeet) {
		this.squarefeet = squarefeet;
	}

	public boolean isUsedbooks() {
		return usedbooks;
	}

	public void setUsedbooks(boolean usedbooks) {
		this.usedbooks = usedbooks;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public int getOpentime() {
		return opentime;
	}

	public void setOpentime(int opentime) {
		this.opentime = opentime;
	}

	public int getClosingtime() {
		return closingtime;
	}

	public void setClosingtime(int closingtime) {
		this.closingtime = closingtime;
	}

	public void setSquarefeet(double squarefeet) {
		this.squarefeet = squarefeet;
	}
//	public void loadTitles()
//	{
//	  try
//	  {
//	    Utils.loadStringsToArray(this.titles);
//	  }
//	  catch (IOException e)
//	  {
//	    // for now simply init the array to zero
//	    System.out.println("Could not initilize the titles");
//	    // make sure it is empty
//	    this.titles = new ArrayList<String>();
//	    
//	  }
//	}
	public ArrayList<String> getTitles(){
		return titles;
	}
	
	@Override
	public String toString() {
		return "Bookstore \n name = " + name + ", \n address = " + address + ", \n squarefeet = " + squarefeet + ", \n usedbooks = "
				+ usedbooks + ", \n open = " + open + ", \n opentime = " + opentime + ", \n closingtime = " + closingtime;
	}

	
	
		
}
