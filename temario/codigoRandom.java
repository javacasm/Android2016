int iDibujos[]={R.drawable.conejo,R.drawable.oveja,R.drawable.pollo,
            R.drawable.conejo,R.drawable.oveja,R.drawable.pollo,
            R.drawable.rinoceronte,R.drawable.serpiente,R.drawable.tiburon,
            R.drawable.rinoceronte,R.drawable.serpiente,R.drawable.tiburon
    };

int []iCartas=new int[12];

int nCartasDisponibles()
{
	int nCartasDisponibles=0;
	for(int i=0;i<12;i++)
	{
		if(iCartas[i]==0)
		{
		nCartasDisponibles++;
		}
	}
	return nCartasDisponibles;
}

void reparteCartas()
{
	for(int i=0;i<12;i++)
	{ iCartas[i]=0; }	
	int iDibujoToca=0;

	while(nCartasDisponibles()>0)
	{
		int iCartaAleatoria=(int)(Math.Random()*12);
		if(iCarta[iCartaAleatoria]==0)
		{
			iCartas[iCartaAleatoria]=iDibujos[iDibujoToca];
			iDibujoToca++;
		}
	}




}