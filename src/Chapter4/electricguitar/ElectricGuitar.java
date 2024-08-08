package Chapter4.electricguitar;

public class ElectricGuitar{
        String brand;
        int numOfPickups;
        boolean rockStarUsesIt;

        String getBrand() {
            return brand;
        }

        //this keywords specifies that we are using the variable of the class ElectricGuitar and not the ones passed as parameters inside the methods.

        void setBrand(String brand){
            this.brand = brand;
        }
        int getNumOfPickups(){
            return numOfPickups;
        }
        void setNumOfPickups(int numOfPickups){
            this.numOfPickups = numOfPickups;
        }
        boolean getRockStarUsesIt(){
            return rockStarUsesIt;
        }
        void setRockStarUsesIt(boolean rockStarUsesIt){
            this.rockStarUsesIt = rockStarUsesIt;
        }
    }
