public class Main {
        public static void main(String[] args) {
            // за каждые 20 рублей, потраченные на билет, начисляется 1 миля

            int ticketPrice = 13_676;
            int mileToRub = 20;
            int bonus = ticketPrice / mileToRub;
            System.out.println("бонус составит " + bonus + " мили");

    }

}
