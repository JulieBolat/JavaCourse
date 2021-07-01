package OOPRecap.StringSetImplementationTASK;

public class StringSetImplementation2 implements StringSet{

    String[] storage = new String[0];

    @Override
    public void add(String s) {
        // checking if String s exist in our Array
        for (int i = 0; i < storage.length; i++){
            if (storage[i].equals(s))
                return;
        }

        // copy and add the element
        String[] copy = new String[storage.length + 1];
        for (int i = 0; i < storage.length; i++){
            copy[i] = storage[i];
        }

        storage = copy;
        storage[storage.length - 1] = s;

    }

    @Override
    public void remove(String s) {
        // check if element exists or not
        int index = -1;
        for (int i = 0; i < storage.length; i++){
            if (storage[i].equals(s)){
                index = i;
            }
        }
        if (index == -1){
            // element not found
            return;
        }

        // copy and remove element from array
        String[] copy = new String[storage.length - 1];
        boolean found = false;
        for (int i = 0; i < storage.length; i++){
            if (i == index && !found){
                found = true;
                continue;
            }
            copy[!found ? i : i-1] = storage[i];
        }
        storage = copy;
    }

    @Override
    public void clear() {
        storage = new String[0];
    }

    @Override
    public boolean isEmpty() {
        return storage.length == 0;
    }

    @Override
    public int size() {
        return storage.length;
    }
}
