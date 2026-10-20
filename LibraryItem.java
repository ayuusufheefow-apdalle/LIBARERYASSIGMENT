public class LibraryItem {
        protected String title;
        protected int daysLate;

        public LibraryItem(String title, int daysLate) {
            this.title = title;
            this.daysLate = daysLate;
        }

        public double calculateFine() {
            return 0.0;
        }

        public void displayInfo() {
            System.out.println("Title: " + title);
            System.out.println("Days Late: " + daysLate);
            System.out.println("Fine: $" + calculateFine());
        }
    }

