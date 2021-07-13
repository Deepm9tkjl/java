 import java.util.*;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;
 public class introduc{
  public static void main(String[] args) {
       Stack<Integer>st=new Stack<>();
  st.push(10);
  st.push(20);
  st.push(60);
while(st.size()>0){
    int top=st.peek();
    System.out.println(top);
    st.pop();
}    
}
 }