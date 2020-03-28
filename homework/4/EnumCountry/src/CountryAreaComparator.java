import java.util.Comparator;


public class CountryAreaComparator implements Comparator<Country> {
    @Override
    public int compare(Country country1, Country country2) {
        if (country1.getArea() == country2.getArea()) {
            return 0;
        }
        if (country1.getArea() > country2.getArea()) {
            return 1;
        }
        else  {
            return -1;
        }
    }
}
