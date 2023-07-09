package uta.cse3310;


public class Account {

  private String username;
  private String password;
  private Tokens tokens;

  Account(String _username, String _password, Tokens _tokens) {
    username = _username;
    password = _password;
    tokens = _tokens;
  }

  Account(String _username, String _password, int _tokens) {
    username = _username;
    password = _password;
    tokens = new Tokens(_tokens);
  }

  public String getAccountName()    {   return username;  }
  public String getAccountPassword()   {   return password;     }
  public Tokens getAccountTokens()  {   return tokens;    }

  @Override
  public String toString() {
    return username + " (" + tokens.getTokenBalance() + ")";
  }
  
}
