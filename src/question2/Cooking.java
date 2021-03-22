package question2;

public class Cooking {

    private RiceType riceType;

    public  Cooking(RiceType riceType){
        this.riceType = riceType;
    }

    public String prepareDinner(){
        return "I am done cooking " + this.riceType;
    }
}
