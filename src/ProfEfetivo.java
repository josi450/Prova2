public class ProfEfetivo extends Professor{
private int tempServico;


public ProfEfetivo (String n, Servidor ce, int ts){
super(n,ce);
this.setTempServico(ts);
}
public int getTempservico(){
return this.tempServico;
}
public void setTempServico( int ts){
this.tempServico=ts;
}
}
