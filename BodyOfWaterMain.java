public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("River", "90 meters", 20, false);
        
        b.setName("River");
        b.setLargestDiameter("90 meters");
        b.setAvgDepth(20);
        b.setIsSaltWater(false);
    
        System.out.println(b.getName());
        System.out.println(b.getLargestDiameter());
        System.out.println(b.getAvgDepth());
        System.out.println(b.getIsSaltWater());


        BodyOfWater b1 = new BodyOfWater("Lagoon", "50 miles");
        b1.setName("Lagoon");
        b1.setLargestDiameter("50 miles");
        System.out.println(b1.getName());
        System.out.println(b1.getLargestDiameter());
        b1.setName("The cooler Lagoon");
        System.out.println(b1.getName());
        System.out.println(b1.getLargestDiameter());
    }
}
