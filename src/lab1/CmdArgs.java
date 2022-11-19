package lab1;

/* Написать программу, в результате которой выводятся на экран
аргументы командной строки в цикле for */

public class CmdArgs {
    public static void main(String[] args) {
        for(int i = 0; i <= args.length; i++){
            System.out.println(args[i]);
        }
    }
}
