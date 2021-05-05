package Entities;

import java.util.Date;

public class Discount {
	private String description;
	private int discountPercent;
	private Date deadLine; //son teslim tarihi
	
	public Discount() {
		
	}
	public Discount(String description, int discountPercent, Date deadLine) {
		this.description = description;
		this.discountPercent = discountPercent;
		this.deadLine = deadLine;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}
	public Date getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}
}
