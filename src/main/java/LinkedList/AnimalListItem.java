package LinkedList;

import javax.print.DocFlavor;

public class AnimalListItem {

    private Animal value;
    private AnimalListItem next;

    public AnimalListItem(Animal value) {
        this.value = value;
    }

    public boolean hasNext() {
        return next !=null;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public void setNext(AnimalListItem next) {
        this.next = next;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder(value.toString());
        if (next != null){
            sb.append("->");
            sb.append(next);
        }
        return sb.toString();
    }

}



