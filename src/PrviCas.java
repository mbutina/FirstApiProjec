import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
import java.util.function.DoublePredicate;

public class PrviCas {

    public static void main(String[] args) {
//        int x, z;
//
//        System.out.println("Unesite jedan ceo broj.");
//        Scanner scanner = new Scanner(System.in);
//        x = scanner.nextInt();
//
//        z = x % 2;
//
//        if (z == 0) {
//            System.out.println("Broj " + x + " je paran.");
//        } else {
//            System.out.println("Broj " + x + " je neparan.");
//        }

        int broj1, broj2;
        double rezulatat;
//        String operand;
        int operand;
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Uneiste prvi realan broj: ");
//        broj1 = scanner.nextInt();
//
//        System.out.println("Uneiste drugi realan broj: ");
//        broj2 = scanner.nextInt();

//        System.out.println("Uneiste operand(recunsku operaciju +, -, /, *): ");
//        operand = scanner.next();
//        char op = operand.charAt(0);

//        if (op == '+') {
//            rezulatat = broj1 + broj2;
//            System.out.println("Zbir dva broja je: " + rezulatat);
//        } else if (op == '-') {
//            rezulatat = broj1 - broj2;
//            System.out.println("Razlika dva boja je: " + rezulatat);
//        } else if (op == '/') {
//            if (broj2 != 0) {
//                rezulatat = broj1 / broj2;
//                System.out.println("Kolicnik dva broja je: " + rezulatat);
//            } else {
//                System.out.println("Nije moguce deljenje 0.");
//            }
//        } else if (op == '*') {
//            rezulatat = broj1 * broj2;
//            System.out.println("Proizvod dva broja je: " + rezulatat);
//        } else {
//            System.out.println("Uneli ste neispravan operand.");
//        }

//        System.out.println("Odaberite opciju racunske operacije: \n"+
//                            "1. Sabiranje\n"+
//                            "2. Oduzimanje\n"+
//                            "3. Deljenje\n"+
//                            "4. Mnozenje\n");
//        operand = scanner.nextInt();
//
//        switch (operand){
//            case 1:{
//                rezulatat = broj1 + broj2;
//                System.out.println("Zbir dva broja je: " + rezulatat);
//                break;
//            }
//            case 2:{
//                rezulatat = broj1 - broj2;
//                System.out.println("Razlika dva boja je: " + rezulatat);
//                break;
//            }
//            case 3:{
//                if (broj2!=0){
//                    rezulatat = broj1 / broj2;
//                    System.out.println("Kolicnik dva broja je: " + rezulatat);
//                }else{
//                    System.out.println("Nije moguce deljenje sa 0.");
//                }
//                break;
//            }
//            case 4:{
//                rezulatat = broj1 * broj2;
//                System.out.println("Proizvod dva broja je: " + rezulatat);
//                break;
//            }
//            default:
//                System.out.println("Niste uneli ni jednu od ponudjenih opcija.");
//        }

//        if((broj1%broj2)==0){
//            System.out.println("Nema ostatka prilikom deljenja dva broja.");
//        }else if ((broj1%broj2)<=1000){
//            System.out.println("Ostatak deljenja je manji ili jednak broju 1000 i iznosi " + (broj1%broj2) + ".");
//        }else{
//            System.out.println("Ostatak deljenja je veci od broja 1000 i iznosi " + (broj1%broj2) + ".");
//        }

//        String autoModel;
//        int brojVrata;
//        System.out.println("Unesite marku automobila.");
//        autoModel = scanner.next();
//
//        if(autoModel.matches("Ford")){
//            System.out.println("Unesite broj vrata na automobilu.");
//            brojVrata = scanner.nextInt();
//            if(1<=brojVrata && brojVrata<=5){
//                System.out.println("Model automobila je " + autoModel + " i ima " + brojVrata + " vrata.");
//            }else {
//                System.out.println("Uneli ste neodgovarajuci broj vrata.");
//            }
//        }else {
//            System.out.println("Niste uneli odgovarajucu marku automobila, marka mora biti 'Ford'.");
//        }
//        System.out.println("**************************");
//        System.out.println("#\t\t1\t\t2\t\t3\t\t");
//        System.out.println("**************************");
//
//        for (int i = 1; i <= 10; ++i) {
//                for (int j = 1; j <= 3; j++) {
//                    if(j==1){
//                        System.out.print(i + "\t\t");
//                        System.out.print((j*i) + "\t\t");
//                    }else if(j==2){
//                        System.out.print((i*j) + "\t\t");
//                    }else{
//                        System.out.print((i * j) + "\t\t");
//                        System.out.println();
//                    }
//                    }
//                }
//
        Random random = new Random();
//        System.out.println("Pogadjajte broj od 0 od 9:");
//
//        myloop:
//        while(true){
//            int zamisljeniBroj = random.nextInt(9);
//            int pogodak = scanner.nextInt();
//            if(zamisljeniBroj==pogodak){
//                System.out.println("Pogodili ste broj!");
//                break myloop;
//            }else {
//                System.out.println("Niste pogodili, pokusajte ponovo!!!");
//            }
//        }
        /*---------------------------------------------------------------------*/
//        String[] Imena = {"Heart","Cherry","Coin","Melon","Jocker"};
//        for(int i=0; i< Imena.length; i++){
//            int k = random.nextInt(5);
//            System.out.print(Imena[k]+" ");
//        }
//
//        String[] asset = {"Bickikla","Automobila","Mobilnog"};
//        String [][] tip = {{"BMX","Vitus","Ghost"},{"VW","Auti","BMW"},{"Samsung","Apple","Motorola"}};
//        double [][] cena = {{115.22,244.99,223.09},{18300.99,32983.22,24555.00},{1120.99,1499.99,876.11}};
//        for(int i=0;i<asset.length;i++){
//            int k = random.nextInt(3);
//            System.out.println(tip[i][k]+ " je marka " + asset[i] + " i kosta " + cena[i][k] + " Deutche Maraka!");
//        }

        System.out.println("Unesite broj clanova niza a zatim unesite clanove niza:");
        int brojClanovaNiza = scanner.nextInt();
        int[] niz=new int[brojClanovaNiza];

        for(int i=0; i<brojClanovaNiza;i++){
            niz[i]= scanner.nextInt();
        }
        int max = niz[0];
        int min = niz[0];
        for(int n=1;n<niz.length;n++){
            if(niz[n]<min){
                min=niz[n];
            }
            if(niz[n]>max){
                max=niz[n];
            }
        }
        System.out.println("Najmanji clan niza je: "+min);
        System.out.println("Najveci clan niza je: "+max);
            }
        }
