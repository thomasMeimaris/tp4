package question1;

public class Cook {

    private Strategy strategy;

    public Strategy getStrategy(){
        return this.getStrategy();
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public Cook(){

    }

    public RiceCookingWays cookRice(){
        return this.strategy.cookRice();
    }

}
