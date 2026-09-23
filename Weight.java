public class Weight{
    int pounds;
    int ounces;

    public Weight(int ounces){
        this(ounces, 0);
    }

    public Weight(int pounds, int ounces){
        if (ounces>0){
            if (ounces<16){
                this.ounces=ounces;
            }
        }
        if (pounds>0){
            this.pounds=pounds;
        }
    }

    public int totalOunces(){
        return this.pounds*16+this.ounces;
    }

    public boolean isHeavier(Weight other){
        int totalW=this.totalOunces();
        int otherW = other.totalOunces();
        return totalW>otherW;
    }

    public Weight multiple(int scale){
        int newounces=this.totalOunces()*scale;
        int p = newounces/16;
        int o = newounces % 16;
        return new Weight(p, o);
    }

    public void print(){
        System.out.println(this.pounds + " pounds and " + this.ounces + " ounces");
    }
}
