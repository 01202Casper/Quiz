public class input {
    String nama,alamat,telp,email,ket,jasa,alat,bahan,trans;
    
    public input(String nama,String alamat,String telp,String email,String ket,String jasa,String alat,String bahan,String trans) {
        this.nama         = nama;
        this.alamat       = alamat;
        this.telp         = telp;
        this.email        = email;
        this.ket          = ket;
        this.jasa         = jasa;
        this.alat         = alat;
        this.bahan        = bahan;
        this.trans        = trans;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public String getTlp() {
        return telp;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getKet() {
        return ket;
    }
    
    public String getJasa() {
        return jasa;
    }
    
    public String getAlat() {
        return alat;
    }
    
    public String getBahan() {
        return bahan;
    }
    
    public String getTransportasi() {
        return trans;
    }
}
