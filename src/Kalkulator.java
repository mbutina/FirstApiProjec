public class Kalkulator {
    double operand1, operand2;

    double add(double operand1,double operand2){
        this.operand1=operand1;
        this.operand2=operand2;
        double zbir = this.operand1 + this.operand2;
        return zbir;
    }

    double sub(double operand1,double operand2){
        this.operand1=operand1;
        this.operand2=operand2;
        double razlika = this.operand1 - this.operand2;
        return razlika;
    }

    double mul(double operand1,double operand2){
        this.operand1=operand1;
        this.operand2=operand2;
        double proizvod = this.operand1 * this.operand2;
        return proizvod;
    }

    double div(double operand1,double operand2){
        this.operand1=operand1;
        this.operand2=operand2;
        double kolicnik = this.operand1 / this.operand2;
        return kolicnik;
    }
}
