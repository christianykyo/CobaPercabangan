package cobapercabangan;

import java.util.Scanner;

public class CobaPercabangan2 {
    
    public static void main(String[] args) {
        String identitas = "Christiany Kikyo Gracia Matulessy / X RPL 2 / 05: ";
        System.out.println("Identitas: " + identitas);
        
        // Initial commit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nilai a ? ");
        int a = scanner.nextInt();
        
        System.out.println("\nIf.. 1");
        if(a < 5) System.out.println("Nilai a kurang dari 5");
        
        System.out.println("\nIf.. 2");
        if(a == 5)
            System.out.println("Nilai a sama dengan 5");
        
        System.out.println("\nIf.. 3");
        if(a > 5) {
            System.out.println("Isi variabel a : "+ a);
            System.out.println("Nilai a lebih dari 5");
        }
                
        // Coba IF.
        System.out.println("\nIF..ELSE..");
        if(a < 5) {
            System.out.println("Isi variabel a : "+ a);
            System.out.println("Nilai a kurang dari 5");
        } else System.out.println("Nilai alebih dari atau sama dengan 5");
                
        // Coba IF..ELSE.
        System.out.println("\nIf..ELSE..IF..ELSE.. 1");
        if(a < 5) {
            System.out.println("Nilai a kurang dari 5");
        } else if(a == 5) {
            System.out.println("Nilai a lebih dari 5");
        } else
            System.out.println("\nIF..ELSE IF..ELSE.. 2");
        if(a < 2) {
            System.out.println("Nilai a kurang dari 2");
        } else if(a < 4) {
            System.out.println("Nilai a kurang dari 4");
        } else if(a < 6) {
            System.out.println("Nilai a kurang dari 6");
        } else if(a == 6) {
            System.out.println("Nilai a sama dengan 6");
        } else if(a > 6) {
            System.out.println("Nilai a lebih dari 6");
        }
                     
        // Coba IF..ELSE IF..ELSE.
        System.out.println("\nNested IF");
        if(a < 7) {
            System.out.println("Nilai a kurang dari 7");
            if(a > 2)
                System.out.println("Nilai a lebih dari 2");
            if(a < 4)
                System.out.println("Nilai a kurang dari 4");
        }
        
        // Coba Nested IF.
        System.out.println("\nSWITCH..CASE");
        switch(a) {
            case 1: System.out.println("Nilai a => 1"); break;
            case 2: System.out.println("Nilai a => 1"); break;
            case 3:
            case 4: System.out.println("Nilai a => 3 atau 4"); break;
            case 5: System.out.println("Nilai a => 5"); break;
            default: System.out.println("Nilai a bukan antara 1-5");
        }
        
            int nilai;
            System.out.println("\nNilai Anda ? ");
            nilai = scanner.nextInt();
            
            String grade = (nilai < 75) ? "Belum kompeten" : "Kompeten";
            System.out.println(nilai + " => " + grade);
        
    }
}