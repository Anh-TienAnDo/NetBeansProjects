/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colletions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Colletions {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int t= scan.nextInt();
//        while(t-->0){
//            int n=scan.nextInt();
//            ArrayList<Integer> M=new ArrayList<>();
//            for(int i=0;i<n;i++){
//                int x=scan.nextInt();
//                M.add(x);
//            }
//            Collections.sort(M);
//            Collections.reverse(M);
//            int[] A=new int[n];
//            Arrays.fill(A,0);
//            while (true){
//                int a=0;
//                for(int i=n-1;i>=0;i--){
//                    if(A[i]==0){
//                        A[i]=1;
//                        a++;
//                        for(int j=i+1;j<n;j++)A[j]=0;
//                        break;
//                    }
//                }
//                if(a==0)break;
//                int sum=0;
//                for(int i=0;i<n;i++)sum+=A[i]*M.get(i);
//                if(sum%2==1) {
//                    for (int i = 0; i < n; i++)
//                        if (A[i] == 1) System.out.print(M.get(i) + " ");
//                    System.out.println();
//                }
//            }
//        }
//    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            int n=scan.nextInt();
            int k=scan.nextInt();
            ArrayList<Integer> M=new ArrayList<>();
            for(int i=0;i<n;i++){
                int x=scan.nextInt();
                M.add(x);
            }
            Collections.sort(M);
            int[] A=new int[k+1];
            for(int i=1;i<=k;i++)A[i]=i;
            while (true){
                int a=0;
                for(int i=1;i<=k;i++) System.out.print(M.get(A[i]-1)+" ");
                System.out.println();
                for(int i=k;i>0;i--){
                    if(A[i]!=n-k+i){
                        A[i]++;
                        a++;
                        for(int j=i+1;j<=k;j++)A[j]=A[j-1]+1;
                        break;
                    }
                }
                if(a==0)break;

            }
        }
    }
    
}
