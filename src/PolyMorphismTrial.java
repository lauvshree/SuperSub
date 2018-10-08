public class PolyMorphismTrial {
    public static void main(String[] s) {
        // Our three humans with different languages
        Human h1,h2,h3;

        h1 = new Australian();
        h1.speak();


        h2 = new Indian();
        h2.speak();

        h3=new Chinese();
        h3.speak();

    }
}
