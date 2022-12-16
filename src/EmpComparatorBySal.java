public class EmpComparatorBySal implements Comparator {

    public int compare(Object obj1, Object obj2) {
        Emp e1 = (Emp) obj1;
        Emp e2 = (Emp) obj2;

        if(e1.getSal() == e2.getSal()) {
            return 0;
        }

        if(e1.getSal() > e2.getSal()) {
            return -1;
        }

        return 1;


    }
}
