public class Country {
    private String name;
    private long population;
    private int square;
    private String language;

    public Country() {
    }

    public Country(String name, long population, int square, String language) {
        this.name = name;
        this.population = population;
        this.square = square;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }

    public int getSquare() {
        return square;
    }

    public String getLanguage() {
        return language;
    }
    public static Country getMaxArea(Country[] countries){
        Country largestCountry = countries[0];

        for (Country country : countries) {
            if (country.getSquare() > largestCountry.getSquare()) {
                largestCountry = country;
            }
        }

        return largestCountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", square=" + square +
                ", language='" + language + '\'' +
                '}';
    }
}
