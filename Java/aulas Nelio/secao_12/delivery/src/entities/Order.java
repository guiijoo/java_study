package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {

	private Integer itemID;
	private Date moment;
	private OrderStatus status;
	
	public Order()
	{
		
	}

	public Order(Integer itemID, Date moment, OrderStatus status) {
		super();
		this.itemID = itemID;
		this.moment = moment;
		this.status = status;
	}

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [itemID=" + itemID + ", moment=" + moment + ", status=" + status + "]";
	}
	

}
