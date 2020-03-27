public enum Country implements ICountry {
    BELARUS(207.6, 9_413_446),
    SWEDEN(447.4, 10_327_589),
    IRELAND(70.3,4_921_500),
    LITHUANIA(65.3,2_790_472),
    ITALY(301.3,60_588_366),
    RUSSIA(17125.2,146_745_098),
    FRANCE(674.7,65_060_692),
    POLAND(312.7,38_313_035),
    GREECE(132.0,10_741_165),
    MONTENEGRO(13.8,622_359);

    private double area;
    private int population;

    Country(double area, int population){
        this.area=area;
        this.population=population;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int getPopulation() {
        return population;
    }
}

