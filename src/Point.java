public class Point implements Comparable{
    private int x;
    private int y;
    private String label;

    public Point(String label, int x, int y){
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public int getX(){ return x; }

    public int getY(){ return y; }

    public String getLabel(){ return label; }
    public boolean equals(Object obj){
        if (obj instanceof Point){
            if((this.getX() == ((Point) obj).getX()) && this.getY() == ((Point) obj).getY()){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return ("Point " + this.getLabel() + " is at x = " + this.getX() + ", y = " + this.getY());
    }
    public int compareTo(Object obj){
        if(obj instanceof Point || obj instanceof ThreeDPoint){
            if (this.getX() > ((Point)obj).getX()){
                return 1;
            } else if (this.getX() < ((Point) obj).getX()) {
                return -1;
            }
        }
        return 0;
    }
}
////