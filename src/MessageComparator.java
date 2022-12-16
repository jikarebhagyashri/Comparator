public class MessageComparator implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        Message m1 = (Message) obj1;
        Message m2 = (Message) obj2;

        if(m1.getText().length() == m2.getText().length() ) {
            return 0;
        }

        if(m1.getText().length() > m2.getText().length() ) {
            return 1;
        }

        return -1;
    }
}
