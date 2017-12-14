import java.util.ArrayList;  //maintenance class

public class MasterOrder { //collection of orders from cookie order class thats why we use <CookieOrder> its strings and ints
	
	ArrayList<CookieOrder> orders = new ArrayList<CookieOrder>();
	
	public void addOrder(CookieOrder order) { //simple method to add an order
		orders.add(order);
	}
	
	public int getTotalBoxes() {  //traversing arraylist  //for loop
		int totalBoxes =0;
//		for(int i=0; i<orders.size(); i++) {  //this is doing the work totaling boxes
//			totalBoxes +=orders.get(i).getNumBoxes();
//		}
		
		//enhanced for loop
		for(CookieOrder order: orders) {  //order is cookie order object
			totalBoxes+= order.getNumBoxes(); //whenever you can use enhanced for loop you should
		}
		return totalBoxes;
	}
	
	public void removeVariety(String variety) { //always remove in reverse order (right to left)
		for(int i=orders.size()-1; i>=0; i--) { //can only do a for loop reversing order not enhanced
			if(orders.get(i).getVariety().equals(variety)) { //array list class, cookie order class and string class.
				orders.remove(i);
			}
		}
	}
	public int getSize() {
		return orders.size();
	}
	public void showOrder() {
		for (CookieOrder order: orders) {
			System.out.println(order);
		}
	}

}
