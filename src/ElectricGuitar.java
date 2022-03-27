public class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rookStarUsesIt;

    String getBrand(){
        return brand;
    }

    void setBrand(String aBrand){
        brand = aBrand;
    }

    int getNumOfPickups(){
        return numOfPickups;
    }

    void setNumOfPickups(int num){
        numOfPickups=num;
    }

    boolean getRookStarUsesIt(){
        return rookStarUsesIt;
    }

    void setrookStarUsesIt(boolean yeaorno){
        rookStarUsesIt = yeaorno;
    }

}
