package class9;

public class GroceryList2DArray {
    public static void main(String[] args) {
        String [][] groceryList={
                {"Tomato","Potato","Carrot","Cabbage"},
                {"Mango","Apple","Kiwi","Banana"},
                {"Milk","Butter","Yogurt","Cheese"},
                {"Chocolate","Ice Cream","Lollipops"}};
        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j < groceryList[i].length; j++) {
                System.out.print(groceryList[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(String[]i:groceryList){
            for(String j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    }

