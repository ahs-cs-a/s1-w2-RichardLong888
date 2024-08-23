
// BodyOfWater.java
public class BodyOfWater {
    private String name;
    private String largestDiameter;
    private int avgDepth;
    private boolean isSaltWater;


    public BodyOfWater(String n, String ld){
        name = n;
        largestDiameter = ld;
    }


    public BodyOfWater(String n, String ld, int ad, boolean i){
        name = n;
        largestDiameter = ld;
        avgDepth = ad;
        isSaltWater = i;
    }

    public void setName(String n){
        name = n;
    }
    public void setLargestDiameter(String ld){
        largestDiameter = ld;
    }
    public void setAvgDepth(int ad){
        avgDepth = ad;
    }
    public void setIsSaltWater(boolean i){
        isSaltWater = i;
    }

    public String getName(){
        return name;
    }

    public String getLargestDiameter(){
        return largestDiameter;
    }

    public int getAvgDepth(){
        return avgDepth;
    }

    public boolean getIsSaltWater(){
        return isSaltWater;
    }


    public void printState(){
        System.out.println("Name: " + name);
        System.out.println("Largest diameter: " + largestDiameter);
        System.out.println("Average depth: " + avgDepth + " feet");
        System.out.println("It is salt water: " + isSaltWater);
       
    }
}

