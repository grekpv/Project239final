/**
 * Created by Юлия on 12.03.2017.
 */
public class Set {
    int quantity;

    Dot[] arr;

    Set (int quantity) {
        this.quantity = quantity;
        arr = new Dot[quantity];
    }

    Dot getValue(int n) {
        return arr[n];
    }

    void setValue(int n, Dot newValue) {
        arr[n] = newValue;
    }
}
