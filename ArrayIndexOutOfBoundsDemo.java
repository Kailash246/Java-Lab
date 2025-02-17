class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3, 4, 5};
            System.out.println("my array: " + array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        }
    }
}
