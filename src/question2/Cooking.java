package question2;

public class Cooking {

    private RiceType riceType;

    private Cooking(){
    }

    public  Cooking(RiceType riceType){
        this();
        this.riceType = riceType;
    }

    public String prepareDinner(){
        if     (this.riceType == RiceType.JAPONICA) return "I am done cooking JAPONICA";
        else if(this.riceType == RiceType.BASMATI)  return "I am done cooking BASMATI";
        else if(this.riceType == RiceType.CAMARGUE) return "I am done cooking CAMARGUE";
        else                                        return "wrong way :/";
    }

}
