package com.LeahGrace.Nodes.LinkedList;

public class LinkedList {
    public static void main(String[] args) {
        Node<Integer> head = null;
        head = addNode(head, 2);
        head = addNode(head, 8);
        head = addNode(head, 5);
        head = addNode(head, 9);
        displayList(head);

        // **** TESTS ****

        //  remove(head, 2);  //  remove head - - - success
        // remove(head, 9);  //  remove tail but cannot solve for remove(head, 8) or remove(head, 5);
        // remove(head, 5);  // remove int(not tail)
        // remove(head, 8);  //  remove int(not tail)

          find(head, 2);  // find 2 - - - success
          find(head, 8);  // find 8 - - - success
          find(head, 5);  // find 5 - - - success
        //  find(head, 9);  // find 9 - - - success
        //  find(head, 0);  // find 0 - - - success

    }

    public static Node<Integer> addNode(Node<Integer> head, int value) {
        Node<Integer> newNode = new Node<Integer>(value);
        if (head == null) {
            return newNode;
        }
        Node<Integer> trav = head;
        while (trav.next != null) {
            trav = trav.next;
        }
        trav.next = newNode;
        return head;
    }

    public static void displayList(Node<Integer> head) {
        //output of 2,8,5,9
        Node<Integer> trav = head;
        while (trav != null) {
            System.out.print(trav.value + ", ");

            trav = trav.next;
        }
        System.out.println();
    }

    public static void find(Node<Integer> head, int query) {
        Node<Integer> trav = head;
        while (trav != null) {
            if ((int) trav.value == (int) query) {
                System.out.println(query + " Found");
                return;
            }
            trav = trav.next;
        }
        System.out.println(query + " Not Found");
    }

    public static void remove(Node<Integer> head, int query) {
        Node<Integer> trav = head;

        //Solves for query = head and removes link to head
        if ((int) head.value == query) {
            head = head.next;
            displayList(head);
            return;
        }

        //Removes any single Node that is not head
        while (trav != null) {

                if ((int) trav.next.value == query) { //FIX NULL POINTER EXCEPTION/Solve for 8 and 5
                    trav.next = trav.next.next; // defaults to null for instances where tail.value = query
                    displayList(head);
                    return;
                }

            trav = trav.next;
        }
    }

}

