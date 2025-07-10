import java.util.ArrayList;

public class ArrayList_2D{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //adding rows (outer list)
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>()); //creation of three empty rowas 
        }

        //adding elements to specific rows 
        //we can create jagged or normal 2D ArrayList
        list.get(0).add(10);
        list.get(0).add(20);
        list.get(0).add(30);
        list.get(1).add(-10);
        list.get(1).add(10);
        list.get(1).add(-30);
        list.get(1).add(-10);
        list.get(2).add(20);
        list.get(2).add(-50);

        //printing elements 
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
        System.out.println();
        }

        //modifying values 
        list.get(0).set(1,-20);

        //removing elements or rows 
        list.get(1).remove(0); //removing first element from second row 
        list.remove(2); //remove entire 3rd row 


    }
}
