import java.util.ArrayList;


public class reverse_ArrayList {

    public static void reverseList(ArrayList<Integer> list){
    int i = 0;
    int j = list.size()-1;
    Integer temp; 
    while(i<j){
        
        temp = (list.get(i)); //boxing already done 
        list.set(i, list.get(j));
        list.set(j,temp);
        i++;
        j--;
    }
}
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(56);
        list.add(33);
        list.add(22);
        list.add(1);
        list.add(44);
        list.add(35);

        System.out.println("Original list: " +list);
        reverseList(list);
        System.out.println("reversed list: "+ list);
    }
}
