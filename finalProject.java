import java.util.Scanner;
/**
 *
 * @author Win10
 */
public class finalProject {
    static int pilihan_menu;
    static Scanner nadia= new Scanner(System.in);
    static char ya = 'y';
    static int nomor;
    static String nama[]={"Andi", "Budi", "Charlie", "Dadang", "Rini"};
    static int nim[]={889901, 889902, 889903, 889904, 889905};
    static String jurusan[]={"Teknologi Informasi", "Teknologi Informasi", "Teknologi Informasi", "Teknologi Informasi", "Teknologi Informasi"};
    static String prodi[]={"D-IV Teknik Informatika", "D-IV Teknik Informatika", "D-III Manajemen Informatika", "D-IV Teknik Informatika", "D-III Manajemen Informatika"};
    static String matakuliah[]={"1. Dasar Pemrograman", "2. Konsep TI", "3. K3", "4. Matematika Diskrit", "5. Bahasa Inggris"};
    static int nilaidaspro[]={}, nilaikti[]={}, nilaik3[]={}, nilaimatdis[]={}, nilaibing[]={}, rata[]={};
    static void tampilan_awal(){
        menu_utama();
    }
    
    static void menu_utama(){
        System.out.println("======================================");
	System.out.println("        KARTU HASIL STUDI MAHASISWA");
	System.out.println("======================================");
        System.out.println("[1] DATA MAHASISWA");
        System.out.println("[2] MATA KULIAH");
        System.out.println("[3] INPUT / KELOLA NILAI");
        System.out.println("[4] CETAK KHS");
        System.out.println("[5] NILAI PER MATA KULIAH");
        System.out.println("______________________________________");
        pilihan_menu();
    }
    
    static void pilihan_menu(){
        System.out.print("Pilih menu: ");
        pilihan_menu = nadia.nextInt();
        
        switch(pilihan_menu){
            case 1:
                data_mahasiswa();
                break;
            case 2:
                mata_kuliah();
                break;
            case 3:
                input_nilai();
                break;
            case 4:
                cetak_khs();
                break;
            case 5:
                nilai_perMatkul();
                break;
        }
    }
    
    static void data_mahasiswa(){
        System.out.println("======================================");
	System.out.println("                DATA MAHASISWA");
	System.out.println("======================================");
        
        for (int i=0;i<nama.length; i++){
            System.out.println("Nama    : "+nama[i]);
            System.out.println("Nim     : "+nim[i]);
            System.out.println("Jurusan : "+jurusan[i]);
            System.out.println("Prodi   : "+prodi[i]);
            System.out.println("______________________________________");
        }
            System.out.println("--------------------------------------");
            System.out.print("Kembali ke menu? [y/n]: ");
            ya = nadia.next().charAt(0);
        
    }
    
    static void mata_kuliah(){
        System.out.println("======================================");
        System.out.println("                MATA KULIAH     ");
        System.out.println("======================================");
        
        for (int i=0;i<nama.length; i++){
            System.out.println(matakuliah[i]);
        }
            System.out.println("---------------------------------");
            System.out.print("Kembali ke menu? [y/n]: ");
            ya = nadia.next().charAt(0);
    }
    
    static void input_nilai(){
        System.out.println("======================================");
        System.out.println("        INPUT DAN KELOLA NILAI     ");
        System.out.println("======================================");
        System.out.println();
        
        nilaidaspro=new int[nama.length];
        nilaikti=new int[nama.length];
        nilaik3=new int[nama.length];
        nilaimatdis=new int[nama.length];
        nilaibing=new int[nama.length];
        rata=new int[nama.length];
        for(int i=0;i<nama.length;i++){
            System.out.println(">>>>>>>>>>>>>> Nilai "+nama[i]+" <<<<<<<<<<<<<<");
            System.out.print("Masukkan nilai Dasar Pemrograman "+nama[i]+" : ");
            nilaidaspro[i]=nadia.nextInt();
            System.out.print("Masukkan nilai Konsep TI "+nama[i]+" : ");
            nilaikti[i]=nadia.nextInt();
            System.out.print("Masukkan nilai K3 "+nama[i]+" : ");
            nilaik3[i]=nadia.nextInt();
            System.out.print("Masukkan nilai Matematika Diskrit "+nama[i]+" : ");
            nilaimatdis[i]=nadia.nextInt();
            System.out.print("Masukkan milai Bahasa Inggris "+nama[i]+" : ");
            nilaibing[i]=nadia.nextInt();
            System.out.println();
        }
        System.out.println("---------------------------------");
            System.out.print("Kembali ke menu? [y/n]: ");
            ya = nadia.next().charAt(0);    
    }
    
    static void rata(){
        rata=new int[nama.length];
        for(int i=0;i<nama.length;i++){        
    rata[i]=(nilaidaspro[i]+nilaikti[i]+nilaik3[i]+nilaimatdis[i]+nilaibing[i])/5;
        }
        }
    
    static void cetak_khs(){
        rata();
            System.out.println("======================================");
            System.out.println("                CETAK KHS           ");
            System.out.println("======================================");
            System.out.println();
            
        for(int i=0; i<nama.length; i++){
        System.out.println("______________________________________");
        System.out.println("Nama    : "+nama[i]);
        System.out.println("Nim     : "+nim[i]);
        System.out.println("Jurusan : "+jurusan[i]);
        System.out.println("Prodi   : "+prodi[i]);
        System.out.println("Nilai Rata-Rata : "+rata[i]);
        System.out.println("--------------------------------------");
        }
        
        System.out.print("Kembali ke menu? [y/n]: ");
            ya = nadia.next().charAt(0);
    }
    
    static void nilai_perMatkul(){
            System.out.println("======================================");
            System.out.println("            NILAI PER MATA KULIAH");
            System.out.println("======================================");
            System.out.println();
        System.out.println("Nama"+"\t\t"+"Dasar Pemrograman"+"\t\t"+"Konsep TI"+
            "\t\t"+"K3"+"\t\t"+"Matematika Diskrit"+"\t\t"+"Bahasa Inggris");
        
        for(int i=0; i<nama.length; i++){
            System.out.println(nama[i]+"\t\t"+nilaidaspro[i]+"\t\t\t\t"+nilaikti[i]+
                "\t\t\t"+nilaik3[i]+"\t\t"+nilaimatdis[i]+"\t\t\t\t"+nilaibing[i]);
        }
        System.out.print("Kembali ke menu? [y/n]: ");
            ya = nadia.next().charAt(0);
        }
    
    public static void main(String[] args) {
        while(ya=='y' || ya=='Y'){
         tampilan_awal();        
         menu_utama();
        }
        
    }
    
}
