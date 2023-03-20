public class Skeleton extends Boss  {
    private int numberOfShots;

    public int getNumberOfShots() {
        return numberOfShots;
    }

    public void setNumberOfShots(int numberOfShots) {
        this.numberOfShots = numberOfShots;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "Number Of Shots " + numberOfShots;
    }
}
