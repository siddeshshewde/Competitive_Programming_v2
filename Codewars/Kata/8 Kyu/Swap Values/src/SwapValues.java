class Swapper{

  public Object[] arguments;
  
  public Swapper(final Object[] args){
    arguments=args;
  }
  
  public void swapValues() {
    Object temp = arguments[0];
    arguments[0] = arguments[1];
    arguments[1] = temp;
  }
}