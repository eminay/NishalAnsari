package edu.asu.bmi.cda.example;

import edu.asu.bmi.cda.data.Patient;

public class App 
{
    public static void main( String[] args )
    {
        Patient n = new Patient("1000839391","Nishal Ansari", 28);
        System.out.println("NAME\t\tID\t\tAGE");
        System.out.println("==========================================");
        System.out.println(n.getName() + "\t" + n.getId() + "\t" + n.getAge());
    }
}
