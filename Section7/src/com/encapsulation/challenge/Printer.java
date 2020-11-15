package com.encapsulation.challenge;

public class Printer {
    private int toner;
    private int numberOfPagesPrinted;
    private boolean duplex;

    public Printer(int toner, boolean duplex) {
        if (toner > -1 && toner < 100) {
            this.toner = toner;
        }
        this.toner = -1;
        this.duplex = duplex;
        this.numberOfPagesPrinted = 0;
    }

    public int fillToner(int amount) {
        if (amount > 0 && amount <= 100) {
            if (this.toner + amount > 100) {
                return -1;
            }
            this.toner += amount;
            return this.toner;
        }
        return -1;
    }

    public int printPages(int pages) {
        if (this.duplex) {
            pages = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.numberOfPagesPrinted += pages;
        return pages;
    }


    public int getToner() {
        return toner;
    }

    public void setToner(int toner) {
        this.toner = toner;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public void setNumberOfPagesPrinted(int numberOfPagesPrinted) {
        this.numberOfPagesPrinted = numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
}
