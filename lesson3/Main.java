package ru.geekbrains.lesson3;

public class Main {

    public static void main(String[] args) {
        LinkedList<Student> linkedList = new LinkedList<>();
        linkedList.addFirst(new Student("Student5", 19));
        linkedList.addFirst(new Student("Student4", 18));
        linkedList.addFirst(new Student("Student2", 22));
        linkedList.addFirst(new Student("Student3", 24));
        linkedList.addFirst(new Student("Student1", 26));

        LinkedListV2<Student> linkedList2 = new LinkedListV2<>();
        linkedList2.addFirst(new Student("Student5", 19));
        linkedList2.addFirst(new Student("Student4", 18));
        linkedList2.addFirst(new Student("Student2", 22));
        linkedList2.addFirst(new Student("Student3", 24));
        linkedList2.addFirst(new Student("Student1", 26));

        // linkedList.directSort(new StudentAgeComparator(SortType.Ascending));
        // printList(linkedList);
        // linkedList.directSort(new StudentAgeComparator(SortType.Descending));
        printList(linkedList);
        linkedList.revert();
        System.out.println("Разворот односвязного списка:");
        printList(linkedList);
        linkedList2.revert();
        System.out.println("Разворот двусвязного списка:");
        printList(linkedList2);
    }

    public static <T> void printList(LinkedList<T> list) {
        LinkedList.Node node = list.getHead();
        System.out.println();
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
        System.out.println();
    }

    public static <T> void printList(LinkedListV2<T> list) {
        LinkedListV2.NodeV2 node = list.getHead();
        System.out.println();
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
        System.out.println();
    }
}
