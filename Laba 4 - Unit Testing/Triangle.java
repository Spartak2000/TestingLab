
public class Triangle {

    public Boolean createTriangle(double a, double b, double c) {
        Boolean flag = false;
        if (a < b + c && b < a + c && c < a + b)
            flag = true;
        return flag;
    }
}