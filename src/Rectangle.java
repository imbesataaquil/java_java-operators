public class Rectangle {
    int length;
    int width;
    Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    int getArea(){

        return length*width;
    }
     public static void compareArea(Rectangle r1,Rectangle r2){
        int area1=r1.getArea();
        int area2=r2.getArea();
        if(area1 > area2){
            System.out.println("rectangle 1 is greater than rectangle 2");
        }
        else {
            System.out.println("rectangle 2 is greater than rectangle 1");
        }

    }

    public static void main(String[] args) {
        Rectangle r1=new Rectangle(15,9);
        Rectangle r2=new Rectangle(30,15);
        Rectangle.compareArea(r1,r2);
    }
}

