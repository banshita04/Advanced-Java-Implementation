package com.training;

public class Ticket {
	private int ticketId;
	private int price=0;
	private static int availableTickets;
	
	public int calculateTicketCost(int nooftickets) {
		if(availableTickets >= nooftickets) {
			int p = price*nooftickets;
			return p;
		} else if(availableTickets <= 0) {
			return -1;
		} else if(availableTickets < nooftickets) {
			return -2;
		}
		return 0;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getAvailableTickets() {
		return availableTickets;
	}

	public static void setAvailableTickets(int availableTickets) {
		Ticket.availableTickets = availableTickets;
	}
	
	
}
