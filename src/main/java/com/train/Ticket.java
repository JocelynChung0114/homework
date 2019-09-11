package com.train;

class Ticket {
    private int count;
    private int roundTripCount;

    Ticket(int count, int roundTripCount) {
        this.count = count;
        this.roundTripCount = roundTripCount;
    }

    void print(){
        System.out.println("Total tickets: "  + count + "\t" +
                "Round-trip: " + roundTripCount + "\t" +
                "Total: " + getMoney());
    }

    private int getMoney(){
        return (int) ((count - roundTripCount) * 1000 + (roundTripCount * 2000 * 0.9));
    }
}
