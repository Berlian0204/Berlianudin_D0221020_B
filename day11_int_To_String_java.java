
    paket  berlian ;
impor  java.util.* ;
impor  java.security.* ;

 kelas  publik day11_int_To_String_java {
    public  static  void  main ( String [] args ) {
        JanganTerminasi . melarangKeluar();

        coba {
         Pemindai di =  Pemindai baru  ( Sistem . masuk);
         int n = di .nextInt();
         di . menutup();
         // String s=???; Lengkapi baris di bawah ini

         // Tulis kode Anda di sini
         // String s = ""+n;
         // String s = String.nilaiDari(n);
         String s =  Bilangan bulat . toString(n);
         // String s = String.format("%d",n);
         // Bilangan bulat i = n;
         // StringBuilder sb = new StringBuilder();
         // sb.tambahkan(i);
         // String s = sb.toString();



         if (n ==  Integer . parseInt(s)) {
          Sistem . keluar . println( " Kerja bagus " );
         } lain {
          Sistem . keluar . println( " Jawaban salah. " );
         }
        } tangkap ( DoNotTerminate . ExitTrappedException e) {
         Sistem . keluar . println( " Penghentian Gagal!! " );
        }   
    }    
}
// Kelas berikut akan mencegah Anda menghentikan kode menggunakan exit(0)!
kelas  DoNotTerminate {

  kelas statis  publik ExitTrappedException memperluas SecurityException {   

  private  static  final  long serialVersionUID =  1 ;
}

 public  static  void  forbidExit () {
  akhir  SecurityManager securityManager =  baru  SecurityManager () {
   @Mengesampingkan
   public  void  checkPermission ( Izin  izin ) {
    if (izin . getName() . berisi( " exitVM " )) {
     lempar  ExitTrappedException baru  ();
    }
   }
  };
  Sistem . setSecurityManager(securityManager);
}

