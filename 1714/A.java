import java.util.*;
import java.io.*;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

   public static HashSet<Integer> alarms= new HashSet<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int numberOfTestCase = sc.nextInt();
            int H = sc.nextInt();
            int M = sc.nextInt();
            int[][] alarm = new int[numberOfTestCase][2];
            int[] alarmH= new int[numberOfTestCase];
            int[] alarmM=new int[numberOfTestCase];
            alarms.clear();
            for (int j = 0; j < numberOfTestCase; j++) {
             //   alarm[j][0] = sc.nextInt();
              //  alarm[j][1] = sc.nextInt();

            //    alarmH[j]=sc.nextInt();
            //    alarmM[j]=sc.nextInt();

                alarms.add(sc.nextInt()*60+ sc.nextInt());
            }

            solve(H, M);
            //sleep(alarm, H, M, numberOfTestCase);
        }
    }
    public static void solve(int H, int M ) {

     //   Set<Integer> alarms =
         //       IntStream.range(0, h.length).map(i -> h[i] * 60 + m[i]).boxed().collect(Collectors.toSet());

 /*   for(int a: alarms){
        System.out.println(a);
    }

        int duration = 0;
        int time = H * 60 + M;
        while (!alarms.contains(time)) {
            ++duration;
            time = (time + 1) % 1440;
            System.out.println("duration is " + duration + " time is " + time);
        }

        return String.format("%d %d", duration / 60, duration % 60);*/

 /*       for(int a: alarms){
            System.out.println(a);
        }*/

        int minuteIncrement=0;
        int time=60*H+M;
      //  System.out.println(alarms.contains(time));
        while(!alarms.contains(time)){
            ++minuteIncrement;
            time=(time+1)%1440;
        }

        System.out.println(minuteIncrement/60 + " " + minuteIncrement%60);

    }

    public static void sleep(int[][] alarm, int H, int M, int numberOfTestCase) {


        java.util.Arrays.sort(alarm, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });
        int hours = 0;
        int mins = 0;


        for (int increment = 0; increment < numberOfTestCase; increment++) {
            if (!alarmBeforeSleep(alarm[increment][0], alarm[increment][1], H, M)) {

                System.out.println("false");
                System.out.println("alarm H is " + alarm[increment][0] + " alarm M is " + alarm[increment][1] + " " + H + " " + M);
            } else {
                System.out.println("true");
                if (alarm[increment][0] >= H) {
                    hours = alarm[increment][0] - H;
                } else {
                    hours = 24 - H + alarm[increment][0];
                }

                if (alarm[increment][1] >= M) {
                    mins = alarm[increment][1] - M;
                } else {
                    hours--;
                    mins = 60 - M + alarm[increment][1];
                }

                System.out.println("alarm H is " + alarm[increment][0] + " alarm M is " + alarm[increment][1] + " " + H + " " + M);
                break;
            }



        }
        System.out.println(hours + " " + mins);
/*

1
1 6 13
8 0

1
3 6 1
12 30
14 45
6 0

3
1 6 13
8 0
3 6 0
12 30
14 45
6 0
2 23 35
20 15
10 30

 */
    }
    public static boolean alarmBeforeSleep(int alarmH, int alarmM, int H, int M)
    {
        if(M<=alarmM && H<=alarmH) return true;
        else if(alarmM<M && alarmH>=H+1) return true;
        return false;
    }
}


   /* public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0; i<n; i++){
            int numberOfTestCase=sc.nextInt();
            int H=sc.nextInt();
            int M=sc.nextInt();
            int[][] alarm=new int[numberOfTestCase][2];
            for(int j=0; j<numberOfTestCase; j++){
                alarm[j][0]=sc.nextInt();
                alarm[j][1]=sc.nextInt();
            }
 *//*           for(int[] a:alarm){

                System.out.println(a[0] + ""+a[1]);
            }*//*

            int[] result= new int[2];
        //    result=sleep(alarm,H,M);

          //      System.out.println(result[0] + " " + result[1]);

        }

    }
*/



   /* public static int[] sleep(int[][] alarm, int H, int M){

        int[] result=new int[2];
        java.util.Arrays.sort(alarm, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });



*//*        System.out.println("H is " + H + " M is " + M );
        System.out.println(alarm);
        for(int[] a: alarm){

                System.out.println(a[0]+" " + a[1]);


        }*//*
     //   System.out.println(alarm[0][0] + " " + alarm[0][1]);
        if((alarm[0][1]-M)<0){
            result[1]=alarm[0][1]-M+60;
            if(alarm[0][0]-H<0)  result[0] = alarm[0][0]  - H +24-1;
                else{
                result[0] = alarm[0][0] - 1 - H;
            }

        }
        else{
            result[1]=alarm[0][1]-M;
            if(alarm[0][0]-H<0)  result[0] = alarm[0][0]  - H +24;
            else{
                result[0] = alarm[0][0]  - H;
            }
        }
    //    result[0]=(alarm[1][0]-H)<0?(alarm[1][0]-H+12):alarm[1][0]-H;
     //   result[1]=(alarm[0][0]-M)<0?(alarm[0][0]-M+60):alarm[0][0]-M;
        return result;
    }*/
    /*
    3
1 6 13
8 0
3 6 0
12 30
14 45
6 0
2 23 35
20 15
10 30

1
2 23 35
20 15
10 30

1
6 0 11
0 16
0 12
0 10
0 11
0 6
0 9
     */