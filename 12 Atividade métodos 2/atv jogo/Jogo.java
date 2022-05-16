package atvpoometodos2ti;

public class Jogo {
	public String timedacasa;
	public String timevisitante;
	public int golsdotimecasapri;
	public int golsdotimevisipri;
	public int golsdotimecasasegundo;
	public int golsdotimevisisegundo;
	int placar1;
	int placar2;
	
	public int placarfinal() {		
		 placar1 =  golsdotimecasapri + golsdotimecasasegundo;
		 return placar1;
		}
	public int placarfinal1() {
		placar2 = golsdotimevisipri + golsdotimevisisegundo;		
		return placar2;
	}

	@Override
	public String toString() {
		if (placarfinal() > placarfinal1()) {
			return "" + timedacasa + " vence o " + timevisitante + " por " + placarfinal() + "-" + placarfinal1();
		}else 
		return "" + timevisitante + " vence o " + timedacasa + " por " + placarfinal1() + "-" + placarfinal();
	}
}
