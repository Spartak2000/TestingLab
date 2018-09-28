import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TriangleTest {

    @DataProvider(name = "BorderContainerValueForFirstParam")
    public Object[][] getFirstBorderValue() {
        return new Object[][]
                {
                        new Object[]{7.999, 1, 7},
                        new Object[]{8.999, 5, 4},
                        new Object[]{4.999, 2, 3}
                };
    }

    @DataProvider(name = "BorderContainerValueForSecondParam")
    public Object[][] getSecondBorderValue() {
        return new Object[][]
                {
                        new Object[]{1, 7.999, 7},
                        new Object[]{5, 8.999, 4},
                        new Object[]{2, 4.999, 3}
                };
    }


    @DataProvider(name = "BorderContainerValueForThirdParam")
    public Object[][] getThirdBorderValue() {
        return new Object[][]
                {
                        new Object[]{1, 7, 7.999},
                        new Object[]{5, 4, 8.999},
                        new Object[]{2, 3, 4.999}
                };
    }


    @DataProvider(name = "PositiveContainerValue")
    public Object[][] getPositiveValue() {
        return new Object[][]
                {
                        new Object[]{1, 2, 2},
                        new Object[]{3.5, 1, 4},
                        new Object[]{3, 40, 5}
                };
    }


    @DataProvider(name = "NegativeContainerValueForFirstParam")
    public Object[][] getFirstNegativeValue() {
        return new Object[][]
                {
                        new Object[]{-3, 2, 2},
                        new Object[]{-5, 3.5, 4},
                        new Object[]{-7, 2, 1}
                };
    }


    @DataProvider(name = "NegativeContainerValueForSecondParam")
    public Object[][] getSecondNegativeValue() {
        return new Object[][]
                {
                        new Object[]{2, -3, 2},
                        new Object[]{3.5, -5, 4},
                        new Object[]{2, -7, 1}
                };
    }


    @DataProvider(name = "NegativeContainerValueForThirdParam")
    public Object[][] getThirdNegativeValue() {
        return new Object[][]
                {
                        new Object[]{2, 2, -3},
                        new Object[]{3.5, 4, -5},
                        new Object[]{2, 1, -7}
                };
    }


    @DataProvider(name = "NullContainerValueForFirstParam")
    public Object[][] getFirstNullValue() {
        return new Object[][]
                {
                        new Object[]{0, 2, 2},
                        new Object[]{0, 3.5, 4},
                        new Object[]{0, 2, 1}
                };
    }


    @DataProvider(name = "NullContainerValueForSecondParam")
    public Object[][] getSecondNullValue() {
        return new Object[][]
                {
                        new Object[]{2, 0, 2},
                        new Object[]{3.5, 0, 4},
                        new Object[]{2, 0, 1}
                };
    }


    @DataProvider(name = "NullContainerValueForThirdParam")
    public Object[][] getThirdNullValue() {
        return new Object[][]
                {
                        new Object[]{2, 2, 0},
                        new Object[]{3.5, 4, 0},
                        new Object[]{2, 1, 0}
                };
    }


    /**
     * Test constructor with positive data
     */
    @Test(dataProvider = "PositiveContainerValue")
    public void testMethodWithPositiveData(double a, double b, double c) throws Exception {

        Triangle triangle = new Triangle();
        Boolean flag = false;
        if (a < b + c && b < a + c && c < a + b)
            flag = true;
        Assert.assertEquals(triangle.createTriangle(a, b, c), flag);
    }


    /**
     * Test constructor with negative data for first param
     */
    @Test(dataProvider = "NegativeContainerValueForFirstParam")
    public void testMethodWithNegativeDataFirst(double a, double b, double c) throws Exception {

        Triangle triangle = new Triangle();
        Boolean flag = false;
        if (a < 0 || b < 0 || c < 0)
            flag = false;
        else {
            if (a < b + c && b < a + c && c < a + b)
                flag = true;
        }
        Assert.assertEquals(triangle.createTriangle(a, b, c), flag);
    }


    /**
     * Test constructor with negative data for second param
     */
    @Test(dataProvider = "NegativeContainerValueForSecondParam")
    public void testMethodWithNegativeDataSecond(double a, double b, double c) throws Exception {

        Triangle triangle = new Triangle();
        Boolean flag = false;
        if (a < 0 || b < 0 || c < 0)
            flag = false;
        else {
            if (a < b + c && b < a + c && c < a + b)
                flag = true;
        }
        Assert.assertEquals(triangle.createTriangle(a, b, c), flag);
    }


    /**
     * Test constructor with negative data for third param
     */
    @Test(dataProvider = "NegativeContainerValueForThirdParam")
    public void testMethodWithNegativeDataThird(double a, double b, double c) throws Exception {

        Triangle triangle = new Triangle();
        Boolean flag = false;
        if (a < 0 || b < 0 || c < 0)
            flag = false;
        else {
            if (a < b + c && b < a + c && c < a + b)
                flag = true;
        }
        Assert.assertEquals(triangle.createTriangle(a, b, c), flag);
    }



    /**
     * Test constructor with null data for first param
     */
    @Test(dataProvider = "NullContainerValueForSecondParam")
    public void testMethodWithNullDataFirst(double a, double b, double c) throws Exception {

        Triangle triangle = new Triangle();
        Boolean flag = false;
        if (a == 0 || b == 0 || c == 0)
            flag = false;
        else {
            if (a < b + c && b < a + c && c < a + b)
                flag = true;
        }
        Assert.assertEquals(triangle.createTriangle(a, b, c), flag);
    }


    /**
     * Test constructor with null data for second param
     */
    @Test(dataProvider = "NullContainerValueForSecondParam")
    public void testMethodWithNullDataSecond(double a, double b, double c) throws Exception {

        Triangle triangle = new Triangle();
        Boolean flag = false;
        if (a == 0 || b == 0 || c == 0)
            flag = false;
        else {
            if (a < b + c && b < a + c && c < a + b)
                flag = true;
        }
        Assert.assertEquals(triangle.createTriangle(a, b, c), flag);
    }




    /**
     * Test constructor with null data for third param
     */
    @Test(dataProvider = "NullContainerValueForThirdParam")
    public void testMethodWithNullDataThird(double a, double b, double c) throws Exception {

        Triangle triangle = new Triangle();
        Boolean flag = false;
        if (a == 0 || b == 0 || c == 0)
            flag = false;
        else {
            if (a < b + c && b < a + c && c < a + b)
                flag = true;
        }
        Assert.assertEquals(triangle.createTriangle(a, b, c), flag);
    }





    /**
     * Test constructor with border data for first param
     */
    @Test(dataProvider = "BorderContainerValueForFirstParam")
    public void testMethodWithBorderDataFirst(double a, double b, double c) throws Exception {

        Triangle triangle = new Triangle();
        Boolean flag = false;
        if (a < b + c && b < a + c && c < a + b)
            flag = true;
        Assert.assertEquals(triangle.createTriangle(a, b, c), flag);
    }


    /**
     * Test constructor with border data for second param
     */
    @Test(dataProvider = "BorderContainerValueForSecondParam")
    public void testMethodWithBorderDataSecond(double a, double b, double c) throws Exception {

        Triangle triangle = new Triangle();
        Boolean flag = false;
        if (a < b + c && b < a + c && c < a + b)
            flag = true;
        Assert.assertEquals(triangle.createTriangle(a, b, c), flag);
    }


    /**
     * Test constructor with border data for third param
     */
    @Test(dataProvider = "BorderContainerValueForThirdParam")
    public void testMethodWithBorderDataThird(double a, double b, double c) throws Exception {

        Triangle triangle = new Triangle();
        Boolean flag = false;
        if (a < b + c && b < a + c && c < a + b)
            flag = true;
        Assert.assertEquals(triangle.createTriangle(a, b, c), flag);
    }


}
