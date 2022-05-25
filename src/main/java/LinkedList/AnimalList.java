package LinkedList;

public class AnimalList {

    private AnimalListItem head;

    public void add (Animal animal){
        if(head == null){
            head = new AnimalListItem(animal);
        } else {
            AnimalListItem last = findLast();
            last.setNext(new AnimalListItem(animal));
        }

    }

    public AnimalListItem findLast(){
        AnimalListItem current = head;
        while (current.hasNext()) {
            current = current.getNext();
        }
        return current;
    }

}
