package Practice.Basics;

public class DesignResizableArray {
    class DynamicArray {
        int[] array;
        int capacity = 0;
        int size = 0;
        int lastIndex = 0;
    
        public DynamicArray(int capacity) {
            this.array = new int[capacity];
            this.capacity = capacity;
        }
    
        public int get(int i) {
            return this.array[i];
        }
    
        public void set(int i, int n) {
            this.array[i] = n;
        }
    
        public void pushback(int n) {
            if(this.size == this.capacity) {
                resize();
            }
            this.array[lastIndex++] = n;
            this.size++;
        }
    
        public int popback() {
            int val = this.array[--lastIndex];
            this.size--;
            return val;
        }
    
        private void resize() {
            int[] newArray = new int[this.capacity*2];
            for(int i = 0; i < this.lastIndex; i++) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
            this.capacity *= 2;
        }
    
        public int getSize() {
            return this.size;
        }
    
        public int getCapacity() {
            return this.capacity;
        }
    }    
}
