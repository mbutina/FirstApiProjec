import java.util.Scanner;

public class Vezba9Kalkulator {
    public static void main(String[] args) {
        double operand1, operand2;
        String operacija;
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Uneiste prvi oprand: ");
        operand1 = scanner.nextDouble();

        System.out.println("Uneiste drugi operand: ");
        operand2 = scanner.nextDouble();

        System.out.println("Uneiste recunsku operaciju +, -, /, *): ");
        operacija = scanner.next().toString();

            if(operacija.equals("+")){
                System.out.println("Zbir dva broja je: " + kalkulator.add(operand1,operand2));
            } else if (operacija.equals("-")){
                System.out.println("Razlika dva boja je: " + kalkulator.sub(operand1,operand2));
            } else if (operacija.equals("/")){
                if (operand2!=0) {
                    System.out.println("Kolicnik dva broja je: " + kalkulator.div(operand1,operand2));
                }else{
                    System.out.println("Nije moguce deljenje, drugi operand ne sme biti 0.");
                }
            } else if (operacija.equals("*")){
                System.out.println("Proizvod dva broja je: " + kalkulator.mul(operand1,operand2));
            }else {
                System.out.println("Uneli ste neispravan operand.");
            }
        }
    }
