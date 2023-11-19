//Anche su questo mi sono aiutato moltissimo. Vorrei avere una spiegazione migliore la prossima volta che ci vediamo.

import java.util.HashSet;
import java.util.Objects;

public class Main {

    static class HashSetObject {
        String name;

        public HashSetObject(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            HashSetObject other = (HashSetObject) obj;
            return Objects.equals(name, other.name);
        }

        @Override
        public int hashCode() {
            return name != null ? name.hashCode() : 0;
        }
    }

    public static HashSet<HashSetObject> createAndPopulateHashSet() {
        HashSet<HashSetObject> hashSet = new HashSet<>();

        HashSetObject object = new HashSetObject("Element1");
        hashSet.add(object);

        return hashSet;
    }

    public static void removeElement(HashSet<HashSetObject> hashSet, HashSetObject object) {
        hashSet.removeIf(element -> element.equals(object));
    }

    public static void main(String[] args) {
        HashSet<HashSetObject> myHashSet = createAndPopulateHashSet();
        HashSetObject newObject = new HashSetObject("Element1");
        removeElement(myHashSet, newObject);
        myHashSet.clear();
        boolean empty = myHashSet.isEmpty();
        System.out.println("The HashSet is empty: " + empty);
    }
}
