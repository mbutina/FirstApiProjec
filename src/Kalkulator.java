public class Kalkulator {
    double operand1, operand2;

    double add(double operand1,double operand2){
        double zbir = operand1 + operand2;
        return zbir;
    }

    double sub(double operand1,double operand2){
        double razlika = operand1 - operand2;
        return razlika;
    }

    double mul(double operand1,double operand2){
        double proizvod = operand1 * operand2;
        return proizvod;
    }

    double div(double operand1,double operand2){
        double kolicnik = operand1 / operand2;
        return kolicnik;
    }
}
