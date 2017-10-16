package Shop;

import Cart.Cart;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!!!" );
        Cart cart = new Cart(1, "xxx", 2, 4, 25);

        System.out.println(cart.getNameOfProduct());
    }
}
