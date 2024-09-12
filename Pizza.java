class Pizza{
    private int price;
    private boolean veg;
    private int extraCheese=100;
    private int extraToppings=150;
    private int backPack=20;
    private int basePizzaPrice;

    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isOptedForTakeAway=false;

    public Pizza(boolean veg){
        if(veg){
            price=300;
        }
        else{
            price=400;
        }
        basePizzaPrice=price;
    }

    
    public void addExtraCheese(){
        isExtraCheeseAdded=true;
        price+=extraCheese;
    }


    public void addExtraToppings(){
        isExtraToppingsAdded=true;
        price+=extraToppings;
    }

    public void takeAway(){
        isOptedForTakeAway=true;
        price+=backPack;
    }

    public void getBill(){
        String bill="";
        System.out.println("Pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+="Extra Cheese Added: "+extraCheese+"\n";
        }
        if(isExtraToppingsAdded){
            bill+="Extra Toppings Added: "+extraToppings+"\n";
        }
        if(isOptedForTakeAway){
            bill+="Take Away: "+backPack+"\n";
        }
        bill+="Bill: "+price+'\n';
        System.out.println(bill);
    }
}