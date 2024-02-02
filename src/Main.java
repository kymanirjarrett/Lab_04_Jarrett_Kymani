public class Main
{
    public static void main(String[] args)
    {
        double springCost = 150.32;
        double summerCost = 450.50;
        double winterCost = 895.50;
        double fallCost = 3.50;
        double yearlyCost = 0;

        System.out.println("Spring Cost is " + springCost);
        System.out.println("Summer Cost is " + summerCost);
        System.out.println("Winter Cost is " + winterCost);
        System.out.println("Fall Cost is " + fallCost);

        yearlyCost = springCost + summerCost + winterCost + fallCost;
        System.out.println("The total yearly cost is " + yearlyCost);
    }
}