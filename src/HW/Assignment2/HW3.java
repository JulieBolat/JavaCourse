package HW.Assignment2;

public class HW3 {
    public static void main(String[] args) {

        //Task1
        String a= "apple";
        boolean b= a.contains("a");
        System.out.println(b);

        //Task2
        String c= "Florida";
        int d= c.indexOf("o");
        System.out.println(d);

        //Task3
        String x= "Thank you";
        int y= x.indexOf("y");
        System.out.println(y);

        //Task4
        String u= "Mouse";
        int t= u.indexOf("s");
        System.out.println(t);

        //Task5
        String f= "Campus";
        boolean g=f.startsWith("C");
        System.out.println(g);

        //Task6
        String h= "Java Course";
        boolean j= h.endsWith("e");
        System.out.println(j);

        //Task7
        String k="Java is one of the most popular programming language in the world";
        int l= k.length();
        System.out.println(l);

        //Task8
        String r= "My ";
        String p= "name is ";
        String s= "<Julie>";

        String concat= r.concat(p);
        String contact2=concat.concat(s);
        System.out.println(contact2);


        //Task9
        String w= "I will be a great Software Development Engineer in Test!";
        int q= w.lastIndexOf("e");
        System.out.println(q);

        //Task10
        String e= "Spotify";
        boolean m= e.isEmpty();
        System.out.println(m);











    }
}
