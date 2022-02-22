package Assignment10;

public class SListIterator<T> {
    Node<T> head;

    public SListIterator() {
        head = null;
    }

    public void insertNode(T val) {
        Node<T> newNode = new Node<>(val);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    public int lengthOfList() {
        Node temp = head;
        int count = 0;
        while(temp != null) {
            temp = temp.next;
            count++;
        }

        return count;
    }

    public void deleteAtIndex(int index) {
        if(index >= lengthOfList())
        {
            System.out.println("Index greater than or equal to length of list!");
            return;
        }

        else if(index == 0)
        {
            head = head.next;
        }

        else if(index == lengthOfList() - 1)
        {
            Node curr = head;
            Node prev = null;

            while(curr.next != null)
            {
                prev = curr;
                curr = curr.next;
            }

            prev.next = null;
        }

        else
        {
            Node curr = head;
            Node prev = null;

            int count = 0;

            while(curr.next != null)
            {
                if(count == index)
                {
                    break;
                }

                prev = curr;
                curr = curr.next;

                count++;
            }

            prev.next = curr.next;
            curr.next = null;
        }

        System.out.println("Node at index "+index+" is deleted.");
    }

    public void printList() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
