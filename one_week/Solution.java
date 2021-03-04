import java.util.Scanner;

public class Solution {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int string_num = scanner.nextInt();
        scanner.nextLine();
        String string_colloect = scanner.nextLine();
        String[] num_array = string_colloect.split(" ");
        String[] string_array = new String[string_num];
        for (int i = 0; i < string_num ; i++)
            string_array[i] = scanner.nextLine();
        for (int i = 0; i < string_num ; i++)
        {
            int count = Integer.parseInt(num_array[i]);
            for (int j = 0; j < count; j++)
            {
                System.out.println(string_array[i]);
            }
        }
    }
}