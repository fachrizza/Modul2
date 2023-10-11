package Bank;

public class bankBeraksi {
    private int saldoSaatIni;
    private int simpanUangg;
    private int saldoSaatInii;
    private int ambilUang;
    private int saldosaatini;
    public void bank (int saldoSaatIni, int simpanUangg, int saldoSaatInii, int ambilUang, int saldosaatini) {
        this.saldoSaatIni = saldoSaatIni;
        this.simpanUangg = simpanUangg;
        this.saldoSaatInii = saldoSaatInii;
        this.ambilUang = ambilUang;
        this.saldosaatini = saldosaatini;
    }
    public void simpanUangg(){
        System.out.println("Simpan uang : " + saldoSaatIni );
        System.out.println("Saldo saat ini : " + simpanUangg );
        System.out.println("Ambil Uang : " + saldoSaatInii );
        System.out.println("Saldo saat ini : " + saldosaatini );
    }
    public void ambilUangg () {
        System.out.println("Saldo saat ini : " + saldoSaatIni );
        System.out.println("Simpan Uang : " + saldoSaatIni );
        System.out.println("Saldo saat ini : " + simpanUangg );
        System.out.println("Ambil Uang : " + saldoSaatInii );
        System.out.println("Saldo saat ini : " + saldosaatini );
    }
    public void getSaldo () {
        System.out.println("Saldo saat ini : " + saldoSaatIni );
        System.out.println("Simpan Uang : " + saldoSaatIni );
        System.out.println("Saldo saat ini : " + simpanUangg );
        System.out.println("Ambil Uang : " + saldoSaatInii );
        System.out.println("Saldo Saat ini : " + saldosaatini );
    }

}
