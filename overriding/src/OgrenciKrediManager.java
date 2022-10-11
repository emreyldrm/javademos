public class OgrenciKrediManager extends BaseKrediManager{
    public double hesapla(double tutar){//override yaptik burada hesaplayi ayni imza ile yazdigimiz icin ustune yazabildi.
        return tutar * 1.10;
    }
}
