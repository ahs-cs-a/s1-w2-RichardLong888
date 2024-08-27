public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("River", "90 meters", 20, false);
        System.out.println(b.getName());
        System.out.println(b.getLargestDiameter());
        System.out.println(b.getAvgDepth());
        System.out.println(b.getIsSaltWater());


        BodyOfWater b1 = new BodyOfWater("Lagoon", "50 miles");
        System.out.println(b1.getName());
        System.out.println(b1.getLargestDiameter());
        b1.setName("The cooler Lagoon");
        System.out.println(b1.getName());
        System.out.println(b1.getLargestDiameter());
    }
}
