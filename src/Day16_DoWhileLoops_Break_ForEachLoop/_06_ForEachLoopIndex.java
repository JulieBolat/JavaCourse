package Day16_DoWhileLoops_Break_ForEachLoop;

public class _06_ForEachLoopIndex {

    public static void main(String[] args) {

        //given the provided array
        //find out the index at which string starts with "m"

        String [] list= {"meat", "fruits", "vegetables", "milk"};

        //we cannot solve this task using for each loop= we do not the index number

        for (String element: list){
            if (element.startsWith("m")){
                System.out.println(element);
            }
        }

        for (int i=0; i<list.length; i++) {
            if(list[i].startsWith("m")){
                System.out.println(i);
            }
        }
    }
}
