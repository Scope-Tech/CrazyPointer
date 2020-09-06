package io.github.scopetech.crazypointer;
import javax.swing.UnsupportedLookAndFeelException;
import java.io.*;
import java.util.Scanner;
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static javax.swing.UIManager.*;
/**
 * @author squid233
 */
public class Main{public static void main(String[] p7306){m3968();String f6484="1.2";m7897("CrazyPointer VM " + f6484 + " is ready. Reading file...");Scanner f4055=new
Scanner(in);String f5800="File in parameter is not found. Please enter the file:";String f4578="Error: Could not create the Java Virtual Machine.\nError: A fatal exception " +
"has occurred. Program will exit.";String f3557="Java Virtual Machine Launcher";String f7986="\nThe file has been read successful! Do you want to exit this program?(y/n)";
C3573 f3953=null;try{f3953=new C3573(p7306[0]);}catch(ArrayIndexOutOfBoundsException|FileNotFoundException f9953){m7897(f5800);try{f3953=new C3573(f4055.nextLine());}catch(
FileNotFoundException f8946){m6828(f4578,f3557);exit(-1);}}while(true){char f9584=0;int f1984=0;while(true){try{if((f1984=f3953.read())==-1){break;}}catch(IOException
f3711){m8394(f3711);}char f320=(char)f1984;if(f320=='>'){f9584++;}else if(f320=='<'){f9584--;}else if(f320=='.'){m3411(f9584);}}m7897(f7986);if(m5020(f4055)){m7897(
"Thanks for use!");exit(0);}else{m7897("Please enter the file:");try{f3953=new C3573(f4055.nextLine());}catch(FileNotFoundException f2573){m8394(f2573);}}
m7897("Thanks for use!");}}static boolean m5020(Scanner p9667){return"y".equalsIgnoreCase(p9667.nextLine());}static void m3968(){try{setLookAndFeel(m5489());}catch(
ClassNotFoundException|InstantiationException|IllegalAccessException|UnsupportedLookAndFeelException ignored){}}static String m5489(){return getSystemLookAndFeelClassName();}
static void m8394(Throwable p8961){p8961.printStackTrace();}static void m6828(String p4577,String p9658){showMessageDialog(null,p4577,p9658,ERROR_MESSAGE);}
static void m3411(Object p7536){out.print(p7536);}static void m7897(Object p8970){m3411(p8970);m3411('\n');}}
class C3573 extends FileReader{public C3573(String fileName)throws FileNotFoundException{super(fileName);}}
