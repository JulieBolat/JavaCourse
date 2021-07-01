package OOPRecap.StringSetImplementationTASK;

public class StringSetDemo {

    public static void main(String[] args) {

        StringSet stringSet = new StringSetImplementation1();

        stringSet.add("Hello");
        System.out.println(stringSet);

        stringSet.add("Techno");
        System.out.println(stringSet);

        stringSet.add("Study");
        System.out.println(stringSet);

        stringSet.add("Hello");
        System.out.println(stringSet);

        System.out.println(stringSet.size());
        stringSet.clear();
        System.out.println(stringSet.size());



        StringSet stringSet2 = new StringSetImplementation2();

        System.out.println(stringSet2.size());
        stringSet2.add("Hello");
        System.out.println(stringSet2.size());

        stringSet2.add("Techno");
        System.out.println(stringSet2.size());

        stringSet2.add("Study");
        System.out.println(stringSet2.size());

        stringSet2.remove("Hello");
        System.out.println(stringSet2.size());
        
        stringSet2.clear();
        System.out.println(stringSet2.isEmpty());

    }

}
