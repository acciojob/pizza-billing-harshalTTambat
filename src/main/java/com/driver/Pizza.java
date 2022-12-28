package com.driver;

public class Pizza {

    private int price; // calculating final bill price
    private Boolean isVeg;
    private String bill; // string bill
    /*
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakeAwayAdded;
    private boolean isBillGenerated;
    private int extraCheesePrice;
    private int extraToppingPrice;
    private int takeAwayPrice;

     */


    public Pizza(Boolean isVeg){

        this.isVeg = isVeg;
/*
        this.extraCheesePrice = 80;
        this.takeAwayPrice = 20;

        if (this.isVeg) {  // veg pizza
            this.price = 300;
            this.extraToppingPrice = 70;
        } else {          // Non-veg pizza
            this.price = 400;
            this.extraToppingPrice = 120;
        }

        this.isCheeseAdded = false;
        this.isToppingAdded = false;
        this.isBillGenerated = false;
        this.isTakeAwayAdded = false;

        this.bill = "Base Price Of The Pizza: " + this.price + "\n";

 */

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        /*
        if(!isCheeseAdded){ // if cheese = (false),, means cheese not added
            // add extra cheese
            this.price = this.price + this.extraCheesePrice;
            isCheeseAdded = true;  // set true
        }

         */
    }
    public void addExtraToppings(){
        /*
        if(!isToppingAdded){
            this.price = this.price + this.extraToppingPrice;
            isToppingAdded = true;
        }

         */
    }
    public void addTakeaway(){
        /*
        if(!isTakeAwayAdded){
            this.price = this.price + this.takeAwayPrice;
            isTakeAwayAdded = true;
        }

         */
    }
    public String getBill(){
        /*
        if(!isBillGenerated)
        {
            if(isCheeseAdded)
                this.bill += "Extra Cheese Added: " + this.extraCheesePrice + "\n";

            if(isToppingAdded)
                this.bill += "Extra Topping Added: " + this.extraToppingPrice + "\n";

            if(isTakeAwayAdded)
                this.bill += "Paperbag Added: " + this.takeAwayPrice + "\n";

            this.bill += "Total Price: " + this.price + "\n";
            isBillGenerated = true;
        }
        return this.bill;

         */

    }
}