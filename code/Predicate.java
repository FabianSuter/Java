@FunctionalInterface // Funktionsschnittstelle
public interface Predicate<T>{
    boolean test(T element);
}

public class Utils { // Implementation
    static <T> void removeAll(Collection<T> collection, Predicate<T> criterion){
        var it = collection.iterator();
        while(it.hasNext()){
            if(criterion.test(it.next())){
                it.remove();
            }
        }
    }
}

// Als Lambda
Utils.removeAll(people, p->p.getAge() > 65);

// Als Methodenreferenz
Utils.removeAll(people, this::isSenior);

boolean isSenior(Person person){
    return person.getAge() > 65;
}