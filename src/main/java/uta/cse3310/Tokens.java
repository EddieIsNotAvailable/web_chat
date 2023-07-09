package uta.cse3310;

public class Tokens {

  private int tokenBalance;

  Tokens(int tokens)
  {
    if(tokens < 0) tokenBalance = 0;

    tokenBalance = tokens;
  }

  public void transferTokensTo(Tokens receiver, int tokens) throws Exception
  {
    if(tokens < 0 ) throw new Exception("Cannot transfer negative Tokens");
    if(tokens > tokenBalance) throw new Exception("Token spend exceeds balance");

    if( (Integer.MAX_VALUE - tokens) < tokenBalance)
      throw new Exception("Cannot receive Tokens, exceeds integer limit. Token transfer failed");
  
    receiver.tokenBalance += tokens;
    tokenBalance -= tokens;
  }

  public int getTokenBalance() {  return tokenBalance;   }

  @Override
  public String toString() {
    return "" + tokenBalance + "";
  }

}