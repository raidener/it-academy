public class Main {
    public static void main(String[] args) {
        System.out.println(Country.valueOf("SWEDEN"));//Выполнили 1.5
        Country country = Country.valueOf("POLAND");//Выполнили
        System.out.println(country==Country.POLAND);//1.6 результат true
        //System.out.println(Country.valueOf("WESTEROS"));//Выполнили 1.7 .Вызывает оштбку No enum constant Country.WESTEROS
        System.out.println(Country.BELARUS.compareTo(Country.IRELAND));// Число -2 означает , что значение BELARUS находится на 2 позиции левее значения IRELAND
        System.out.println(Country.ITALY.compareTo(Country.ITALY));// Число 0 означает, что значение ITALY равно само себе
        //1.8 готово

        // 1.9
        CountryAreaComparator countryAreaComparator = new CountryAreaComparator();
        System.out.println(countryAreaComparator.compare(Country.SWEDEN,Country.RUSSIA));
    }
}
