package com.training;
import java.util.*;
public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Ticket tc = new Ticket();

		System.out.println("Enter movie name");
		String movie = sc.next();

		System.out.println("Enter no of bookings");
		int bookings = sc.nextInt();

		System.out.println("Enter the available tickets");
		int availableTickets = sc.nextInt();
		tc.setAvailableTickets(availableTickets);


		while(true) {
			System.out.println("Enter the ticketid");
			int ticketid = sc.nextInt();

			System.out.println("Enter the price");
			int price = sc.nextInt();

			System.out.println("Enter the no of tickets");
			int noOfTickets = sc.nextInt();

			tc.setTicketId(ticketid);
			tc.setPrice(price);
			Ticket.setAvailableTickets(tc.getAvailableTickets());



			if(tc.calculateTicketCost(noOfTickets) == -2) {
				System.out.println("Available tickets: "+ tc.getAvailableTickets());
				System.out.println("Tickets are not available");
			}

			else if(tc.calculateTicketCost(noOfTickets) == -1 || availableTickets == noOfTickets) {
				System.out.println("Available tickets: "+ tc.getAvailableTickets());
				System.out.println("Total amount: "+ tc.calculateTicketCost(noOfTickets));
				System.out.println("House full");
				break;
			}
			else {
				System.out.println("Available tickets: "+ tc.getAvailableTickets());
				System.out.println("Total amount: "+ tc.calculateTicketCost(noOfTickets));
				availableTickets = availableTickets - noOfTickets;
				Ticket.setAvailableTickets(availableTickets);
				System.out.println("Available ticket after booking: "+Ticket.getAvailableTickets());
			}
		}
		sc.close();
	}
}
