/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
public class Vendor
{
  // Fields:
    private int Price;
    private int stockNumber;
   private int despositAmount;
   private int Change;
  

  /**
   * Constructs a Vendor
   * @param price the price of a single item in cents (int)
   * @param stock number of items to place in stock (int)
   */
   public void Vender(int Price, int stockNumber)
   {
       this.Price = Price;
       this.stockNumber = stockNumber;
       
   }
   
   

  /**
   * Sets the quantity of items in stock.
   * @param qty number of items to place in stock (int)
   */
public void setStock(int items)
{
    stockNumber = items;
}


  /**
   * Returns the number of items currently in stock.
   * @return number of items currently in stock (int)
   */
    public int getStock()
    {
        return despositAmount;
    }


  /**
   * Adds a specified amount (in cents) to the
   * deposited amount.
   * @param number of cents to add to the deposit (int)
   */
    public void addMoney(int cents)
    {
        despositAmount = despositAmount + cents;
    }


  /**
   * Returns the currently deposited amount (in cents).
   * @return number of cents in the current deposit (int)
   */
    public int getDesposit(int cents)
    {
        return despositAmount = cents;
    }


  /**
   * Implements a sale.  If there are items in stock and
   * the deposited amount is greater than or equal to
   * the single item price, then adjusts the stock and
   * calculates and sets change, sets deposit to 0 and
   * returns true; otherwise refunds the whole deposit
   * (moves it into change) and returns false.
   * @return true for a successful sale, false otherwise (boolean)
   */
    public boolean makeSale()
    {
    if (stockNumber > 0 && despositAmount >= Price){
    stockNumber--;
    Change = despositAmount - Price;
    despositAmount = 0;
    return true;
    }
    else 
    {
    Change = despositAmount;
    despositAmount = 0;
    return false;
   }
}
   


   
    
    
    


  /**
   * Returns and zeroes out the amount of change (from
   * the last sale or refund).
   * @return number of cents in the current change (int)
   */
   public int getChange()
   {
   int temp = Change;
   Change = 0;
   return temp;
   }
  
}