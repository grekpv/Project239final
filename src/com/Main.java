/**
 * Created by Юлия on 12.03.2017.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double radius1 = sc.nextDouble();
        double radius2 = sc.nextDouble();

        // Создаём новый объект типа Set. Передаём в качестве параметра количество точек в наборе.
        Set setObject = new Set(n);

        int x1;
        int y1;
        for (int i = 0; i < n; i++){
            x1 = sc.nextInt();
            y1 = sc.nextInt();

            setObject.setValue(i, new Dot(x1, y1));
        }

        int[] cnt1 = new int[n];
        int[] cnt2 = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                // Если i-й точки до j-й точки расстояние меньше первого радиуса, то j-я точка входит в
                // окружность первого радиуса вокруг первой точки.
                if (Math.sqrt( Math.pow(setObject.getValue(i).x - setObject.getValue(j).x, 2) +
                        Math.pow(setObject.getValue(i).y - setObject.getValue(j).y, 2)) < radius1) {

                    cnt1[i]++;
                    cnt1[j]++;
                }

                if (Math.sqrt( Math.pow(setObject.getValue(i).x - setObject.getValue(j).x, 2) +
                        Math.pow(setObject.getValue(i).y - setObject.getValue(j).y, 2)) < radius2) {

                    cnt2[i]++;
                    cnt2[j]++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cnt1[i] == cnt2[j] && i != j) {
                    System.out.println("(" + setObject.getValue(i).x + "; " + setObject.getValue(i).y + ")\t" +
                            "(" + setObject.getValue(j).x + "; " + setObject.getValue(j).y + ")");
                }
            }
        }
    }
}
