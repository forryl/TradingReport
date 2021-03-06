package forrester.lynn.trade.report.model;

/**
 * Represents if the Instruction is Buy or Sell
 * 
 * @author Lynn Forrester
 */
public enum BuySell {

  BUY("B"),
  SELL("S");
  
  private String value;
  
  BuySell(final String value){
    this.value = value;
  }
  
  @Override
  public String toString() {
      return value;
  }
  
}
