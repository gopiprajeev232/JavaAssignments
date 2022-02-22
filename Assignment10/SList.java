package Assignment10;

public class SList<T> {
    public SListIterator iterator() {
        return new SListIterator();
    }

    public static void main(String[] args) {
        SList<Integer> sList = new SList<Integer>();

        SListIterator<Integer> sListIterator = sList.iterator();
        sListIterator.insertNode(5);
        sListIterator.insertNode(6);
        sListIterator.insertNode(7);
        sListIterator.insertNode(8);
        sListIterator.insertNode(9);

        sListIterator.printList();

        sListIterator.deleteAtIndex(1);
        sListIterator.printList();
    }
}
