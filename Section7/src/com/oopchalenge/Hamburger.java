package com.oopchalenge;

public class Hamburger {
    private String name;
    private String breadRollType;
    private int basePrice;
    private int additionNo = 0;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;

    public Hamburger(String name, String breadRollType, int basePrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.basePrice = basePrice;
    }

    public void addAddition(Addition addition) {
        additionNo++;
        if (checkAdditions()) {
            switch (additionNo) {
                case 1:
                    this.addition1 = addition;
                    this.basePrice += addition.getCost();
                    break;
                case 2:
                    this.addition2 = addition;
                    this.basePrice += addition.getCost();
                    break;
                case 3:
                    this.addition3 = addition;
                    this.basePrice += addition.getCost();
                    break;
                case 4:
                    this.addition4 = addition;
                    this.basePrice += addition.getCost();
                    break;
            }
        }
        else {
            System.out.println("Maximum limit of additions are surpassed.");
        }
    }

    protected boolean checkAdditions() {
        if (this.additionNo <= 4) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public void addBasePrice(int amount) {
        this.basePrice += amount;
    }

    public Addition getAddition1() {
        return addition1;
    }

    public void setAddition1(Addition addition1) {
        this.addition1 = addition1;
    }

    public Addition getAddition2() {
        return addition2;
    }

    public void setAddition2(Addition addition2) {
        this.addition2 = addition2;
    }

    public Addition getAddition3() {
        return addition3;
    }

    public void setAddition3(Addition addition3) {
        this.addition3 = addition3;
    }

    public Addition getAddition4() {
        return addition4;
    }

    public void setAddition4(Addition addition4) {
        this.addition4 = addition4;
    }

    public int getAdditionNo() {
        return this.additionNo;
    }

    public void setAdditionNo(int no) {
        this.additionNo = no;
    }

    public void incrementAdditionNo(int number) {
        this.additionNo += number;
    }
}

