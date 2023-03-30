public class ThreeDPoint extends Point {
    private int z;

    public ThreeDPoint(String label, int x, int y, int z){
        super(label, x, y);
        this.z = z;
    }

    public int getZ(){ return z; }

    public boolean equals(Object obj){
        if (obj instanceof ThreeDPoint){
            if(super.equals(obj) == true){
                if (this.getZ() == ((ThreeDPoint) obj).getZ()){
                    return true;
                }
            }
        }
        return false;
    }

    public String toString(){
        return ("Point " + this.getLabel() + " is at x = " + this.getX() + ", y = " + this.getY() + ", z = " + this.getZ());
    }
}
