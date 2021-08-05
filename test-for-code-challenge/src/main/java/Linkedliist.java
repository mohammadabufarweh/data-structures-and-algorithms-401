public class Linkedliist {
        Node head;
//private int length;
//
//
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
    public void add(int value) {
            Node nodeToAdd = new Node(value);
            if (head == null) {
                head = nodeToAdd;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = nodeToAdd;
            }
        }

        public void insert(int value) {
            Node addTo = new Node(value);
            if (head == null) {
                head = addTo;
            } else {
                addTo.next = head;
                head = addTo;
            }

        }


        public boolean includes(int x) {
            if (head==null) {
              return false;
                 } else {
              Node pointer = head;
             while (pointer != null) {
             if (pointer.value == x) {
                return true;
            }
                pointer = pointer.next;
           }
           return false;
            }
}
        public String toString() {
            String transferList = "";
            Node p = head;
            if (p == null) {
                return null;
            } else {
                while (p != null) {
                    transferList = transferList + "{ " + p.value + " } -> ";
                    p = p.next;
                }
                transferList += "NULL";
            }

            return transferList;
        }

        public void append(int value) {
            Node nodeToAdd = new Node(value);
            if (head == null) {
                head = nodeToAdd;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = nodeToAdd;
            }
        }

        public void insertBefore(int value, int number) {
            Node pointer = head;
            if(head.value==value){
             insert(number);
            }else {
            if (!includes(value)){
                System.out.println("the value   " + value + "  Does not Exist");
            }
         else  {
                while (pointer.next.value != value) {
                    pointer = pointer.next;
                }
                Node newNode = new Node(number);
                newNode.next = pointer.next;
                pointer.next = newNode;
         }
            }
                Node newNode = new Node(number);
                newNode.next = pointer.next;
        }

        public void insertAfter(int value, int number) {
            Node pointer = head;

            if (!includes(value)) {
                System.out.println("the value " + value + "Does not Exist");
            } else {
                while (pointer.value != value) {
                    pointer = pointer.next;
                }
                Node newNode = new Node(number);
                newNode.next = pointer.next;
                pointer.next = newNode;
            }
        }


        public int kthValue(int k) {
            int c =0;
            Node current = head;
            Node pointer = head;
            while (current.next!=null){
                c++;
                current=current.next;
            }
            if (head==null || k < 0 || k>c) {
                System.out.println(("The value out of length"));
            }else{
                 current = head;
            for (int i = 0; i < k; i++) {
                    pointer = pointer.next;
            }
            while (pointer.next != null) {
                pointer = pointer.next;
                current = current.next;
            }
            }
            return current.value;
        }

    public Linkedliist reverseLinkedList(Linkedliist ll){
    Node prev = null;
    Node current = head;
    Node next = null;
    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
     }
    head = prev;
    return ll;
    }

    }