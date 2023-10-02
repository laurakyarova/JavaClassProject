package class9;

public class E92DArraysTask {
    public static void main(String[] args) {
        String[][] cars = {
                {"Ford", "Mustang", "Jeep"},
                {"BMW", "Audi", "VW"},
                {"Hyunday","Kia","Genesis"},
                {"Ferrari","Lamborghini", "Maserati"}};
        for(String[]i:cars){
            for(String j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();

            }

            }
        }


