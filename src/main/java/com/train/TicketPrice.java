package com.train;

import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number of tickets:");
        int count = scanner.nextInt();
        System.out.println("How many round-trip tickets: ");
        int roundTripCount = scanner.nextInt();
        Ticket ticket  = new Ticket(count, roundTripCount);
        ticket.print();
    }
}
