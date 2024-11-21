
    public class kopek extends hayvan{
    private int dis_sayisi;

        public kopek(String ismi,int bacaksayisi,int boy,int kilo,int dis_sayisi){

        super(ismi,bacaksayisi,kilo,boy);
        this.dis_sayisi=dis_sayisi;
}
        public void hareketegec(int hiz){
        System.out.println("kopek " +hiz+" ile kosuyor");
}
        public void kos(int hiz){
    
        System.out.println("kopek kosuyor...");
        hareketegec(hiz);       //super.harekete gec yazinca haycvan clasından aliyor sadece
                                //hareketegec yazinca ise overriding olup burdan aliyot overriding etmek daha guvenli
    }

    /**
     * @return the dis_sayisi
     */
            public int getDis_sayisi() {
                return dis_sayisi;
    }

    /**
     * @param dis_sayisi the dis_sayisi to set
     */
            public void setDis_sayisi(int dis_sayisi) {
                this.dis_sayisi = dis_sayisi;
    }
}
