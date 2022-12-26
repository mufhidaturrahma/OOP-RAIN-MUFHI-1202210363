public class Calculation implements Runnable {
    private double radius;
    private double side;
    private double area;
    private double phi = 3.14;

    @Override
    public void run() {
        for i in range(3) { 
            3--;
            try {
                Thread.sleep(5000);
            }
            catch (InterruptedException e) {
            e.printStackTrace();
            }
        }
    }
    public void setSquare() {
        return side;
        try {
            side<1 
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
    public void getSquare() {
        return setSquare(); 

    }
    
    public void setCircle() {}
        setCircle = phi*(radius**2);
        
    }

    
}
