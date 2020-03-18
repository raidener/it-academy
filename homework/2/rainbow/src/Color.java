public class Color {
    
    private final int RED=1;
    private final int ORANGE=2;
    private final int YELLOW=3;
    private final int GREEN=4;
    private final int BLUE=5;
    private final int INDIGO=6;
    private final int VIOLET=7;
    private int number1;
    private String colorRussian;

    public int getNumber(){
        return number1;
    }
    public Color(int number){
        number1=number;
    }
    public String getName(){
        switch (number1){
            case RED:
                colorRussian="Красный";
                break;
            case ORANGE:
                colorRussian="Оранжевый";
                break;
            case YELLOW:
                 colorRussian="Желтый";
                break;
            case GREEN:
                colorRussian="Зеленый";
                break;
            case BLUE:
                colorRussian="Голубой";
                break;
            case INDIGO:
                colorRussian="Синий";
                break;
            case VIOLET:
                colorRussian="Фиолетовый";
                break;
            default:
                colorRussian="Мы не знаем такого цвета";
        }
        return colorRussian;
    }
}
