import java.lang.*;
import java.util.ArrayList;
import java.util.Iterator;
public class s {
    public static void main(String[] args) {
        ArrayList<student> std1 = new ArrayList <student> (10);
        std1.add(new student("milan " , 190210107017l , 3 , 8.06f));
        std1.add(new student("malay", 190210107054l , 3 , 7.09f));
        std1.add(new student("vikram", 190210107044l , 3 , 8.50f));
        std1.add(new student("vivek", 190210107023l , 3 , 7.53f));
        std1.add(new student("darshit", 190210107010l , 3 , 6.67f));
        std1.add(new student("rajdeep", 190210107076l , 3 , 7.98f));
        std1.add(new student("harsh", 190210107058l , 3 , 8.40f));
        std1.add(new student("yash", 1902101070178l , 3 , 7.45f));
        std1.add(new student("sujit", 190210107036l , 3 , 7.56f));
        std1.add(new student("jash", 190210107026l , 3 , 6.89f));
        Iterator<student> j = std1.iterator();
        while (j.hasNext()) {
            j.next().display();
        }
    }
}
class student{
    String name ;
    long enr_no;
    int sem;
    float CGPA;
    public student(String name, long  enr_no, int sem, float CGPA) {
        this.name = name;
        this.enr_no = enr_no;
        this.sem = sem;
        this.CGPA = CGPA;
    }
    void display(){
            System.out.println();
            System.out.println("name = " + name);
            System.out.println("enr_no = " + enr_no);
            System.out.println("sem = " + sem);
            System.out.println("CGPA = " + CGPA);
    }

}
