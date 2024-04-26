public class test {
    public static void main(String[] args) {
        StringArrayList names = new StringArrayList();

        names.addString("David");
        names.addString("Jared");
        names.addString("Xavier");
        names.addString("Jordan");
        
        names.regForPrint();
        System.out.println();
        
        names.removeString("Xavier");
        
        System.out.printf("name at index 1: %s\n", names.getElementByIndex(1));
        System.out.println();

        System.out.printf("arraylist size: %d\n", names.getSize());
        System.out.println();
        
        names.regForPrint();
    }
}
