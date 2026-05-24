public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        //Addition
        if(cal.add(2, 3) == 5){
            System.out.println("Addition Test Passed");
        }else{
            System.out.println("Addition Test Failed");
        }

        //Substractiom
        if(cal.sub(6, 10) == 4){
            System.out.println("Substraction Test Passed");
        }else{
            System.out.println("Substraction Test Failed");
        }
    }
}
