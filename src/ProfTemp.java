public class ProfTemp extends Professor {
private int horasTrab;

public ProfTemp(String n, String ce, int ht){
super(n,ce);
this.setHorasTrab(ht);
}
public int getHorasTrab(){
	return this.horasTrab;
}
public void setHorasTrab(int ht){
	this.horasTrab=ht;
}
}
