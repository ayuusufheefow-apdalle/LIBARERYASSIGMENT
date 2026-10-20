public class DVDItem extends LibraryItem {

    public DVDItem(String title, int daysLate) {
        super(title, daysLate);
    }

    @Override
    public double calculateFine() {
        if (daysLate == 0) {
            return 0.0;
        } else {
            return 10.0 + (daysLate * 5.0);
        }
    }
}