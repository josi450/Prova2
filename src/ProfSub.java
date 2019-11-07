public class ProfSub extends Professor {
private String dataTermCont;

public ProfSub( String n, String ce, String dttc){
super (n,ce);
this.setDataTermCont (dttc);
}

public String getDataTermCont(){
	return this.dataTermCont;
}
public void setDataTermCont( String dttc){
	this.dataTermCont=dttc;
}
}
