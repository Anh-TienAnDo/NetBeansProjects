/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuat_toan;

/**
 *
 * @author Admin
 */
public class time_conversion {
    class Result {

        /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
         */
        public static String timeConversion(String s) {
            // Write your code here
            String buoi = s.substring(s.length()-2, s.length()).toLowerCase();
            int time = Integer.parseInt(s.substring(0, 2));
            String kq = s.substring(2, s.length()-2);
            if(buoi.equals("am")){
                if(time<12){
                    kq=String.format("%02d", time)+kq;
                }
                else{
                    kq=String.format("%02d", time-12)+kq;
                }
            }
            else{
                if(time<12){
                    kq=String.format("%02d", time+12)+kq;
                }
                else{
                    kq=String.format("%02d", time)+kq;
                }
            }
            return kq;
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        String s = Result.timeConversion("07:05:45PM");
        System.out.println(s);
    }
}
