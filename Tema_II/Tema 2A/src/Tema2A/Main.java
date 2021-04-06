package Tema2A;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Alegeti din: a)oras b)zona rezidentiala c)drum express d)autostrada pentru a afla limita de viteza.");
        String a = x.nextLine();
        a = a.toLowerCase();
        System.out.println(tip2(a));
}



public static int tip(String name) {
if(name.equals("a)oras"))
    return 50;
else if(name.equals("b)zona rezidentiala"))
    return 30;
else if(name.equals("c)drum express"))
    return 100;
else if(name.equals("d)autostrada"))
    return 130;
else return 0;
}
public static int tip1(String name) {
if(name.equals("a)oras"))
    return 50;
if(name.equals("b)zona rezidentiala"))
    return 30;
if(name.equals("c)drum express"))
    return 100;
if(name.equals("d)autostrada"))
    return 130;

return 0;

} 
public static int tip2(String name) {

switch(name) {
case "a)oras":
    return 50;

case "c)drum express":
    return 100;

case "d)autostrada":
    return 130;

case "b)zona rezidentiala":
    return 30;
}
return 0;
}

}