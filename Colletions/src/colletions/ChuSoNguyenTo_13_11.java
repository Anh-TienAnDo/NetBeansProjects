/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colletions;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ChuSoNguyenTo_13_11 {

    static int[] a = {4,7};
    static int[] x = new int[20];

    public static void in(int n) {
//        boolean x2 =false;
//        boolean x3 =false;
//        boolean x5 =false;
//        boolean x7 =false;
//        long tong=0;
        String s="";
        for(int i=0;i<n;i++){
//            if(x[i]==2) x2=true;
//            else if(x[i]==3) x3=true;
//            else if(x[i]==5) x5=true;
//            else if(x[i]==7) x7=true;
            s=s+String.valueOf(x[i]);
        }
//        if(x[n-1]%2!=0 && x2 && x3 && x5 && x7){
//            System.out.println(s);
//        }
        System.out.print(s+" ");
    }

    public static void Sinh_to_hop(int i, int n) {
        for (int j = 0; j < 2; j++) {
            x[i] = a[j];
            if (i==n-1) {
                in(n);
            }
            else Sinh_to_hop(i + 1, n);
        }
    }

    public static void main(String[] args) {
//        String s = "44 55 4444 4554 5445 5555 444444 445544 454454 455554 544445 545545 554455 555555 44444444 44455444 44544544 44555544 45444454 45455454 45544554 45555554 54444445 54455445 54544545 54555545 55444455 55455455 55544555 55555555 4444444444 4444554444 4445445444 4445555444 4454444544 4454554544 4455445544 4455555544 4544444454 4544554454 4545445454 4545555454 4554444554 4554554554 4555445554 4555555554 5444444445 5444554445 5445445445 5445555445 5454444545 5454554545 5455445545 5455555545 5544444455 5544554455 5545445455 5545555455 5554444555 5554554555 5555445555 5555555555 444444444444 444445544444 444454454444 444455554444 444544445444 444545545444 444554455444 444555555444 445444444544 445445544544 445454454544 445455554544 445544445544 445545545544 445554455544 445555555544 454444444454 454445544454 454454454454 454455554454 454544445454 454545545454 454554455454 454555555454 455444444554 455445544554 455454454554 455455554554 455544445554 455545545554 455554455554 455555555554 544444444445 544445544445 544454454445 544455554445 544544445445 544545545445 544554455445 544555555445 545444444545 545445544545 545454454545 545455554545 545544445545 545545545545 545554455545 545555555545 554444444455 554445544455 554454454455 554455554455 554544445455 554545545455 554554455455 554555555455 555444444555 555445544555 555454454555 555455554555 555544445555 555545545555 555554455555 555555555555 44444444444444 44444455444444 44444544544444 44444555544444 44445444454444 44445455454444 44445544554444 44445555554444 44454444445444 44454455445444 44454544545444 44454555545444 44455444455444 44455455455444 44455544555444 44455555555444 44544444444544 44544455444544 44544544544544 44544555544544 44545444454544 44545455454544 44545544554544 44545555554544 44554444445544 44554455445544 44554544545544 44554555545544 44555444455544 44555455455544 44555544555544 44555555555544 45444444444454 45444455444454 45444544544454 45444555544454 45445444454454 45445455454454 45445544554454 45445555554454 45454444445454 45454455445454 45454544545454 45454555545454 45455444455454 45455455455454 45455544555454 45455555555454 45544444444554 45544455444554 45544544544554 45544555544554 45545444454554 45545455454554 45545544554554 45545555554554 45554444445554 45554455445554 45554544545554 45554555545554 45555444455554 45555455455554 45555544555554 45555555555554 54444444444445 54444455444445 54444544544445 54444555544445 54445444454445 54445455454445 54445544554445 54445555554445 54454444445445 54454455445445 54454544545445 54454555545445 54455444455445 54455455455445 54455544555445 54455555555445 54544444444545 54544455444545 54544544544545 54544555544545 54545444454545 54545455454545 54545544554545 54545555554545 54554444445545 54554455445545 54554544545545 54554555545545 54555444455545 54555455455545 54555544555545 54555555555545 55444444444455 55444455444455 55444544544455 55444555544455 55445444454455 55445455454455 55445544554455 55445555554455 55454444445455 55454455445455 55454544545455 55454555545455 55455444455455 55455455455455 55455544555455 55455555555455 55544444444555 55544455444555 55544544544555 55544555544555 55545444454555 55545455454555 55545544554555 55545555554555 55554444445555 55554455445555 55554544545555 55554555545555 55555444455555 55555455455555 55555544555555 55555555555555 4444444444444444 4444444554444444 4444445445444444 4444445555444444 4444454444544444 4444454554544444 4444455445544444 4444455555544444 4444544444454444 4444544554454444 4444545445454444 4444545555454444 4444554444554444 4444554554554444 4444555445554444 4444555555554444 4445444444445444 4445444554445444 4445445445445444 4445445555445444 4445454444545444 4445454554545444 4445455445545444 4445455555545444 4445544444455444 4445544554455444 4445545445455444 4445545555455444 4445554444555444 4445554554555444 4445555445555444 4445555555555444 4454444444444544 4454444554444544 4454445445444544 4454445555444544 4454454444544544 4454454554544544 4454455445544544 4454455555544544 4454544444454544 4454544554454544 4454545445454544 4454545555454544 4454554444554544 4454554554554544 4454555445554544 4454555555554544 4455444444445544 4455444554445544 4455445445445544 4455445555445544 4455454444545544 4455454554545544 4455455445545544 4455455555545544 4455544444455544 4455544554455544 4455545445455544 4455545555455544 4455554444555544 4455554554555544 4455555445555544 4455555555555544 4544444444444454 4544444554444454 4544445445444454 4544445555444454 4544454444544454 4544454554544454 4544455445544454 4544455555544454 4544544444454454 4544544554454454 4544545445454454 4544545555454454 4544554444554454 4544554554554454 4544555445554454 4544555555554454 4545444444445454 4545444554445454 4545445445445454 4545445555445454 4545454444545454 4545454554545454 4545455445545454 4545455555545454 4545544444455454 4545544554455454 4545545445455454 4545545555455454 4545554444555454 4545554554555454 4545555445555454 4545555555555454 4554444444444554 4554444554444554 4554445445444554 4554445555444554 4554454444544554 4554454554544554 4554455445544554 4554455555544554 4554544444454554 4554544554454554 4554545445454554 4554545555454554 4554554444554554 4554554554554554 4554555445554554 4554555555554554 4555444444445554 4555444554445554 4555445445445554 4555445555445554 4555454444545554 4555454554545554 4555455445545554 4555455555545554 4555544444455554 4555544554455554 4555545445455554 4555545555455554 4555554444555554 4555554554555554 4555555445555554 4555555555555554";
//        String[] cs = s.split(" ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//            for (int i = 0; i < n; i++) {
//                System.out.print(cs[i] + " ");
//            }
        for (int i = 1; i <= n; i++) {
            Sinh_to_hop(0, i);
        }
        
    }
}
