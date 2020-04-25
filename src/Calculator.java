public class Calculator {
    public static void main(String[] args){

        try{
            UtilClass number1 = new UtilClass();
            String mess =  number1.checkIfIdentical(0,7);
            System.out.println(mess);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
