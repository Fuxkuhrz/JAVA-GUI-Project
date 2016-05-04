
public class calculator {
    private String strDisPlay="";
    private int Buffer=0;
    private int operator=0;
    
    public String setDisplayOutput(String arg){
    strDisPlay+=arg;
    return strDisPlay;
    }
    //---------------------------------------
    public String ClearDisplay(){
    strDisPlay="";
    return strDisPlay;
    }
    //---------------------------------------
    public String getCalPlus(String arg){
    Buffer+=Integer.parseInt(arg);
    operator=1;
    ClearDisplay();
    return "0";
    }
    //---------------------------------------
    public String getCalMinus(String arg){
    if (Buffer!=0){
        Buffer-=Integer.parseInt(arg);
    }
    else{
        Buffer=Integer.parseInt(arg);
    }
    operator=2;
    ClearDisplay();
    return "0";
    }
    //---------------------------------------
    public String getcalculate(String arg){
    if (operator==1){
    getCalPlus(arg);
    }
    else if (operator==2){
        Buffer-=Integer.parseInt(arg);
    }else if(operator==3){
        getDiv(arg);
    }else if(operator==4){
        getMul(arg);
    }else if(operator==5){
        getMod(arg);
    }
    String answer = String.valueOf( Buffer);
        Buffer=0;
    return answer;
    
    }
    //-----------------------------------------
    public String getDiv(String arg){
    if (Buffer!=0){
        Buffer/=Integer.parseInt(arg);
    }
    else{
        Buffer=Integer.parseInt(arg);
    }
    operator=3;
    ClearDisplay();
    return "0";
    }
    //----------------------------------------
    public String getMul(String arg){
    if (Buffer!=0){
        Buffer*=Integer.parseInt(arg);
    }
    else{
        Buffer=Integer.parseInt(arg);
    }
    
     
    operator=4;
    ClearDisplay();
    return "0";
    }
    //----------------------------------------------------
    public String getMod(String arg){
    if (Buffer!=0){
        Buffer%=Integer.parseInt(arg);
    }
    else{
        Buffer=Integer.parseInt(arg);
    }
    
     
    operator=5;
    ClearDisplay();
    return "0";
    }
    //--------------------------------------------------------
    
}
