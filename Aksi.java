package Program02;
import java.util.Scanner;
public class Aksi {
    public static void main(String args[]){
        String NIK,Nama,JenisKelamin;
        int Umur;
        String NIM,Fakultas,Jurusan;
        double tugas1,tugas2,tugas3;
        double UTS, UAS;
        double hasil;
        
        Mahasiswa MHS = new Mahasiswa();
        Scanner SC = new Scanner (System.in);
        
        System.out.println("Masukkan NIK :");
        NIK = SC.nextLine();
        System.out.println("Masukkan Nama Anda :");
        Nama = SC.nextLine();
        System.out.println("Masukkan Jenis Kelamin :");
        JenisKelamin = SC.nextLine();
        System.out.println("Masukkan Umur :");
        Umur = SC.nextInt();
        System.out.println("Masukkan NIM :");
        NIM = SC.nextLine();
        System.out.println("Masukkan Fakultas :");
        Fakultas = SC.nextLine();
        System.out.println("Masukkan Jurusan :");
        Jurusan = SC.nextLine();
        System.out.println("Masukkan TGS1 :");
        tugas1 = SC.nextDouble();
        System.out.println("Masukkan TGS2 :");
        tugas2 = SC.nextDouble();
        System.out.println("Masukkan TGS3 :");
        tugas3 = SC.nextDouble();
        System.out.println("Masukkan UTS :");
        UTS = SC.nextDouble();
        System.out.println("Masukkan UAS :");
        UAS = SC.nextDouble();
        
        MHS.identitas(NIK,Nama,JenisKelamin,Umur);
        MHS.dataMahasiswa(NIM, Fakultas,Jurusan);
        MHS.nilaiMahasiswa(tugas1,tugas2,tugas3,UTS,UAS);
    }
}
