public class DoubleLinkList {
    private DoubleLinkListElement start;
    private DoubleLinkListElement end;
    private int length;

    DoubleLinkList() {
        start = new DoubleLinkListElement("Start");
        end = new DoubleLinkListElement("End");


        start.next = end;
        end.prev = start;
        length = 0;
    }

    public class DoubleLinkListElement {
        private Object data;
        private DoubleLinkListElement next, prev;

        DoubleLinkListElement(Object data) {
            this.data = data;
            next = null;
            prev = null;
        }

        public Object getData(Object data) {
            return data;
        }
    }

    //Fügt ein Element der Liste hinzu.
    public void addElement(Object data) {
        DoubleLinkListElement element = new DoubleLinkListElement(data);
        element.next = end;
        element.prev = end.prev;
        end.prev.next = element;
        end.prev = element;
        length++;
    }

    //Gibt die Länge der Liste aus.
    public void sizeOf() {
        System.out.println("The list has " + length + " elements.");
    }

    //Löscht ein Element anhand von dem gegebenen data.
    public void removeElement(Object data) {
        DoubleLinkListElement current = start.next;
        if (containsElement(data)) {
            while (current.data != data) {
                current = current.next;
            }
            DoubleLinkListElement helpStart;
            DoubleLinkListElement helpEnd;

            helpStart = current.prev;
            helpEnd = current.next;

            helpStart.next = helpEnd;
            helpEnd.prev = helpStart;
            length--;
        } else {
            System.out.println("Object not found.");
        }
    }

    //Leert die Liste.
    public void emptyList() {
        start.next = end;
        end.prev = start;
        length = 0;
    }

    //Prüft ob die Liste leer ist.
    public void isEmpty() {
        boolean isEmpty = false;
        if (start.next == end && end.prev == start) {
            isEmpty = true;
        }
        System.out.println("Is the list empty? " + isEmpty);
    }

    //Zählt durch und gibt das Element aus wonach gesucht wird.
    public boolean containsElement(Object data) {
        DoubleLinkListElement current = start.next;
        boolean check = false;
        while (current != end) {
            if (current.data == data) {
                check = true;
            }
            current = current.next;
        }
        return check;
    }

    //Gibt die ganze Liste aus.
    public void output() {
        DoubleLinkListElement current = start.next;
        while (current != end) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    //Vergleicht die data von zwei Objekten. Und gibt aus ob sie gleich sind oder nicht.
    public void equals(Object data1, Object data2) {
        DoubleLinkListElement current1 = start.next;
        DoubleLinkListElement current2 = start.next;
        while (current1.data != data1) {
            current1 = current1.next;
        }
        while (current2.data != data2) {
            current2 = current2.next;
        }
        if (current1.data == current2.data) {
            System.out.println("The both contain '" + data1 + "'. They are equal.");
        } else {
            System.out.println("They aren't equal.");
        }
    }

//    //Vergleicht die Liste mit der angegebenen.
    public void equals(DoubleLinkList list2) {
//        if (list2.length == this.length) {
//            System.out.println("Gleich");
//        }
//        else {
//            System.out.println("nicht gleich");
//        }
//    }

}
