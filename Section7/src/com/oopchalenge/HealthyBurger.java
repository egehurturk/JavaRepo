package com.oopchalenge;

public class HealthyBurger extends Hamburger {
    private Addition addition5;
    private Addition addition6;

    public HealthyBurger(String name, int basePrice) {
        super(name, "Brown Rye", basePrice);
    }

    /*
    * Overriding the super <pre>addAddition()</pre> method
    * @param: addition, Addition.
    *       Addition we want to add to the HealthyBurger
    * @returns: void
     */
    @Override
    public void addAddition(Addition addition) {
        super.incrementAdditionNo(1);
        if (checkAdditions()) {
            switch (super.getAdditionNo()) {
                case 1:
                    super.setAddition1(addition);
                    super.addBasePrice(addition.getCost());
                    break;
                case 2:
                    super.setAddition2(addition);
                    super.addBasePrice(addition.getCost());
                    break;
                case 3:
                    super.setAddition3(addition);
                    super.addBasePrice(addition.getCost());
                    break;
                case 4:
                    super.setAddition4(addition);
                    super.addBasePrice(addition.getCost());
                    break;
                case 5:
                    this.addition5 = addition;
                    super.addBasePrice(addition.getCost());
                    break;
                case 6:
                    this.addition6 = addition;
                    super.addBasePrice(addition.getCost());
                    break;
            }
        }
        else {
            System.out.println("Maximum limit of additions are surpassed.");
        }
    }

    @Override
    protected boolean checkAdditions() {
        if (super.getAdditionNo() <= 6) {
            return true;
        }
        return false;
    }

    public Addition getAddition5() {
        return addition5;
    }

    public Addition getAddition6() {
        return addition6;
    }
}

